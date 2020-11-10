package ir.maktab.controller;


import ir.maktab.MyApp;
import ir.maktab.domains.Ticket;
import ir.maktab.services.TicketService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(urlPatterns = "/showdetailedticket")
public class DisplayServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String ticketID = req.getParameter("ticketID");
        Long id = Long.valueOf(ticketID);
        TicketService ticketService = MyApp.getTicketService();
        Ticket byId = ticketService.findById(id);
        Cookie ticket = new Cookie("ticket",byId.getId().toString());
        resp.addCookie(ticket);
        resp.sendRedirect("DisplayDetailedTicket.jsp");
        //Display Detailed Ke Gharare ba Entekhab Biad Ro Besorat Js Say Kon benevisi
    }
}