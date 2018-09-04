<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>Sample app</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="${pageContext.request.contextPath}/resources/bootstrap.min.css" type="text/css" rel="stylesheet"/>
    <link href="${pageContext.request.contextPath}/resources/styles.css" type="text/css" rel="stylesheet"/>
</head>

<body>


<p>${header["user-agent"]}</p>


<nav class="navbar navbar-inverse navbar-fixed-top">
    <div class="container">
        <a href="#" class="navbar-brand">Sample app</a>

        <button class="navbar-toggle" data-toggle="collapse" data-target=".navHeaderCollapse">
            <span class="glyphicon glyphicon-list"></span>
        </button>

        <div class="collapse navbar-collapse navHeaderCollapse">
            <ul class="nav navbar-nav navbar-right">
                <li class="active"><a href="#">Main page</a></li>
                <li><a href="#">Add</a></li>
                <li><a href="#">Sign in</a></li>
            </ul>
        </div>

    </div>
</nav>


<div class="container">
    <div class="row bs-callout bs-callout-primary">
        <div class="col col-md-1 col-sm-2">
            <div class="col col-md-1 col-sm-2">
                <a href="#" class="btn btn-block btn-primary btn-success"><span
                        class="glyphicon glyphicon-arrow-up"></span> </a>
                <div class="well well-sm centered">12</div>
                <a href="#" class="btn btn-block btn-primary btn-warning"><span
                        class="glyphicon glyphicon-arrow-down"></span> </a>
            </div>
        </div>
        <div class="col col-md-11 col-sm-10">
            <!-- Kolumna z treścią -->
        </div>
    </div>
</div>


<c:import url="WEB-INF/fragments/footer.jspf"/>


<script src="http://code.jquery.com/jquery-1.11.2.min.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/bootstrap.js"></script>
</body>
</html>