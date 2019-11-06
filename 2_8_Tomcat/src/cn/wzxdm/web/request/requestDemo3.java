package cn.wzxdm.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet("/RequestDemo1")
public class requestDemo3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取请求头数据
        String agent = request.getHeader("user-agent");
        if(agent.contains("Chrome")){
            //谷歌
            System.out.println();
        }else if(agent.contains("Firefox")){
            //火狐
            System.out.println("火狐浏览器");
        }
    }
}
