
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" type="text/css" rel="stylesheet"/>
    <link href="${pageContext.request.contextPath}/resources/css/styles.css" type="text/css" rel="stylesheet"/>
</head>

<body>

<c:import url="WEB-INF/fragments/header.jspf"/>



<div class="container">
    <div class="col-sm-6 col-md-4 col-md-offset-4">
        <form class="form-signin" action="j_security_check" method="post">
            <h2 class="form-signin-heading">Login</h2>
            <input name="username" type="text" class="form-control" placeholder="username" required autofocus>
            <input name="password" type="password" class="form-control" placeholder="password" required>
            <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
            <a href="#">Sign up</a>
        </form>
    </div>
</div>

</body>
</html>