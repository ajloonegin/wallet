
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Deposit</title>
</head>
<body>
<h2>Deposit</h2>
<%--@elvariable id="depositInputDto" type=""--%>
<form:form modelAttribute="depositInputDto" method="post" action="${pageContext.request.contextPath}/home/userpanel/deposit/result">
    <table>
        <tr>
            <td><form:label path="destinationAccountNumber">Destination Account Number:</form:label></td>
            <td><form:input path="destinationAccountNumber" /></td>
        </tr>
        <tr>
            <td><form:label path="amount">Amount:</form:label></td>
            <td><form:input path="amount" /></td>
        </tr>

        <tr>
            <td colspan="2"><input type="submit" value="Deposit" /></td>
        </tr>
    </table>
</form:form>

</body>