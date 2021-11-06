package org.example.shared;

import org.example.dao.user.UserDao;
import org.example.dao.user.UserDaoFactory;

import java.sql.SQLException;

public class User {
    private int id;
    private String username;
    private String password;
    private boolean isLoggedIn;
    UserDao dao = UserDaoFactory.getUserDao();

    public User(String username, String password) throws SQLException {
        // we register here
        this.username = username;
        this.password = password;

        // first find user and log them in
        int id = dao.findUserId(username, password);
        if (id == -1) {
            id = dao.register(username, password);
        }
        this.id = id;
        this.isLoggedIn = false;
        // call db
        // addUser(this);
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return this.id;
    }

    public boolean isLoggedIn() {
        return this.isLoggedIn;
    }

    // check in the database if credentials are correct
    public boolean login() throws SQLException {
        if (this.isLoggedIn) {
            System.out.println("Already logged in");
        } else {
            this.isLoggedIn = dao.login(this.username, this.password);
        }
        return this.isLoggedIn;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='********'" +
                ", isLoggedIn=" + isLoggedIn +
                '}';
    }
}
