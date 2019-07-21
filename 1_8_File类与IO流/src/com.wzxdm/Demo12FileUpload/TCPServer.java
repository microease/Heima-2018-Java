package src.com.wzxdm.Demo12FileUpload;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class TCPServer {
    /*
     * 文件上传案例服务器端，读取客户端上传的文件
     * */
    public static void main(String[] args) throws IOException {
        //1 创建一个服务器ServerSocket对象，和系统要指定的端口号
        ServerSocket server = new ServerSocket(8888);
        //让服务器一直处于监听状态
        while (true) {
            //2 使用ServerSocket对象中的方法accept，获取请求的客户端socket对象。
            Socket socket = server.accept();
//          使用多线程技术，提高程序的效率，有一个客户端上传，就开启一个线程，完成文件的上传
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try{
                        //3 使用socket对象中的方法getInputStream，获取到网络字节输入流InputStream对象
                        InputStream is = socket.getInputStream();
                        //4 判断文件夹是否存在，不存在则创建
                        File file = new File("C:\\Users\\microease\\Documents\\GitHub\\Heima-2018-Java\\1_8_File类与IO流\\src\\com.wzxdm\\Demo12FileUpload");
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        //5 创建一个本地字节输出流FileOutputStream对象，构造方法中绑定要输出的目的地。
//        FileOutputStream fos = new FileOutputStream(file + "\\1.jpg");
                        String fileName = "\\microease" + System.currentTimeMillis() + new Random().nextInt(99999) + ".jpg";
                        FileOutputStream fos = new FileOutputStream(file + fileName);
                        //6 使用网络字节输入流InputStream对象中的方法read，读取客户端上传的文件
                        int len = 0;
                        byte[] bytes = new byte[1024];
                        while ((len = is.read(bytes)) != -1) {
                            //7 使用本地字节输出流FileOutputStream中的方法write，把读取的文件保存在服务器的硬盘上
                            fos.write(bytes, 0, len);
                        }
                        //8 使用socket对象中的方法，getOutputStream，获取到网络字节输出流OutputStream对象
                        //9 使用网络字节输出流OutputStream对象中的方法write，给客户端回写“上传成功”
                        socket.getOutputStream().write("上传成功".getBytes());
                        fos.close();
                        socket.close();
                    }catch (IOException e){
                        System.out.println(e);
                    }
                }
            }).start();

        }
//        server.close();
    }
}
