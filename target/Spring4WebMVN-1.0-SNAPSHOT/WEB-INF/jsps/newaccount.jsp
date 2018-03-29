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

            <legend>Create Account</legend>
            <fm:form action="${pageContext.request.contextPath}/createaccount" method="POST" commandName="user">
                <div class="form-group">


                    <%-- User Name --%>
                    <label for="UserName">User Name</label>
                    <fm:input type="text" path="username" class="form-control" id="UserName" name="username" aria-describedby="emailHelp" placeholder="Enter user name" />
                        <p><fm:errors path="username" cssClass="text-danger small"></fm:errors></p>

                    <%--Email--%>
                    <label for="exampleInputEmail1">Email address</label>
                    <fm:input type="text" path="email" class="form-control" id="exampleInputEmail1" name="email" aria-describedby="emailHelp" placeholder="Enter email" />
                        <p><fm:errors path="email" cssClass="text-danger small"></fm:errors></p>
                    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>

                    <%--Password--%>
                    <label for="password">Password</label>
                    <fm:input type="password" path="password" class="form-control" id="password" name="password" />
                    <p><fm:errors path="password" cssClass="text-danger small"></fm:errors></p>

                    <%--Confirm Password--%>
                    <label for="confirmpassword">Confirm Password</label>
                    <input type="password" class="form-control" id="confirmpassword" name="confirmpassword" />

                </div>
                <input type="submit" class="btn btn-primary" value="Submit">
            </fm:form>
        </div>
        <div class="col-3"></div>
    </div>
</div>
<script>
    var password = document.getElementById("password")
        , confirm_password = document.getElementById("confirmpassword");

    function validatePassword(){
        if(password.value != confirm_password.value) {
            confirm_password.setCustomValidity("Passwords Don't Match");
        } else {
            confirm_password.setCustomValidity('');
        }
    }

    password.onchange = validatePassword;
    confirm_password.onkeyup = validatePassword;
</script>
</body>
</html>
