package com.nc.example.lesson8;

import java.util.Arrays;

public class User {
    private int id;
    private String username;
    private String password;
    private Role []roles;
    String group;

    public User(int id, String username, String password, Role[] roles, String group) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.roles = roles;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role[] getRoles() {
        return roles;
    }

    public void setRoles(Role[] roles) {
        this.roles = roles;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password=[HIDDEN]" +
                ", roles=" + Arrays.toString(roles) +
                ", group='" + group + '\'' +
                '}';
    }
}
