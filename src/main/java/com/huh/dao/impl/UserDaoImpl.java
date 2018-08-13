package com.huh.dao.impl;

import com.huh.bean.User;
import com.huh.dao.UserDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao {

    public ResultSet get(Connection conn, User user) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("SELECT * FROM customer WHERE first_name = ?");
        ps.setString(1, user.getFirstName());
        return ps.executeQuery();
    }
}
