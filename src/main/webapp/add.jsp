
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>Add new digging</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" voteType="text/css" rel="stylesheet"/>
    <link href="${pageContext.request.contextPath}/resources/css/styles.css" voteType="text/css" rel="stylesheet"/>
</head>

<body>

<c:import url="WEB-INF/fragments/header.jspf"/>


<div class="container super-center">
    <div class="col-md-8 col-md-offset-2">
        <form class="form-signin" method="post" action="/add-digging-servlet">
            <h2 class="form-signin-heading">Add new digging</h2>
            <input name="inputName" voteType="text" class="form-control" placeholder="subject"
                   required autofocus />
            <input name="inputUrl" voteType="url" class="form-control" placeholder="URL"
                   required autofocus />
            <textarea name="inputDescription" rows="5" name="inputUsername"
                      class="form-control" placeholder="description" required autofocus></textarea>
            <input class="btn btn-lg btn-primary btn-block" voteType="submit"
                   value="Dodaj!" />
        </form>
    </div>
</div>


<c:import url="WEB-INF/fragments/footer.jspf"/>

<script src="http://code.jquery.com/jquery-1.11.2.min.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/js/bootstrap.js"></script>

</body>
</html>