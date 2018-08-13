package com.huh.dao;

import com.huh.bean.Movie;
import com.huh.bean.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface MovieDao {

    public ResultSet get(Connection conn) throws SQLException;

    public void add(Connection conn, Movie movie) throws SQLException;

    public void update(Connection conn, Movie movie) throws SQLException;

    public void delete(Connection conn, Movie movie) throws SQLException;



}
