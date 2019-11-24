<%--
  Created by IntelliJ IDEA.
  User: micro
  Date: 2019/11/24
  Time: 18:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>el获取域中的数据</title>
</head>
<body>
    <%
        //在域中存储数据
        request.setAttribute("name","zhangsan");
    %>
<h3>el获取值</h3>
${requestScope.name} //cic
</body>
</html>
