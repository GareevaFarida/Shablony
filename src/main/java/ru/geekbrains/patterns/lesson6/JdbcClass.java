package ru.geekbrains.patterns.lesson6;

import java.sql.*;

public class JdbcClass {
    static {
        try {
            Class.forName("org.sqlite.JDBC");
            Connection connection = DriverManager.getConnection("jdbc:sqlite:db_students.db");
            String SQLcreateTable = "CREATE TABLE IF NOT EXISTS 'students'" +
                    " ('id'	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT," +
                    "'firstname'	TEXT NOT NULL,'lastname'	TEXT NOT NULL)";
            Statement statement = connection.createStatement();
            statement.executeUpdate(SQLcreateTable);

            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static JdbcClass jdbc = new JdbcClass();
    private Connection connection;

    public static JdbcClass getInstance() {
        return jdbc;
    }


    private JdbcClass() {
        try {
            this.connection = DriverManager.getConnection("jdbc:sqlite:db_students.db");
            System.out.println("Connection with database established!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

    void disconnect() {
        try {
            if (!connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
