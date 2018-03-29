<%--
  Created by IntelliJ IDEA.
  User: Mahadi
  Date: 10/17/2017
  Time: 10:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ include file = "header.jsp" %>

<hr>

<div class="container">
    <div class="row">
        <div class="col-3"></div>
        <div class="col-3">
            <fm:form action="${pageContext.request.contextPath}/docreated" method="POST" commandName="notice">
                <div class="form-group">

                    <label for="Name">Name</label>
                    <fm:input type="text" path="name" class="form-control" id="Name" name="next" aria-describedby="emailHelp" placeholder="Enter Your name" />
                    <fm:errors path="name" cssClass="alert-danger"></fm:errors>

                    <label for="exampleInputEmail1">Email address</label>
                    <fm:input type="text" path="email" class="form-control" id="exampleInputEmail1" name="email" aria-describedby="emailHelp" placeholder="Enter email" />
                    <fm:errors path="email" cssClass="alert-danger"></fm:errors>
                    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>

                    <label for="Text">Text</label>
                    <fm:textarea path="text" class="form-control" id="Text" aria-describedby="emailHelp" name="text"></fm:textarea>
                    <fm:errors path="text" cssClass="alert-danger"></fm:errors>
                </div>
                <input type="submit" class="btn btn-primary" value="Submit">
            </fm:form>
        </div>
        <div class="col-3"></div>
    </div>
</div>
</body>
</html>
