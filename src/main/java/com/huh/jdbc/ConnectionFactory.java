package com.huh.jdbc;


import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

/**
 * Mysql Connection Factory.
 *
 * @author huh.
 * @date 2018/08/09.
 */
public class ConnectionFactory {

    private static String driver;
    private static String dbUrl;
    private static String user;
    private static String password;

    private Connection conn;

    private static final ConnectionFactory CONNECTION_FACTORY = new ConnectionFactory();

    static {
        try {
            Properties prop = new Properties();
            InputStream in = new FileInputStream("/home/huh/test/Exam-19800-20180813-1/src/jdbc.properties");
//            InputStream in = ConnectionFactory.class.getClassLoader().getResourceAsStream("jdbc.properties");
            prop.load(in);
            driver = prop.getProperty("driver");
            dbUrl = prop.getProperty("dburl");
            user = prop.getProperty("user");
            password = prop.getProperty("password");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private ConnectionFactory() {}

    public static ConnectionFactory getInstance() {
        return CONNECTION_FACTORY;
    }

    public Connection getConnection() {
        try {
            Class.forName(driver.trim());
            conn =  DriverManager.getConnection(dbUrl.trim(), user.trim(), password.trim());
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


}
