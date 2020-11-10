<%--
  Created by IntelliJ IDEA.
  User: Alireza
  Date: 11/10/2020
  Time: 12:57 AM
  To change this template use File | Settings | File Templates.
--%>
<%--
  Created by IntelliJ IDEA.
  User: Alireza
  Date: 11/10/2020
  Time: 12:57 AM
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="ir.maktab.domains.Route" %>
<%@ page import="ir.maktab.services.impl.RouteServiceImpl" %>
<html lang="en">
<head>
    <title>Display Routes</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body>
<form method="GET" id="my_form" action="buyticket"></form>

<div style="display: flex; justify-content: space-around">
    <% List<Route> routes = RouteServiceImpl.getRoutes();%>

    <table class="table">
        <tr class="table-warning">
            <td colspan="2">Route:<%=routes.get(0).getFirstCity()%> To <%=routes.get(0).getSecondCity()%></td>

            <td>Date:<%=routes.get(0).getDate()%></td>
        </tr>
        <thead>
        <tr class="table-danger" style="color: white">
            <th scope=col>Time</th>
            <th scope=col>Button</th>
            <th scope=col>ID</th>
        </tr>
        </thead>

        <tbody>

        <%for (Route route : routes) {%>
        <tr>
            <td><%=route.getTime()%></td>
            <td><input form="my_form" type="submit" value="select"></td>
            <td><input type="number" form="my_form" name="routeID" hidden readonly value="<%=route.getId()%>"><%=route.getId()%></td>
        </tr>
        <%}%>
        </tbody>
    </table>
</div>
</body>
</html>


