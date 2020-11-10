<%--
  Created by IntelliJ IDEA.
  User: Alireza
  Date: 11/10/2020
  Time: 6:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Successful Buy</title>
</head>
<body>
<%
    String userName = null;
    String userGender = null;
    String id = null;

    Cookie[] cookies = request.getCookies();
    if (cookies != null) {
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("name")) userName = cookie.getValue();
            if (cookie.getName().equals("gender")) userGender = cookie.getValue();
            if (cookie.getName().equals("id")) id = cookie.getValue();
        }
    }
%>
<div class="card">
    <div class="card-body" style="color: wheat;background-color: green">
        <%
            assert userGender != null;
            if (userGender.equals("Male")) {
        %><p>Mr.<%
            }else{
                %>
        <p>Ms.
                <%
            }
        %>
        <%=userName%>, You Successfully Bought Your Ticket!
        Your Ticket ID Is <%=id%>
    </div>

</div>
</body>
</html>
