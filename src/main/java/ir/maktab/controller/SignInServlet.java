package ir.maktab.controller;

import ir.maktab.MyApp;
import ir.maktab.services.UserService;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/signin")
public class SignInServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String userName = req.getParameter("username");
        String password = req.getParameter("password");
        ServletOutputStream out = resp.getOutputStream();
        //js html front todo
        UserService userService = MyApp.getUserService();
        if(userService.signIn(userName,password)){
            out.println("Welcome  " + userName);
            resp.sendRedirect("SuccessfulLogin.jsp");
        }else{
            out.println("User Already Registered!");
            out.println("<a href=\"login.jsp\">Login!</a><br><br>");
            out.println("<a href=\"SignUp.jsp\">Sign In!!</a>");
        }
        out.println("</body>\n" +
                "</html>");
    }

}
