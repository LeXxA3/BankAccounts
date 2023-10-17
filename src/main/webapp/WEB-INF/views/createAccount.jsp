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
<h2>Account creation</h2>
<form action="/createAccount" method="POST">
  <label for="accountName">Enter account name:</label>
  <br>
  <input type="text" name="name" id="accountName">
  <br><br>
  <label for="pin Code">Enter 4-digit PIN code</label>
  <br>
  <input type="text" name="pinCode" id="pin Code">
  <br><br>
  <input type="submit" value="Create account">
</form>
<h3>
  <a href="/">Back to Homepage</a>
</h3>
</body>
</html>
