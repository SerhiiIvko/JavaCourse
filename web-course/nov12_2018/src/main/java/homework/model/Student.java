package homework.model;

import java.io.Serializable;

//Написать класс сущность Студент содержащий три поля
//Фамилия Имя  Отчество
//создать Свой ТЕГ  выводящий на экран фио студента одной строкой

public class Student implements Serializable {
    private static final long serialVersionUID = -7625326765881520130L;
    private String name;
    private String secondName;
    private String surname;

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
        return name + ' ' + secondName + ' ' + surname;
    }
}