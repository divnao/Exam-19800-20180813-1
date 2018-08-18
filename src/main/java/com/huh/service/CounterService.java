package com.huh.service;

import com.huh.bean.Counter;
import com.huh.dao.CounterDao;
import com.huh.dao.impl.CounterDaoImpl;
import com.huh.jdbc.ConnectionFactory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CounterService {

    private CounterDaoImpl counterDao = new CounterDaoImpl();


    private static final Connection conn = ConnectionFactory.getInstance().getConnection();

    public int getCount() throws SQLException {
        ResultSet rs = counterDao.getCounter(conn);
        int count = 0;
        while (rs.next()) {
            count = rs.getInt(1);
        }
        return count;
    }

    public void updateCount(Counter counter) throws SQLException {
        counterDao.updateCount(conn, counter);
    }
}
