//package model;
//
//import java.io.Serializable;
//
////Создать две странички
////Ввода имени и приветствия
////после ввода имени на страничке приветствия отображается Введћнное имя
////при последующих попытках попасть на страницу ввода имени вы попадаете на страницу приветствия
////сделать с помощью Куки
//
//public class Student implements Serializable {
//    private static final long serialVersionUID = -7625326765881520130L;
//    private String name;
//    private String secondName;
//    private String surname;
//
//    public String getName() {
//        return name;
//    }
//
//    public String getSecondName() {
//        return secondName;
//    }
//
//    public String getSurname() {
//        return surname;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setSecondName(String secondName) {
//        this.secondName = secondName;
//    }
//
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    @Override
//    public String toString() {
//        return name + ' ' + secondName + ' ' + surname;
//    }
//}