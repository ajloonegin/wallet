<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Account Finding</title>
</head>
<body>
<h2>Account Finding</h2>
<%--@elvariable id="findAccountInputDto" type=""--%>
<form:form modelAttribute="findAccountInputDto" method="post"
           action="${pageContext.request.contextPath}/home/adminpanel/findaccount/result">
    <table>
        <tr>
            <td><form:label path="accountNumber">Account Number:</form:label></td>
            <td><form:input path="accountNumber"/></td>
        </tr>


        <tr>
            <td colspan="2"><input type="submit" value="Find Account"/></td>
        </tr>
    </table>
</form:form>

</body>


