<%--
  Created by IntelliJ IDEA.
  User: Mahadi
  Date: 10/17/2017
  Time: 11:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Notice</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/lib/bootstrap/css/bootstrap-grid.css/">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/static/lib/bootstrap/css/bootstrap.css/">
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/lib/bootstrap/js/bootstrap.js"></script>
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
            <li class="nav-item">
                <a class="nav-link" href="${pageContext.request.contextPath}/admin">Admin</a>
            </li>

        </ul>
    </div>
</nav>
<hr>
<div class="alert-success"><p>Your account has been created !</p></div>
</body>
</html>
