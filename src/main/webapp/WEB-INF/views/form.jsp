<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 14/07/2021
  Time: 12:28 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/convert" method="post">
    <table>
        <tr>
            <td>English</td>
            <td></td>
            <td>Vietnamese</td>
        </tr>
        <tr>
            <td><input type="text" name="vn" value="${search}"></td>
            <td><button type="submit">Translate</button></td>
            <td>${result}</td>
        </tr>
    </table>
</form>
</body>
</html>
