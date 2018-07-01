<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>

 <title>Welcome</title>
</head>
<body>
<div class="container">

 <form id="resetForm" method="GET" action="${contextPath}/">
 
 </form>

 <h2>YOU'RE NOT AUTHORISED TO ACCESS THE APPLICATION !!!</h2>


</div>

</body>
</html>