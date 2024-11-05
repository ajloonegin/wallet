
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Transactions Information</title>
    <style>
        table {
            width: 80%;
            border-collapse: collapse;
            margin: 20px 0;
        }
        th, td {
            border: 1px solid #ddd;
            padding: 8px;
        }
        th {
            background-color: #f2f2f2;
            text-align: left;
        }
    </style>
</head>
<body>
<h2>List of Transactions</h2>

<c:if test="${not empty transaction}">
    <table>
        <tr>
            <th>Source Account Number</th>
            <th>Destination Account Number</th>
            <th>Operation</th>
            <th>Amount</th>
            <th>Date</th>
        </tr>
        <c:forEach var="tran" items="${transaction}">
            <tr>
                <td>${tran.sourceAccountNumber}</td>
                <td>${tran.destinationAccountNumber}</td>
                <td>${tran.operation}</td>
                <td>${tran.amount}</td>
                <td><fmt:formatDate value="${tran.date}" pattern="yyyy-MM-dd" /></td>
            </tr>
        </c:forEach>
    </table>
</c:if>

<c:if test="${empty transaction}">
    <p>No transactions available.</p>
</c:if>

</body>
</html>

