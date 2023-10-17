<%--
  Created by IntelliJ IDEA.
  User: LeXxA
  Date: 10/17/2023
  Time: 14:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Transfer money</title>
</head>
<body>
<h2>Transfer money</h2>
<form action="/transfer" method="POST">
  <label for="account1">Enter sender account ID (you can find it in list of accounts):</label>
  <br>
  <input type="text" name="senderAccountIdInput" id="account1">
  <br><br>
  <label for="pin">Enter sender account PIN code:</label>
  <br>
  <input type="text" name="pinInput" id="pin">
  <br><br>
  <label for="account2">Enter receiver account ID:</label>
  <br>
  <input type="text" name="receiverAccountIdInput" id="account2">
  <br><br>
  <label for="amount">Enter amount of money to transfer:</label>
  <br>
  <input type="text" name="transferAmountInput" id="amount">
  <br><br>
  <input type="submit" value="Submit!">
</form>
<h3>
  <a href="/">Back to Homepage</a>
</h3>
</body>
</html>
