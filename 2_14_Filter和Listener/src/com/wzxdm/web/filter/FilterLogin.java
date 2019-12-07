package com.wzxdm.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
// 完成登录验证的过滤器
@WebFilter("/*")
public class FilterLogin implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        // 0 强制转换
        HttpServletRequest request = (HttpServletRequest) req;
        //1 获取资源请求路径
        String requestURI = ((HttpServletRequest) req).getRequestURI();
        //2 判断是否包含登录相关资源路径
        if(requestURI.contains("/login.jsp") || requestURI.contains("/loginServlet")){
            //包含，用户就是想登录，放行。
            chain.doFilter(req,resp);
        }else {
            //不包含，需要验证用户是否登录。
            //从session获取user
            Object user = ((HttpServletRequest) req).getSession().getAttribute("user");
            //如果用户已经登录
            if (user!=null){
                chain.doFilter(req,resp);
            }else{
                //没有登录，跳转登录页面
                req.setAttribute("login_msg","您尚未登陆，请先登录");
                req.getRequestDispatcher("/login.jsp").forward(req,resp);
            }
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
