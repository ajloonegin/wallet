
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Transfer</title>
</head>
<body>
<h2>Transfer</h2>
<%--@elvariable id="transferInputDto" type=""--%>
<form:form modelAttribute="transferInputDto" method="post" action="${pageContext.request.contextPath}/home/userpanel/transfer/result">
    <table>
        <tr>
            <td><form:label path="sourceAccountNumber">Source Account Number:</form:label></td>
            <td><form:input path="sourceAccountNumber" /></td>
        </tr>
        <tr>
            <td><form:label path="destinationAccountNumber">Destination Account Number:</form:label></td>
            <td><form:input path="destinationAccountNumber" /></td>
        </tr>

        <tr>
            <td><form:label path="amount">Amount:</form:label></td>
            <td><form:input path="amount" /></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Transfer" /></td>
        </tr>
    </table>
</form:form>

</body>