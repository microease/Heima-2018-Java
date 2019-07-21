package src.com.wzxdm.Demo13Web;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        //创建一个服务器ServerSocket，和系统要指定的端口号
        ServerSocket server = new ServerSocket(8080);
        //使用accept方法获取到请求的客户端对象（浏览器）
        Socket socket = server.accept();
        //使用socket对象中的方法getInputStream，获取到网络字节输入流InputStream
        InputStream is = socket.getInputStream();
        //使用网络字节输入流InputStream对象中的方法read读取客户端的请求信息
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len=is.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
    }
}
