
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>Person Remove</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/mappingController/deletePersonResult" method="post">
    <table>
        <tr>
            <td><label for="id">Person ID:</label></td>
            <td><input id="id" name="id" type="text" required="true" value="${deletepersoninputdto.id}" /></td>
        </tr>
        <tr>
            <td colspan="2"><button type="submit">Delete</button></td>
        </tr>
    </table>
</form>
</body>
</html>