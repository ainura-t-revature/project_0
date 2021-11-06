package org.example.dao.user;

import org.example.shared.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDao {
    int register(String username, String password) throws SQLException;
    boolean login(String username, String password) throws SQLException;
    int findUserId(String username, String password) throws SQLException;
}
