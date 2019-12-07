package com.wzxdm.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

//敏感词汇过滤器
@WebFilter(filterName = "SensitiveFilter")
public class SensitiveFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        //创建代理对象，增强getParameter方法
        Proxy.newProxyInstance(req.getClass().getClassLoader(), req.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //增强getParameter方法
                //判断是否是getParmeter方法
                if (method.getName().equals("getParmeter")) {
                    //增强返回值
                    //获取返回值
                    String value = (String) method.invoke(req, args);
                    if(value != null){
                        for (String s : list) {
                            if(value.contains(s)){
                           value = value.replaceAll(s,"***");
                            };
                        }
                    }
                    return value;
                }
                return method.invoke(req, args);
            }
        });
        chain.doFilter(req, resp);
    }

    private List<String> list = new ArrayList<>();//敏感词汇集合

    public void init(FilterConfig config) throws ServletException {
        try {
//加载文件
            //获取文件的真实路径
            ServletContext servletContext = config.getServletContext();
            servletContext.getRealPath("/WEB-INF/classes/敏感词汇.txt");
            //读取文件
            BufferedReader br = new BufferedReader(new FileReader(realpath));
            // 将文件的每一行数据读取到list中
            String line = null;
            while ((line = br.readLine()) != null) {
                list.add(line);
                br.close();
                System.out.println(list);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
