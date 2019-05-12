package by.bsac.connectionPool;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionPool {
    //static final String JDBC_DRIVER = "org.mariadb.jdbc.Driver";
    static final String JDBC_DB_URL = "jdbc:mariadb://localhost:3306/Lab4";

    static final String JDBC_USER = "Lab4";
    static final String JDBC_PASS = "Lab4";

    static Connection connection;

    public static Connection getConnection() {
        try {
            connection = DriverManager.getConnection(JDBC_DB_URL, JDBC_USER, JDBC_PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }

    public static void closeConnection() {
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

