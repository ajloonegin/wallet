
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Admin Panel Page</title>
	<style>
		body {
			font-family: Arial, sans-serif;
			text-align: center; /* Center-align the text */
			background-color: #f0f0f0; /* Light grey background */
			padding: 50px; /* Padding around the content */
		}
		h2 {
			margin-bottom: 30px; /* Space below the heading */
		}
		.button-container {
			margin-bottom: 50px; /* Space below the buttons */
		}
		.big-button {
			background-color: #007BFF; /* Blue button */
			color: white; /* White text */
			font-size: 24px; /* Larger font size */
			padding: 20px 40px; /* Button padding */
			border: none; /* No border */
			border-radius: 5px; /* Rounded corners */
			cursor: pointer; /* Pointer cursor on hover */
			margin: 10px; /* Space between buttons */
			transition: background-color 0.3s; /* Transition effect */
		}
		.big-button:hover {
			background-color: #0056b3; /* Darker blue on hover */
		}
	</style>
</head>
<body>
<h2>Please select operation:</h2>
<div class="button-container">
	<button class="big-button" onclick="location.href='${pageContext.request.contextPath}/home/adminpanel/addperson' ">Add new person</button>
	<button class="big-button" onclick="location.href='${pageContext.request.contextPath}/home/adminpanel/findperson' ">Find person</button>
	<button class="big-button" onclick="location.href='${pageContext.request.contextPath}/home/adminpanel/updateperson' ">Update person</button>
	<button class="big-button" onclick="location.href='${pageContext.request.contextPath}/home/adminpanel/deleteperson' ">Delete person</button>
	<button class="big-button" onclick="location.href='${pageContext.request.contextPath}/home/adminpanel/addaccount' ">Add new account</button>
	<button class="big-button" onclick="location.href='${pageContext.request.contextPath}/home/adminpanel/findaccount' ">Find account</button>
	<button class="big-button" onclick="location.href='${pageContext.request.contextPath}/home/adminpanel/updateaccount' ">Update account</button>
	<button class="big-button" onclick="location.href='${pageContext.request.contextPath}/home/adminpanel/deleteaccount' ">Delete account</button>
</div>


</body>
</html>