package com.huh.servlet;

import com.huh.bean.User;
import com.huh.service.CheckUserService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LogInServlet extends HttpServlet {

    private CheckUserService cus = new CheckUserService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String first_name = req.getParameter("user_name");

        // user_first name is null
        if (first_name == "") {
            //请求转发1(可以在其他应用中转发)
            resp.sendRedirect("http://" + req.getServerName() + ":" + req.getServerPort());
            //请求转发2 (只能在同一应用中转发)
            //String redirestURL = "xxx";
            //RequestDispatcher rd = req.getRequestDispatcher(redirestURL);
            //rd.forward(req, resp);
        } else {
            User user = new User();
            user.setFirstName(first_name);
            boolean checkEd = cus.check(user);
            if (checkEd) {
                resp.sendRedirect("http://" + req.getServerName() + ":" + req.getServerPort() + "/templates/movie_list.jsp");
            } else {
                resp.sendRedirect("http://" + req.getServerName() + ":" + req.getServerPort());
            }
        }
    }
}
