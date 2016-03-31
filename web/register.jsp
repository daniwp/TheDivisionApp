<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="header.jsp" />

<div class="container">
    <div class="row">
        <div class="col-md-6 col-md-offset-3">
            <h1 class="page-header">Registration page</h1>
            <c:if test="${not empty error}">
                <div class="alert alert-danger alertMessage">
                    ${error}
                </div>
            </c:if>
            <c:remove var="error"/>
            <form action="register" method="POST">
                <div class="form-group">
                    <p>Username: </p><input class="form-control" type="text" name="username" required>
                </div>
                <div class="form-group">
                    <p>Password: </p><input class="form-control" type="password" name="password" required>
                </div>
                <button class="btn btn-primary" type="submit">Register</button>
                <a href="login.jsp" class="btn btn-primary">Login</a>
            </form>
        </div>
    </div>
</div>


<jsp:include page="footer.jsp" />