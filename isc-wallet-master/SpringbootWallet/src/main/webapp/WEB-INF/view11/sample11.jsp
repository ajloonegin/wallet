
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>Account Update</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/mappingController/updateAccountResult" method="post">
	<table>
		<tr>
			<td><label for="id">Account ID:</label></td>
			<td><input id="id" name="id" type="text" required="true" value="${updateAccountInputDto.id}" /></td>
		</tr>
		<tr>
			<td><label for="accountNumber">Account Number:</label></td>
			<td><input id="accountNumber" name="accountNumber" type="text" required="true" value="${updateAccountInputDto.accountNumber}" /></td>
		</tr>
		<tr>
			<td><label for="accountBalance">Account Balance:</label></td>
			<td><input id="accountBalance" name="accountBalance" type="text" required="true" value="${updateAccountInputDto.accountBalance}" /></td>
		</tr>
		<tr>
			<td><label for="dateOfCreate">Date Of Create:</label></td>
			<td><input id="dateOfCreate" name="dateOfCreate" type="text" required="true" value="${updateAccountInputDto.dateOfCreate}" /></td>
		</tr>
		<tr>
			<td><label for="shabaNumber">Shaba Number:</label></td>
			<td><input id="shabaNumber" name="shabaNumber" type="text" required="true" value="${updateAccountInputDto.shabaNumber}" /></td>
		</tr>
		<tr>
			<td colspan="2"><button type="submit">Update</button></td>
		</tr>
	</table>
</form>
</body>
</html>