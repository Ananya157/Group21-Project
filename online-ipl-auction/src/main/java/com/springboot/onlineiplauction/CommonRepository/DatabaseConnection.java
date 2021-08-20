package com.springboot.onlineiplauction.CommonRepository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DatabaseConnection {
	private final static Logger log = LogManager.getRootLogger();
    private final static String URL = "jdbc:sqlserver://LAPTOP-2I68TEMN;databaseName=onlineiplauction;";
    private final static String userName ="amogh";
    private final static String password = "ZxCv!234";

    public Connection SQLDatabaseConnection() {
        try {
            Connection connection = DriverManager.getConnection(URL, userName, password);
            return connection;

        } catch (SQLException ex) {
            log.error("SQLException: " + ex.getMessage());
            log.error("SQLState: " + ex.getSQLState());
            log.error("VendorError: " + ex.getErrorCode());
            return null;
        }
    }
}
