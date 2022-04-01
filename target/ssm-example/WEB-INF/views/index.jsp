<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022/4/1
  Time: 12:57
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
    <c:forEach var="user" items="${userList}">
        <ul>
            <li>${user}</li>
        </ul>
    </c:forEach>
</body>
</html>
