package src.web.yzm;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
/*
* 案例需求
* 1 访问带有验证码的登陆页面login.jsp
* 2 用户输入用户名，密码，验证码
*   如果用户名和密码输入错误，跳转登录页面，提示输入错误
*   如果验证码输入错误，跳转登录页面，提示验证码错误
*   如果都输入正确，跳转主页success.jsp，显示用户名，欢迎
*
* */
@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置request编码
        request.setCharacterEncoding("utf-8");
        // 获取参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String checkCode = request.getParameter("checkCode");
        //先获取生成的验证码
        HttpSession session = request.getSession();
        String checkCode_session = (String) session.getAttribute("checkCode_session");
        //删除session中存储的验证码
        session.removeAttribute("checkCode_session");
        //判断验证码是否正确
        if(checkCode_session.equalsIgnoreCase(checkCode)){
            //忽略大小写比较字符串
            session.setAttribute("user",username);
            //判断用户名和密码是否一致
            if("zhangsan".equals(username)&& "123".equals(password)){
                //都填对了
                response.sendRedirect(request.getContextPath()+"/success.jsp");
            }else{
                //用户名或密码错误，登录失败
                request.setAttribute("login_error","用户名或密码错误，登录失败");
                request.getRequestDispatcher("/login.jsp").forward(request,response);
            }
        }else{
             //验证码不一致
            request.setAttribute("cc_error","验证码错误");
            //转发到登录页面
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
