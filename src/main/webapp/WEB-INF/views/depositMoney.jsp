<%--
  Created by IntelliJ IDEA.
  User: LeXxA
  Date: 10/17/2023
  Time: 11:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Deposit money</title>
</head>
<body>
<h2>Deposit money</h2>
<form action="/deposit" method="POST">
    <label for="accountId">Enter account ID (you can find it in list of accounts):</label>
    <br>
    <input type="text" name="accountIdInput" id="accountId">
    <br><br>
    <label for="amount">Enter amount of money to deposit:</label>
    <br>
    <input type="text" name="depositAmountInput" id="amount">
    <br><br>
    <input type="submit" value="Submit!">
</form>
<h3>
    <a href="/">Back to Homepage</a>
</h3>
</body>
</html>
