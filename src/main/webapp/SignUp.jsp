<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Sign In</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>
<div class="form-group" >
    <form class="px-4 py-3" name="form1" method="post" action="signin">
        <div class="form-group">
            <label for="Username">UserName</label>
            <input type="text" class="form-control" id="Username" placeholder="UserName" name="username">
        </div>
        <div class="form-group">
            <label for="Password">Password</label>
            <input type="password" class="form-control" id="Password" placeholder="Password" name="password">
        </div>

        <button type="submit" class="btn btn-primary">Sign Up</button>
    </form>
    <div class="dropdown-divider"></div>
    <button type="submit" class="btn btn-primary" onclick="function Login() {
           location.href = 'login.jsp';
        }
        Login()">Login</button>
</div>
<%--<form name="form1" method="post" action="signin">--%>
<%--    <label for="UserName">UserName:</label><br>--%>
<%--    <input type="text" id="UserName" name="username"><br><br>--%>
<%--    <label for="Password">Password:</label><br>--%>
<%--    <input type="text" id="Password" name="password"><br><br>--%>
<%--    <input type="submit" value="submit">--%>
<%--</form>--%>

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</body>
</html>