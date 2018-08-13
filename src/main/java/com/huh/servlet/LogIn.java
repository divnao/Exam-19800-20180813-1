package com.huh.servlet;

import com.sun.org.apache.xerces.internal.impl.xs.SchemaSymbols;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LogIn extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("============");
        super.init();
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("============");
        super.init(config);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("============");
            String first_name = req.getParameter("user_name");
            System.out.println("======" + first_name);
    }

    @Override
    public void destroy() {
        System.out.println("============");
        super.destroy();
    }
}
