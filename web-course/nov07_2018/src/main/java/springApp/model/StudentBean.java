package model;

//﻿Написать класс сущность Студент содержащий три поля
// Фамилия Имя  Отчество
// создать JSP  файл
// создающий бин "Студент" конструкцией <jsp:useBean
// И выводящий на экран фио студента в теге <h1> одной строкой с помощью EL выражений

import java.io.Serializable;

public class StudentBean implements Serializable {
    private static final long serialVersionUID = -6993270315309160896L;
    private String name;
    private String secondName;
    private String surname;

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "<h1>" + name + ' ' + secondName + ' ' + surname + "</h1>";
    }
}