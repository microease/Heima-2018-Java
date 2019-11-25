<%@ page import="src.com.wzxdm.User" %>
<%@ page import="com.mysql.fabric.xmlrpc.base.Data" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: micro
  Date: 2019/11/24
  Time: 20:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el获取数据</title>
</head>
<body>
<%
    User user = new User();
    user.setName("张三");
    user.setAge(23);
    user.setBirthday(new Data());
    request.setAttribute("u", user);
    List list = new ArrayList();
    list.add("aaa");
    list.add("bbb");
    request.setAttribute("list",list);
%>
<%--    获取数据--%>
<h3>el获取对象中的值</h3>
${requestScope.u.name}
${u.list.}
</body>
</html>
