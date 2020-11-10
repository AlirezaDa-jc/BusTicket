package ir.maktab.controller;

import ir.maktab.MyApp;
import ir.maktab.services.UserService;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginFilter implements Filter {
    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        String userName = req.getParameter("username");
        String password = req.getParameter("password");
        UserService userService = MyApp.getUserService();

        if (userService.login(userName, password)) {
            chain.doFilter(req, resp);
        }else{
            RequestDispatcher rd = req.getRequestDispatcher("/login.jsp");
            PrintWriter out= resp.getWriter();
            out.println("<font color=red>Either user name or password is wrong.</font>");
            rd.include(req, resp);
        }

    }
}
