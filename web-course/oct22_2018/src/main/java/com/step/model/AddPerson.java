package com.step.model;

//Создать три сепвлета или один обрабатывающий три действия
//создание,ребактирование и удаления пользователя в базе данных

public class AddPerson {
    private String name;
    private String email;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}