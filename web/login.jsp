<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="header.jsp" />

<div class="container">
    <div class="row">
        <div class="col-md-6 col-md-offset-3">
            <h1 class="page-header">Login page</h1>
            <c:if test="${not empty successReg}">
                <div class="alert alert-success alertMessage">
                    ${success}
                </div>
            </c:if>
            <c:remove var="success" scope="session"/>
            <c:if test="${not empty error}">
                <div class="alert alert-danger alertMessage">
                    ${error}
                </div>
            </c:if>
            <c:remove var="error"/>
            <form action="Login">
                <div class="form-group">
                    <p>Username: </p><input class="form-control" type="text" name="uname" required>
                </div>
                <div class="form-group">
                    <p>Password: </p><input class="form-control" type="password" name="pword" required>
                </div>
                <button class="btn btn-primary">Login</button>
                <a href="register.jsp" class="btn btn-primary">Register</a>
            </form>
        </div>
    </div>
</div>

<jsp:include page="footer.jsp" />
