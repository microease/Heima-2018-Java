package cn.wzxdm.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/RequestDemo1")
public class requestDemo4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取请求头数据refer
        String refer = request.getHeader("refer");
        System.out.println(refer);
        if (refer != null) {
            if (refer.contains("/day14")) {
                //正常访问
                System.out.println("正常访问");
                response.getWriter().write("正常访问");
            } else {
                System.out.println("盗链");
            }
        }

    }
}
