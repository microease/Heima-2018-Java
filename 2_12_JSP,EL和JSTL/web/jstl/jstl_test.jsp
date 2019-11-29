<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="src.com.wzxdm.User" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: micro
  Date: 2019/11/29
  Time: 15:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    List list = new ArrayList();
    list.add(new User("张三", 23, new Date()));
    list.add(new User("张三", 23, new Date()));
    list.add(new User("张三", 23, new Date()));
    request.setAttribute("list", list);

%>
<table>
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>年龄</th>
        <th>生日</th>
    </tr>
    <c:forEach items="${list}" var="user" varStatus="s">
        <tr>
            <td>${s.count}</td>
            <td>${user.name}</td>
            <td>${user.age}</td>
            <td>${user.birStr}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
