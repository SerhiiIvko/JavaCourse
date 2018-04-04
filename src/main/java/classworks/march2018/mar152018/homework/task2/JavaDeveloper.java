package classworks.march2018.mar152018.homework.task2;

public class JavaDeveloper implements Developer, Human {

    private String name;

    JavaDeveloper(String name) {
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
        return "Java Developer name: " + name;
    }
}