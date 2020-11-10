<%--&lt;%&ndash;--%>
<%--  Created by IntelliJ IDEA.--%>
<%--  User: Alireza--%>
<%--  Date: 11/8/2020--%>
<%--  Time: 1:16 AM--%>
<%--  To change this template use File | Settings | File Templates.--%>
<%--&ndash;%&gt;--%>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="ir.maktab.domains.Ticket" %>
<%@ page import="ir.maktab.services.impl.UserServiceImpl" %>
<%@ page import="java.util.List" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>DisplayTickets</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>
<form method="GET" id="my_form" action="showdetailedticket"></form>

<div style="display: flex; justify-content: space-around">
    <table class="table">
        <thead>
        <tr><td colspan="3" style="text-align: center">Tickets You Bought</td></tr>
        <tr class="table-danger" style="color: black">
            <th scope=col>Button</th>
            <th scope=col>Date</th>
            <th scope=col>ID</th>

        </tr>
        </thead>

        <tbody>

        <% List<Ticket> tickets = UserServiceImpl.getUser().getTickets();%>

        <%for (Ticket ticket : tickets) {%>
        <tr>
            <td><%=ticket.getRoute().getDate()%></td>
            <td><input form="my_form" type="submit" value="select" onclick="
                    function setCookie() {
                    document.cookie = 'ticket='+<%=ticket.getId()%>
                    }
                    setCookie()">></td>
            <td><input type="number" form="my_form" name="ticketID" hidden readonly value="<%=ticket.getId()%>"><%=ticket.getId()%></td>
        </tr>
        <%}%>

        </tbody>
    </table>
</div>
</body>


<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</html>
