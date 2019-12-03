package src.com.wzxdm;

import org.springframework.beans.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Map;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //设置编码
        req.setCharacterEncoding("utf-8");
        //获取数据
        //获取用户输入的验证码
        String verifycode = req.getParameter("verifycode");
        //验证码校验
        HttpSession session = req.getSession();
        String checkcode_server = (String) session.getAttribute("CHECKCODE_SERVER");
        if(!checkcode_server.equalsIgnoreCase(verifycode)){
            //如果验证码不正确
            req.setAttribute("login_msg","验证码错误");
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
            return;
        }
        Map<String, String[]> parameterMap = req.getParameterMap();
        //封装User对象
        User user = new User();
        try{
            BeanUtils.populate(user,map);
        }
        //调用Service查询
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
