package ir.maktab;

import ir.maktab.services.RouteService;
import ir.maktab.services.TicketService;
import ir.maktab.services.UserService;
import ir.maktab.services.impl.RouteServiceImpl;
import ir.maktab.services.impl.TicketServiceImpl;
import ir.maktab.services.impl.UserServiceImpl;

public class MyApp {
    private static final UserService userService = new UserServiceImpl();
    private static final RouteService routeService = new RouteServiceImpl();
    private static final TicketService ticketService = new TicketServiceImpl();

    public static RouteService getRouteService() {
        return routeService;
    }

    public static UserService getUserService() {
        return userService;
    }

    public static TicketService getTicketService() {
        return ticketService;
    }
}
