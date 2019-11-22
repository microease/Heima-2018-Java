<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %><%--
  Created by IntelliJ IDEA.
  User: micro
  Date: 2019/11/21
  Time: 23:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    //设置响应消息体格式和编码
    resp.setContentType("text/html;charset=utf-8");
    //1 获取所有cookie
    Cookie[] cookies = req.getCookies();
    //2 遍历cookie数组
    if (cookies != null && cookies.length > 0) {
        for (Cookie cookie : cookies) {
            // 获取cookie的名称
            String name = cookie.getName();
            //判断名称是否是lastTime
            if ("lastTime".equals(name)) {
                //不是第一次访问
                //获取当前时间的字符串，重新设置cookie的值，重新发送cookie
                Date date = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
                String str_date = sdf.format(date);
                cookie.setValue(str_date);
                //设置cookie的存活时间
                cookie.setMaxAge(60 * 60 * 24 * 30);
                resp.addCookie(cookie);
                //获取cookie的value,时间
                String value = cookie.getValue();
                resp.getWriter().write("欢迎回来，您上次的访问时间为" + value);
                break;
            }
        }
    }
%>
</body>
</html>
