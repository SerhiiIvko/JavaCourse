package classworks.march2018.mar152018.homework.task2;

public class CppDeveloper implements Developer, Human {
    private String name;

    CppDeveloper(String name) {
        this.name = name;
    }

    @Override
    public void breathe() {
        System.out.println(name + " breathe");
    }

    @Override
    public void writeCode() {
        System.out.println(name + " write code");
    }

    @Override
    public void enjoyingLife() {
        System.out.println(name + " enjoying life");
    }

    @Override
    public String toString() {
        return "C++ Developer name: " + name;
    }
}