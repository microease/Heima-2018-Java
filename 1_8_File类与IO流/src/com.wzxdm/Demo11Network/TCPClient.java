package src.com.wzxdm.Demo11Network;
//客户端：向服务器发送连接请求，给服务器发送数据，读取服务器数据

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        //1 创建一个客户端对象Socket，构造方法绑定服务器的IP地址和端口号
        Socket socket = new Socket("127.0.0.1",8888);
        //2 使用Socket对象中的方法getOutputStream获取网络字节输出流OutputStream对象
        OutputStream outputStream = socket.getOutputStream();
        //3 使用网络字节输出流OutputStream对象中的方法write，给服务器发送数据
        outputStream.write("你好，服务器".getBytes());

        //4 使用Socket对象中的方法getInputStream获取网络字节输入流InputStream对象
        //5 使用网络字节输入流InputStream对象中的方法read，读取服务器回写的数据
        //6 释放资源
        socket.close();
    }
}
