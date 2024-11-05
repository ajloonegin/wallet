<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Person Information</title>
</head>
<body>
<h2>Person Information</h2>
<table>
    <tr>
        <td>Name:</td>
        <td>${person.name}</td>
    </tr>
    <tr>
        <td>Surname:</td>
        <td>${person.surName}</td>
    </tr>
    <tr>
        <td>National Code:</td>
        <td>${person.nationalCode}</td>
    </tr>
    <tr>
        <td>Date of Birth:</td>
        <td><fmt:formatDate value="${person.birthDate}" pattern="yyyy-MM-dd" /></td>
    </tr>

    <tr>
        <td>Phone:</td>
        <td>${person.mobileNumber}</td>
    </tr>

    <tr>
        <td>Address:</td>
        <td>${person.gender}</td>
    </tr>

    <tr>
        <td>Address:</td>
        <td>${person.militaryStatus}</td>
    </tr>

    <tr>
        <td>Address:</td>
        <td>${person.email}</td>
    </tr>
</table>
</body>
</html>
