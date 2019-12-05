package src.com.wzxdm;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "findUserBypageServlet")
public class FindUserBypageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    //获取参数:当前页和
        String currentPage = request.getParameter("currentPage");//当前页码
        String rows = request.getParameter("rows");//每一页显示的条数
        //调用service来查询
        UserService service = new UserServiceImpl();
        PageBean<User> pb = service.findUserByPage(currentPage,rows);
        //3 将pageBean存入request
        request.setAttribute("pb",pb);
        //转发到pb
        request.getRequestDispatcher("list.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
