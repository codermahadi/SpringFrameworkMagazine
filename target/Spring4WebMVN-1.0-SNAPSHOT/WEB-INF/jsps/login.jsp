<%--
  Created by IntelliJ IDEA.
  User: Mahadi
  Date: 11/1/2017
  Time: 11:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<html>
<head>

    <title>Login Page</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/lib/bootstrap/css/bootstrap-grid.css/">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/lib/bootstrap/css/bootstrap.css/">

</head>
<body onload='document.f.j_username.focus();'>
<br>
<br>
<h3 class="text-center text-dark">Login with Username and Password</h3>
<hr>
<br>
<br>
<br>

<div class="container-fluid">
    <div class="container">
        <div class="row">
            <div class="col-4"></div>
            <div class="col-4">
                    <c:if test="${param.error != null}">
                        <div class="alert alert-danger">
                            Incorrect Username Or Password !
                        </div>

                    </c:if>
                <form name='f' action='${pageContext.request.contextPath}/j_spring_security_check' method='POST'>

                    <%--User Name--%>
                    <div class="form-group">
                        <label for="userName">User Name</label> <br>
                        <input type='text' name='j_username' value='' class="form-control" id="userName" aria-describedby="emailHelp" placeholder="Enter User Name">
                    </div>

                    <%--User Password--%>
                    <div class="form-group">
                        <label for="exampleInputPassword1">Password</label>
                        <input type='password' name='j_password' class="form-control" id="exampleInputPassword1" placeholder="Password">
                    </div>

                    <%--Remember Me--%>
                    <div class="form-group">
                        <input type='checkbox' name='_spring_security_remember_me' checked="checked" id="_spring_security_remember_me"> Remember me
                    </div>

                    <button type="submit" class="btn btn-primary">Submit</button>
                    <p><a href="<c:url value='/newaccount' />">Create New Account</a></p>
                </form>
            </div>
            <div class="col-4"></div>
        </div>
    </div>
</div>
</body>
</html>
