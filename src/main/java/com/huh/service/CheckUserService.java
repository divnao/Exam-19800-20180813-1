package com.huh.service;

import com.huh.bean.User;
import com.huh.dao.UserDao;
import com.huh.dao.impl.UserDaoImpl;
import com.huh.jdbc.ConnectionFactory;

import java.sql.Connection;
import java.sql.ResultSet;

public class CheckUserService {

    private UserDao userDao = new UserDaoImpl();

    public boolean check(User user) {
        Connection conn = null;
        try {
            conn = ConnectionFactory.getInstance().getConnection();
            conn.setAutoCommit(false);
            ResultSet rs = userDao.get(conn, user);
            while (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
            try {
                conn.rollback();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } finally {
            try {
                conn.close();
            } catch (Exception e3) {
                e3.printStackTrace();
            }
        }
        return false;
    }
}
