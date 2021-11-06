package org.example.dao.user;


import org.example.dao.user.UserDao;
import org.example.jdbc.ConnectionFactory;
import org.example.shared.User;

import java.sql.*;

public class UserDaoImpl implements UserDao {

    Connection connection;
    String tableName = "users";

    public UserDaoImpl() throws SQLException {
        this.connection = ConnectionFactory.getConnection();
    }

    @Override
    public int register(String username, String password) throws SQLException {
        String sql = "insert into " + tableName + " (username, password) values (?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, password);
        int count = preparedStatement.executeUpdate();
        if (count > 0) {
            ResultSet keys = preparedStatement.getGeneratedKeys();
            if (keys.next()) {
                System.out.println("User saved");
                return keys.getInt(1);
            }
        }
        throw new SQLException("Oops! something went wrong");
    }

    @Override
    public boolean login(String username, String password) throws SQLException {
        //User user = null;
        String sql = "select * from " + tableName + " where username = '" + username + "' and password = '" + password + "'";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        if (resultSet.next()) {
            return true;
//            int userId = resultSet.getInt(1);
//            user = new User(userId, username, password);

        } else {
            System.out.println("Our system didn't find username/password");
            return false;
        }

        //return user;
    }

    @Override
    public int findUserId(String username, String password) throws SQLException {
        int id = -1;
        String sql = "select * from " + tableName + " where username = '" + username + "' and password = '" + password + "'";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        if (resultSet.next()) {

            id = resultSet.getInt(1);

        } else {
            System.out.println("Our system didn't find username/password");

        }
        return id;
    }
}
