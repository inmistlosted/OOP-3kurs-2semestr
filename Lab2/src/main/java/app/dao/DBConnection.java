package app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static Connection initDB() throws SQLException, ClassNotFoundException {

        /**
            У цій лабораторній роботі мені не вдалося встановити БД PostgreSQL,
            чомусь не вдавалося запустити встановлювач.
            Тому я тут використовував БД MySQL
        */

        String dbDriver = "com.mysql.jdbc.Driver";
        String dbURL = "jdbc:mysql://localhost:3306/";
        String dbName = "lowcostdb";
        String dbUsername = "root";
        String dbPassword = "admin";

        Class.forName(dbDriver);
        return DriverManager.getConnection(dbURL + dbName, dbUsername, dbPassword);
    }
}
