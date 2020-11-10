<%@ page import="ir.maktab.MyApp" %>
<%@ page import="ir.maktab.domains.Ticket" %><%--
  Created by IntelliJ IDEA.
  User: Alireza
  Date: 11/10/2020
  Time: 6:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Display Detailed Ticket</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>
<%
    String ticketID = null;

    Cookie[] cookies = request.getCookies();
    if(cookies !=null){
        for(Cookie cookie : cookies){
            if(cookie.getName().equals("ticket")) ticketID = cookie.getValue();
        }
    }
    Ticket ticket = MyApp.getTicketService().findById(Long.valueOf(ticketID));
%>
<table class="table">
    <tr><td colspan="2" style="text-align: center">Bus Ticket</td></tr>
    <tr>
    <th scope=row class="bg-warning">ID</th>
    <td><%=ticketID%></td>
    </tr>
    <tr>
    <th scope=row class="bg-warning">Name</th>
    <td><%=ticket.getName()%></td>
    </tr>
    <tr>
    <th scope=row class="bg-warning">Gender</th>
    <td><%=ticket.getGender()%></td>
    </tr>
    <tr>
    <th scope=row class="bg-warning">From</th>
    <td><%=ticket.getRoute().getFirstCity()%></td>
    </tr>
    <tr>
    <th scope=row class="bg-warning">To</th>
    <td><%=ticket.getRoute().getSecondCity()%></td>
    </tr>
    <tr>
    <th scope=row class="bg-warning">Date</th>
    <td><%=ticket.getRoute().getDate()%></td>
    </tr>
    <tr>
    <th scope=row class="bg-warning">Time</th>
    <td><%=ticket.getRoute().getTime()%></td>
    </tr>
    <tr>
    <th scope=row class="bg-warning">Route ID</th>
    <td><%=ticket.getRoute().getId()%></td>
    </tr>
    <tr><td colspan="2">    <button type="submit" class="btn btn-primary" onclick="function refuse(){
           <%
                MyApp.getTicketService().delete(ticket);
           %>
        }
        refuse()">Delete</button></td></tr>

</table>





<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>

</body>
</html>
