<%@ page import="ir.maktab.MyApp" %>
<%@ page import="ir.maktab.domains.Route" %>
<%@ page import="java.util.HashSet" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Set" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>SelectRoutes</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
          integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<%--TODO ID PROBLEM!--%>
<form class="form-inline" name="form1" method="post" action="selectroute">
    <label class="my-1 mr-2" for="FirstCity">FirstCity:</label>
    <select class="custom-select my-1 mr-sm-2" id="FirstCity" name="firstcity">
        <%
            List<Route> routes = MyApp.getRouteService().findAll();
            Set<String> firstCities = new HashSet<>();
            Set<String> secondCities = new HashSet<>();
            routes.forEach((c) -> {
                firstCities.add(c.getFirstCity());
                secondCities.add(c.getSecondCity());
            });
        %>
        <%for (String city : firstCities) {%>
        <option  value="<%=city%>"><%=city%></option>
        <%}%>
    </select>
    <label class="my-1 mr-2" for="SecondCity">SecondCity:</label>
    <select class="custom-select my-1 mr-sm-2" id="SecondCity" name="secondcity">
        <%for (String city : secondCities) {%>
        <option  value="<%=city%>"><%=city%></option>
        <%}%>
    </select>
    <div class="form-group">
        <label for="Date">Date</label>
        <input type="text" class="form-control" id="Date" placeholder="YYYY-MM-DD" name="date">
    </div>
    &nbsp;
    <input type="submit" value="Submit">
</form>






<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</body>
</html>