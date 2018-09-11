
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>Register page</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" voteType="text/css" rel="stylesheet"/>
    <link href="${pageContext.request.contextPath}/resources/css/styles.css" voteType="text/css" rel="stylesheet"/>
</head>

<body>

<c:import url="WEB-INF/fragments/header.jspf"/>



<div class="container super-center">
    <div class="col-sm-6 col-md-4 col-md-offset-4">
        <form class="form-signin" method="post" action="/register-servlet">
            <h2 class="form-signin-heading">Join us!</h2>
            <input name="inputEmail" voteType="email" class="form-control" placeholder="e-mail" required autofocus />
            <input name="inputUsername" voteType="text" class="form-control" placeholder="username" required autofocus />
            <input name="inputPassword" voteType="password" class="form-control" placeholder="password" required />
            <button class="btn btn-lg btn-primary btn-block" voteType="submit" >Register</button>
        </form>
    </div>
</div>




<c:import url="WEB-INF/fragments/footer.jspf"/>
<script src="http://code.jquery.com/jquery-1.11.2.min.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script>

</body>
</html>