<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="fm" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"  %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>



<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Home | 2017 </title>

    <link rel="stylesheet" href="<c:url value='/static/lib/bootstrap/css/bootstrap-grid.css/' />" >
    <link rel="stylesheet" href="<c:url value='/static/lib/bootstrap/css/bootstrap.css/' />">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <a class="navbar-brand" href="${pageContext.request.contextPath}/"><span>SpringDark</span></a>
    <div class="collapse navbar-collapse">
        <ul class="navbar-nav">
            <li class="nav-item active">
                <a class="nav-link" href="${pageContext.request.contextPath}/">Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="${pageContext.request.contextPath}/createnotices">Create Notice</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="${pageContext.request.contextPath}/notices">Notice</a>
            </li>

            <sec:authorize access="!isAuthenticated()">
                <li class="nav-item">
                    <a class="nav-link" href="${pageContext.request.contextPath}/login">Login</a>
                </li>
            </sec:authorize>



            <sec:authorize access="isAuthenticated()">
                <li class="nav-item">
                    <a class="nav-link" href="<c:url value='/j_spring_security_logout' />">Logout</a>
                </li>
            </sec:authorize>

            <sec:authorize access="hasRole('ROLE_ADMIN')">
                <li class="nav-item">
                    <a class="nav-link" href="${pageContext.request.contextPath}/admin">Admin</a>
                </li>
            </sec:authorize>
        </ul>
    </div>
</nav>