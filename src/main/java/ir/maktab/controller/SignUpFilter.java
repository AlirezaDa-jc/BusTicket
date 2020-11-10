package ir.maktab.controller;

import ir.maktab.MyApp;
import ir.maktab.services.UserService;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;

public class SignUpFilter implements Filter {
    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
        resp.setContentType("text/html");
        String userName = req.getParameter("username");
        String password = req.getParameter("password");

        UserService userService = MyApp.getUserService();
        if(userService.signIn(userName,password)){
            chain.doFilter(req, resp);
        }else{
            RequestDispatcher rd = req.getRequestDispatcher("/login.jsp");
            PrintWriter out= resp.getWriter();
            out.println("<font color=red>Either user name or password is wrong.</font>");
            out.println("<a href=\"login.jsp\">Login!</a><br><br>");
            out.println("<a href=\"SignUp.jsp\">Sign In!!</a>");
            rd.include(req, resp);
        }
    }
}
