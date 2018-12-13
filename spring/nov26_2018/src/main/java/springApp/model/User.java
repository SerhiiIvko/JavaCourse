package model;

public class User {
    int id=0;
    String name="";
    int age=0;
    String src="";

    public User() {
    }

    public User(int id, String name, int age, String src) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.src = src;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }
}
