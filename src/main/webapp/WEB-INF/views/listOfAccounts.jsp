<%--
  Created by IntelliJ IDEA.
  User: LeXxA
  Date: 10/17/2023
  Time: 9:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head>
    <title>AccountsList</title>
</head>
<body>
<h2>Bank Accounts</h2>

<c:choose>
    <c:when test="${fn:length(accountsList) > 0}">
        <table>
            <tr>
                <th>Account name</th>
                <th>balance</th>
            </tr>
            <c:forEach var="account" items="${accountsList}">
                <tr>
                    <td>${account.name}</td>
                    <td>${account.balance}</td>
                </tr>
            </c:forEach>
        </table>
    </c:when>
    <c:otherwise>
        <h4>No bank accounts found</h4>
    </c:otherwise>
</c:choose>

<h3>
    <a href="/">Back to Homepage</a>
</h3>

</body>
</html>
