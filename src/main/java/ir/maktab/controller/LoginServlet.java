package ir.maktab.controller;


import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req,
                          HttpServletResponse resp) throws ServletException, IOException {

        String userName = req.getParameter("username");

        HttpSession session = req.getSession(true);
        session.setAttribute("user", userName);
        session.setMaxInactiveInterval(3 * 60);
        Cookie user = new Cookie("user", userName);
        user.setMaxAge(30 * 60);
        resp.addCookie(user);
        resp.sendRedirect("SuccessfulLogin.jsp");

    }

}
