<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
    <link rel="stylesheet" href="resources/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="resources/css/style.css"/>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <title>Login Page</title>
</head>

<body class="my-login-page">
<section class="h-100">
    <div class="container h-100">
        <div class="row justify-content-md-center h-100">
            <div class="card-wrapper">
                <div class="brand">
                    <img src="resources/images/logo.png">
                </div>
                <div class="card fat">
                    <div class="card-body">
                        <h4 class="card-title">Admin Console</h4>
                        <c:if test="${not empty param.error}">
                            <label style="color: red;"> <%= request.getParameter("error") %> </label>
                        </c:if>
                        <form action="<c:url value='/login' />" method="POST" name="loginForm">
                            <c:choose>
                                <c:when test="${not empty (param.error)}">
                                    <label style="color: red; display: none;" id="errorMsg">${param.error}</label>
                                </c:when>
                                <c:otherwise>
                                    <label style="color: red;" id="errorMsg">${error}</label>
                                </c:otherwise>
                            </c:choose>
                            <div class="form-group">
                                <label for="email">E-Mail Address</label>
                                <input id="email" type="email" class="form-control" name="username" value="" required
                                       autofocus>
                            </div>

                            <div class="form-group">
                                <label for="password">Password</label>
                                <input id="password" type="password" class="form-control" name="password" required
                                       data-eye>
                            </div>

                            <div class="form-group no-margin">
                                <button id="loginSubmit" type="submit" class="btn btn-primary btn-block">Login</button>
                            </div>

                            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                        </form>
                    </div>
                </div>
                <jsp:include page="templates/copyright.jsp"/>
            </div>
        </div>
    </div>
</section>
<jsp:include page="templates/footer.jsp"/>
</body>
</html>