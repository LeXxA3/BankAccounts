<%--
  Created by IntelliJ IDEA.
  User: LeXxA
  Date: 10/17/2023
  Time: 13:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Withdraw money</title>
</head>
<body>
<h2>Withdraw money</h2>
<form action="/withdraw" method="POST">
  <label for="accountId">Enter account ID (you can find it in list of accounts):</label>
  <br>
  <input type="text" name="accountIdInput" id="accountId">
  <br><br>
  <label for="pin">Enter account PIN code:</label>
  <br>
  <input type="text" name="pinInput" id="pin">
  <br><br>
  <label for="amount">Enter amount of money to withdraw:</label>
  <br>
  <input type="text" name="withdrawAmountInput" id="amount">
  <br><br>
  <input type="submit" value="Submit!">
</form>
  <h3>
    <a href="/">Back to Homepage</a>
  </h3>
</body>
</html>
