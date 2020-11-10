package ir.maktab.controller;

import ir.maktab.MyApp;
import ir.maktab.domains.Route;
import ir.maktab.domains.Ticket;
import ir.maktab.domains.User;
import ir.maktab.services.TicketService;
import ir.maktab.services.impl.RouteServiceImpl;
import ir.maktab.services.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class BuyTicketServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        String id = null;

        Cookie[] cookies = req.getCookies();
        if(cookies !=null){
            for(Cookie cookie : cookies){
                if(cookie.getName().equals("route")) id = cookie.getValue();

            }
        }
        Long routeId = Long.parseLong(id);
        Route byId = MyApp.getRouteService().findById(routeId);
//        Long routeID = Long.valueOf(req.getParameter("routeID"));
//        Route byId = MyApp.getRouteService().findById(routeID);
        RouteServiceImpl.setRoute(byId);
        resp.sendRedirect("buyticket.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("Name");
        String gender = req.getParameter("gender");
        Route route = RouteServiceImpl.getRoute();
        User user = UserServiceImpl.getUser();
        Ticket ticket = new Ticket(name, gender, route);
        ticket.setUser(user);
        ticket.setRoute(route);
        user.addTicket(ticket);
        route.addTicket(ticket);
        TicketService ticketService = MyApp.getTicketService();
        ticketService.saveOrUpdate(ticket);
        Cookie userName = new Cookie("name", name);
        Cookie userGender = new Cookie("gender", gender);
        Cookie id = new Cookie("id", ticket.getId().toString());
        resp.addCookie(userName);
        resp.addCookie(userGender);
        resp.addCookie(id);
        resp.sendRedirect("SuccessfulTicket.jsp");



    }
}
