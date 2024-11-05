<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Account Information</title>
</head>
<body>
<h2>Account Information</h2>
<table>
    <tr>
        <td>Account Number:</td>
        <td>${account.accountNumber}</td>
    </tr>
    <tr>
        <td>Account Balance:</td>
        <td>${account.accountBalance}</td>
    </tr>

    <tr>
        <td>Date of Create:</td>
        <td><fmt:formatDate value="${account.dateOfCreate}" pattern="yyyy-MM-dd" /></td>
    </tr>

    <tr>
        <td>Shaba Number:</td>
        <td>${account.shabaNumber}</td>
    </tr>


</table>
</body>
</html>
