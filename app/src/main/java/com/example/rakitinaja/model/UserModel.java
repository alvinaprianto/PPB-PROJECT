package com.example.rakitinaja.model;

public class UserModel {

    String name, phone, password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserModel(String name, String phone, String password) {
        this.name = name;
        this.phone = phone;
        this.password = password;
    }

    public UserModel(){

    }
}
