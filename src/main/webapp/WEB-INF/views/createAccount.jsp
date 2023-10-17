<%--
  Created by IntelliJ IDEA.
  User: LeXxA
  Date: 10/16/2023
  Time: 14:58
  To change this template use File | Settings | File Templates.
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create Account</title>
</head>
<body>
<form action="/createAccount" method="POST">
  <label for="name">Enter account name:</label>
  <br>
  <input type="text" name="name" id="name">
  <br><br>
  <label for="pin Code">Enter PIN code</label>
  <br>
  <input type="text" name="pinCode" id="pin Code">
  <br><br>
  <input type="submit" value="Create account">
</form>

</body>
</html>
