<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>Person Update</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/mappingController/updatePersonResult" method="post">
	<table>
		<tr>
			<td><label for="id">Person ID:</label></td>
			<td><input id="id" name="id" type="text" required="true" value="${updatepersoninputdto.id}" /></td>
		</tr>
		<tr>
			<td><label for="name">Name:</label></td>
			<td><input id="name" name="name" type="text" required="true" value="${updatepersoninputdto.name}" /></td>
		</tr>
		<tr>
			<td><label for="surName">Surname:</label></td>
			<td><input id="surName" name="surName" type="text" required="true" value="${updatepersoninputdto.surName}" /></td>
		</tr>
		<tr>
			<td><label for="nationalCode">National Code:</label></td>
			<td><input id="nationalCode" name="nationalCode" type="text" required="true" value="${updatepersoninputdto.nationalCode}" /></td>
		</tr>
		<tr>
			<td><label for="birthDate">Birth Date:</label></td>
			<td><input id="birthDate" name="birthDate" type="text" required="true" value="${updatepersoninputdto.birthDate}" /></td>
		</tr>
		<tr>
			<td><label for="mobileNumber">Mobile Number:</label></td>
			<td><input id="mobileNumber" name="mobileNumber" type="text" required="true" value="${updatepersoninputdto.mobileNumber}" /></td>
		</tr>
		<tr>
			<td><label for="gender">Gender:</label></td>
			<td><input id="gender" name="gender" type="text" required="true" value="${updatepersoninputdto.gender}" /></td>
		</tr>
		<tr>
			<td><label for="militaryStatus">Military Status:</label></td>
			<td><input id="militaryStatus" name="militaryStatus" type="text" required="true" value="${updatepersoninputdto.militaryStatus}" /></td>
		</tr>
		<tr>
			<td><label for="email">Email:</label></td>
			<td><input id="email" name="email" type="email" required="true" value="${updatepersoninputdto.email}" /></td>
		</tr>
		<tr>
			<td colspan="2"><button type="submit">Update</button></td>
		</tr>
	</table>
</form>
</body>
</html>


