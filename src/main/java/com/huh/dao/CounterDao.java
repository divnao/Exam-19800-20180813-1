package com.huh.dao;

import com.huh.bean.Counter;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface CounterDao {

    public ResultSet getCounter(Connection conn) throws SQLException;

    public int updateCount(Connection conn, Counter counter) throws SQLException;

}
