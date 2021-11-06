package org.example.dao.user;

import java.sql.SQLException;

public class UserDaoFactory {
    private static UserDao dao;

    private UserDaoFactory() {
    }

    public static UserDao getUserDao() throws SQLException {
        if (dao == null) {
            dao = new UserDaoImpl();
        }
        return dao;
    }
}
