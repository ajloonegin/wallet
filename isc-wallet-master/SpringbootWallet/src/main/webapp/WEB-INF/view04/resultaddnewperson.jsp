
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Registration Of New Person Successful</title>
</head>
<body>
<h2><c:out value="${message}">Thanks for registering!</c:out></h2>
<a href="${pageContext.request.contextPath}/home/adminpanel/addperson">Go Back to Registration</a>
</body>
</html>