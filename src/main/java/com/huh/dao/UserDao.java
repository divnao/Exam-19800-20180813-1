package com.huh.dao;

import com.huh.bean.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface UserDao {

    public ResultSet get(Connection conn, User user) throws SQLException;

}
