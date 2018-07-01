<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
<head>

 <title>Login</title>

</head>

<body>

<div class="container">

 <form method="GET" action="${contextPath}/login" class="form-signin">
 <h2 class="form-heading">Log in</h2>

 <span>${message}</span>
 <input name="username" type="text" class="form-control" placeholder="Username"
 autofocus="true"/>
 <input name="password" type="password" class="form-control" placeholder="Password"/>

 <button class="btn btn-lg btn-primary btn-block" type="submit">Log In</button>
 </div>

 </form>

</div>

</body>
</html>