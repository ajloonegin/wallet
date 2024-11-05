

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Person Finding</title>
</head>
<body>
<h2>Person Finding</h2>
<%--@elvariable id="findPersonInputDto" type=""--%>
<form:form modelAttribute="findPersonInputDto" method="post" action="${pageContext.request.contextPath}/home/adminpanel/findperson/result">
    <table>
        <tr>
            <td><form:label path="nationalCode">National Code:</form:label></td>
            <td><form:input path="nationalCode" /></td>
        </tr>


        <tr>
            <td colspan="2"><input type="submit" value="Find Person" /></td>
        </tr>
    </table>
</form:form>

</body>


