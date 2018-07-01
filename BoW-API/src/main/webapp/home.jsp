<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>

 <title>Welcome</title>
 
 <h2>Welcome to Home</h2>
</head>
<body>
<div class="container">

 <form id="statementForm" method="GET" action="${contextPath}/">
 	<div>${response}</div>
 </form>

 


</div>

</body>
</html>