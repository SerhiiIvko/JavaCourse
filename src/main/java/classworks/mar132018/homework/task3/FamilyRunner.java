package classworks.mar132018.homework.task3;

public class FamilyRunner {
    public static void main(String[] args) {
        Father father = new Father();
        Son son = new Son();

        System.out.print("Father: ");
        father.sleep();
        System.out.print("Son: ");
        son.sleep();
    }
}