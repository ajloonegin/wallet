



<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Person Registration</title>
</head>
<body>
    <h2>Person Registration</h2>
    <%--@elvariable id="addpersoninputDto" type=""--%>
    <form:form modelAttribute="addpersoninputDto" method="post" action="${pageContext.request.contextPath}/home/adminpanel/addperson/result">
        <table>
            <tr>
                <td><form:label path="name">Name:</form:label></td>
                <td><form:input path="name" /></td>
            </tr>
            <tr>
                <td><form:label path="surName">Surname:</form:label></td>
                <td><form:input path="surName" /></td>
            </tr>
            <tr>
                <td><form:label path="nationalCode">National Code:</form:label></td>
                <td><form:input path="nationalCode" /></td>
            </tr>
            <tr>
                <td><form:label path="birthDate">Birth Date:</form:label></td>
                <td><form:input path="birthDate" type="date" /></td>
            </tr>
            <tr>
                <td><form:label path="mobileNumber">Mobile Number:</form:label></td>
                <td><form:input path="mobileNumber" /></td>
            </tr>
            <tr>
                <td><form:label path="gender">Gender:</form:label></td>
                <td>
                    <form:select path="gender">
                        <form:option value="MALE">Male</form:option>
                        <form:option value="FEMALE">Female</form:option>
                    </form:select>
                </td>
            </tr>
            <tr>
                <td><form:label path="militaryStatus">Military Status:</form:label></td>
                <td>
                    <form:select path="militaryStatus">
                        <form:option value="DONE">DONE</form:option>
                        <form:option value="EducationalExemption">EducationalExemption</form:option>
                        <form:option value="permanentExemption">permanentExemption</form:option>
						<form:option value="SubjectToMilitaryService">SubjectToMilitaryService</form:option>
						<form:option value="InMilitaryProgress">InMilitaryProgress</form:option>
                    </form:select>
                </td>
            </tr>
            <tr>
                <td><form:label path="email">Email:</form:label></td>
                <td><form:input path="email" type="email" /></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Add Person" /></td>
            </tr>
        </table>
    </form:form>
</body>
</html>
