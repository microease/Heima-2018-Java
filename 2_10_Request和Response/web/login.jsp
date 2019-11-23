<%--
  Created by IntelliJ IDEA.
  User: micro
  Date: 2019/11/22
  Time: 22:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <script></script>
</head>
<body>
<h1><%=request.getSession().getAttribute("login_error") == null ? "" : request.getSession().getAttribute("login_error")%>
    ,欢迎您</h1>
<h1><%=request.getSession().getAttribute("cc_error") == null ? "" : request.getSession().getAttribute("login_error")%>
    ,</h1>
<form action="/day16/loginServlet" method="post">
    <table>
        <tr>
            <td>用户名</td>
            <td><input type="text" name="username"></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="text" name="password"></td>
        </tr>
        <tr>
            <td colspan="2"><img id="img" src="/day16/checkCodeServlet" alt=""></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="登录"></td>
        </tr>
    </table>
</form>
</body>
</html>
