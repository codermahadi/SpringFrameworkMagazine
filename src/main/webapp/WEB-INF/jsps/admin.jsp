<%--
  Created by IntelliJ IDEA.
  User: Mahadi
  Date: 10/11/2017
  Time: 11:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ include file = "header.jsp" %>

<hr>

<div class="container">
    <div class="bg-transparent card">
        <p class="text-center p-2 text-info">Welcome To Admin Panel</p>
    </div>
</div>

<div class="container-fluid">
    <div class="container">
        <table class="table table-hover table-dark">
            <thead>
            <tr>
                <th scope="col">Username</th>
                <th scope="col">Email</th>
                <th scope="col">Authority</th>
                <th scope="col">Enabled</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="user" items="${users}">
                <tr>
                    <td><c:out value="${user.username}"></c:out></td>
                    <td><c:out value="${user.email}"></c:out></td>
                    <td><c:out value="${user.authority}"></c:out></td>
                    <td><c:out value="${user.enabled}"></c:out></td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
</body>
</html>
