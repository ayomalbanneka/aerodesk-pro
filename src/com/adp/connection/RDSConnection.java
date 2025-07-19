
package com.adp.connection;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class RDSConnection {

    private static final String url;
    private static final String user;
    private static final String password;
    private static final String driver;

    static {

        try (InputStream stream = RDSConnection.class.getClassLoader().getResourceAsStream("application.properties")) {
            Properties properties = new Properties();

            properties.load(stream);

            url = properties.getProperty("database.url");
            user = properties.getProperty("database.username");
            password = properties.getProperty("database.password");
            driver = properties.getProperty("database.driver");

            Class.forName(driver);

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    private static void setParams(PreparedStatement statement, Object... params) throws SQLException {
        for (int i = 0; i < params.length; i++) {
            statement.setObject(i + 1, params[i]);
        }
    }

    public static int executeUpdate(String query, Object... params) throws SQLException {
        try (Connection connection = getConnection();
             PreparedStatement statement = connection.prepareStatement(query)) {

            setParams(statement, params);
            return statement.executeUpdate();
        }
    }

    public static ResultSet executeQuery(String query, Object... params) throws SQLException {
        Connection connection = getConnection();
        PreparedStatement statement = connection.prepareStatement(query);

        setParams(statement, params);
        return statement.executeQuery();
    }

}
