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


@WebServlet(urlPatterns = "/showdetailedticket")
public class DisplayServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String id = null;
        Cookie[] cookies = req.getCookies();
        if(cookies !=null){
            for(Cookie cookie : cookies){
                if(cookie.getName().equals("ticket")) id = cookie.getValue();

            }
        }
        Long ticketID = Long.parseLong(id);
        TicketService ticketService = MyApp.getTicketService();
        Ticket byId = ticketService.findById(ticketID);
        Cookie ticket = new Cookie("ticket",byId.getId().toString());
        resp.addCookie(ticket);
        resp.sendRedirect("DisplayDetailedTicket.jsp");
    }
}
