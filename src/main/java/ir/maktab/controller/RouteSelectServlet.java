package ir.maktab.controller;

import ir.maktab.MyApp;
import ir.maktab.domains.Route;
import ir.maktab.services.RouteService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RouteSelectServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstCity = req.getParameter("firstcity");
        String secondCity = req.getParameter("secondcity");
        String date = req.getParameter("date");
        Route route = new Route(firstCity, secondCity, date);
        RouteService routeService = MyApp.getRouteService();
        resp.setContentType("text/html");

        if (routeService.findRoutes(route) == null) {
            resp.sendRedirect("Routes.jsp");
        } else {
            resp.sendRedirect("DisplayRoutes.jsp");
        }
    }
}
