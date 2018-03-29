<%--
  Created by IntelliJ IDEA.
  User: Mahadi
  Date: 10/17/2017
  Time: 10:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ include file = "header.jsp" %>

<hr>

<div class="container-fluid">
    <div class="container">
        <table class="table table-hover table-dark">
            <thead>
            <tr>
                <th scope="col">#</th>
                <th scope="col">Name</th>
                <th scope="col">Email</th>
                <th scope="col">Text</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach var="notice" items="${notices}">
            <tr>
                <th scope="row"><c:out value="${notice.id}"></c:out></th>
                <td><c:out value="${notice.name}"></c:out></td>
                <td><c:out value="${notice.email}"></c:out></td>
                <td><c:out value="${notice.text}"></c:out></td>
            </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>

</body>
</html>
