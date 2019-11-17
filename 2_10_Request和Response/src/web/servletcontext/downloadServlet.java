package src.web.servletcontext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@WebServlet(name = "/servletContextDemo5")
public class downloadServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求参数，文件名称
        String filename = req.getParameter("filename");
        //使用字节输入流加载文件进内存
        //找到文件服务器路径
        ServletContext servletContext = this.getServletContext();
        String realPath = servletContext.getRealPath("/img/" + filename);
        //用字节流关联
        FileInputStream fis = new FileInputStream(realPath);
        //设置response 响应头
        //设置响应头类型 content-type
        String mimeType = servletContext.getMimeType(filename);//获取文件的mime类型
        resp.setHeader("content-type",mimeType);
        //设置响应头打开方式 content-disposition
        resp.setHeader("cotent-disposition","attachment;filename=jpg");
        //将输入流的数据写出到输出流中
        ServletOutputStream sos = resp.getOutputStream();
        byte[] buff = new byte[1024 * 8];
        int len = 0;
        while ((len = fis.read(buff)) != -1) {
            sos.write(buff, 0, len);
        }
        fis.close();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }
}

