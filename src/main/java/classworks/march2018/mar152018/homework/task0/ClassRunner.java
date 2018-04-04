package classworks.march2018.mar152018.homework.task0;

public class ClassRunner {
    public static void main(String[] args) {
        Developer developer = new Developer("Ivan Petrov", "Programming", "Java Developer");
        Pilot pilot = new Pilot("Dima Sidorov", "Passenger transporting", "Boeing-860");
        Profession developer2 = new Developer("Simon Spilberg", "Programming", "C++ Developer");

        developer.toWork();
        System.out.println(developer.toString());
        System.out.println();
        pilot.toWork();
        System.out.println(pilot.toString());
        System.out.println();
        developer2.toWork();
        System.out.println(developer2.toString());
    }
}
