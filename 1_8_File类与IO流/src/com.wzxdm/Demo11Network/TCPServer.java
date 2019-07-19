package src.com.wzxdm.Demo11Network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        //1 创建服务器ServerSocket对象和系统要指定的端口号
        ServerSocket server = new ServerSocket(8888);
        //2 使用ServerSocket对象中的方法accept，获取到请求的客户端对象Socket
        Socket socket = server.accept();
        //3 使用Socket对象中的方法getInputStream获取网络字节输入流对象InputStream对象
        InputStream inputStream = socket.getInputStream();
        //4 使用网络字节输入流InputStream对象中的方法read，读取客户端发送的数据
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);
        System.out.println(new String(bytes,0,len));
        //5 使用Socket对象中的方法getOutputStream获取网络字节输出流OutputStream
        OutputStream os = socket.getOutputStream();
        //6 使用网络字节输出流对象中的方法write，给客户端回写数据
        os.write("受到谢谢".getBytes());
        //7 释放资源
        socket.close();
        server.close();
    }
}
