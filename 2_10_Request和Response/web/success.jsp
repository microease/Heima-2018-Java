<%--
  Created by IntelliJ IDEA.
  User: micro
  Date: 2019/11/23
  Time: 0:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1><%=request.getSession().getAttribute("user")%>,欢迎您</h1>
</body>
</html>
