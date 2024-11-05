



<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Account Registration</title>
</head>
<body>
    <h2>Account Registration</h2>
    <%--@elvariable id="addAccountInputDto" type=""--%>
    <form:form modelAttribute="addAccountInputDto" method="post" action="${pageContext.request.contextPath}/home/adminpanel/addaccount/result">
        <table>
            <tr>
                <td><form:label path="accountNumber">Account Number:</form:label></td>
                <td><form:input path="accountNumber" /></td>
            </tr>
            <tr>
                <td><form:label path="accountBalance">Account Balance:</form:label></td>
                <td><form:input path="accountBalance" /></td>
            </tr>
            <tr>
                <td><form:label path="dateOfCreate">Date Of Create:</form:label></td>
                <td><form:input path="dateOfCreate" type="date"/></td>
            </tr>

            <tr>
                <td><form:label path="shabaNumber">Shaba Number:</form:label></td>
                <td><form:input path="shabaNumber" /></td>
            </tr>



            <tr>
                <td colspan="2"><input type="submit" value="Add Account" /></td>
            </tr>
        </table>
    </form:form>

</body>














