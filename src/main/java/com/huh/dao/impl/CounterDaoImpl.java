package com.huh.dao.impl;

import com.huh.bean.Counter;
import com.huh.dao.CounterDao;

import javax.net.ssl.SSLContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * Counter Dao implementation.
 *
 * @author huh
 */
public class CounterDaoImpl implements CounterDao {

    public ResultSet getCounter(Connection conn) throws SQLException {
        PreparedStatement ps = conn.prepareStatement("SELECT counter FROM counter");
        return ps.executeQuery();
    }

    public int updateCount(Connection conn, Counter counter) throws SQLException{
        PreparedStatement ps = conn.prepareStatement("update counter set counter = ? where counter = ?");
        int preCount = counter.getCount() - 1;
        int concurrentCount = preCount + 1;
        ps.setInt(1, concurrentCount);
        ps.setInt(2, preCount);
        ps.execute();
        return 0;
    }
}
