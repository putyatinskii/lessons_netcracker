package com.nc.example.lesson12;

public class A {

    @PropertyValue(value = "${user.name}")
    private String userName;
    @PropertyValue(value = "${user.password}")
    private String userPassword;
    @PropertyValue(value = "${DB.name}")
    private String dataBaseName;

    @PropertyObjectValue(value = "${obj.info}")
    private SetObject inf;

    public A() {

    }

    public String getUserName() {
        return userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public String getDataBaseName() {
        return dataBaseName;
    }

    public Object getInf() {
        return inf;
    }

    @Override
    public String toString() {
        return "A{" +
                "userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", dataBaseName='" + dataBaseName + '\'' +
                ", inf=" + inf +
                '}';
    }
}
