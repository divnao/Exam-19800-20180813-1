package com.huh.servlet;

import com.huh.bean.Counter;
import com.huh.service.CounterService;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.SQLException;

public class AddServlet extends HttpServlet {

    private CounterService counterService = new CounterService();
    private Counter counter = new Counter();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        try {
            doPost(req, resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        resp.setContentType("application/text");
        resp.setCharacterEncoding("UTF-8");
        HttpSession session = req.getSession();
        try {
            int preCount = counterService.getCount();
            synchronized ((Object) preCount) {
                session.setAttribute("data", userAccess(preCount));
            }
            resp.sendRedirect("templates/count.jsp");
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int userAccess(int currentCount) throws SQLException {
        this.counter.setCount(currentCount + 1);
        counterService.updateCount(this.counter);
        return this.counter.getCount();
    }
}
