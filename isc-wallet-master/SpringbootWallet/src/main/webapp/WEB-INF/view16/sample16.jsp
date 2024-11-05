
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>List Of Transaction</title>
</head>
<body>
<h2>List Of Transaction</h2>
<%--@elvariable id="transactionInputDto" type=""--%>
<form:form modelAttribute="transactionInputDto" method="post" action="${pageContext.request.contextPath}/home/userpanel/listoftransaction/result">
    <table>
        <tr>
            <td><form:label path="accountNumber">Account Number:</form:label></td>
            <td><form:input path="accountNumber" /></td>
        </tr>

        <tr>
            <td colspan="2"><input type="submit" value="Apply" /></td>
        </tr>
    </table>
</form:form>

</body>