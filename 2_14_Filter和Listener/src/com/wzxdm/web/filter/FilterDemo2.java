package com.wzxdm.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//@WebFilter("/*")
public class FilterDemo2 implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("filtdemo2...");
        chain.doFilter(req, resp);
        System.out.println("filterdemo2执行了");
    }

    public void init(FilterConfig config) throws ServletException {

    }


}
