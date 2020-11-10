package ir.maktab.controller;

import ir.maktab.MyApp;
import ir.maktab.domains.Route;
import ir.maktab.services.RouteService;

import javax.servlet.*;
import java.io.IOException;

public class RouteSelectFilter implements Filter {
    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        String firstCity = req.getParameter("firstcity");
        String secondCity = req.getParameter("secondcity");
        String date = req.getParameter("date");
        Route route = new Route(firstCity, secondCity, date);
        RouteService routeService = MyApp.getRouteService();
        resp.setContentType("text/html");

        if (routeService.findRoutes(route) == null) {
            chain.doFilter(req,resp);
        } else {
            RequestDispatcher rd = req.getRequestDispatcher("/DisplayRoutes.jsp");
            rd.include(req, resp);
        }
    }
}
