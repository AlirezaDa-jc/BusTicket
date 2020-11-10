package ir.maktab.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class CountServlet  extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        HttpSession httpSession = req.getSession(true);
//        httpSession.invalidate();
        /*
        If Session Is In Inactive for (30) seconds it will *unbound all of its attributes! *Invalidates Attributes
         */
//        httpSession.getMaxInactiveInterval()
        httpSession.setMaxInactiveInterval(30);
        if(httpSession.isNew()){
            httpSession.setAttribute("view",1);
        }else{
            int view =(int) httpSession.getAttribute("view");
            httpSession.setAttribute("view",++view);
        }
        out.println(":::"+httpSession.getAttribute("view"));
    }
}
