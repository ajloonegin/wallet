
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Withdraw</title>
</head>
<body>
<h2>Withdraw</h2>
<%--@elvariable id="withdrawInputDto" type=""--%>
<form:form modelAttribute="withdrawInputDto" method="post" action="${pageContext.request.contextPath}/home/userpanel/withdraw/result">
    <table>
        <tr>
            <td><form:label path="accountNumber">Account Number:</form:label></td>
            <td><form:input path="accountNumber" /></td>
        </tr>
        <tr>
            <td><form:label path="amount">Amount:</form:label></td>
            <td><form:input path="amount" /></td>
        </tr>

        <tr>
            <td colspan="2"><input type="submit" value="Withdraw" /></td>
        </tr>
    </table>
</form:form>

</body>