package classworks.march2018.mar022018.classwork.task1;

class C {
    int x;//this ссылается сюда при одинаковых именах переменных
    String name = "Zed";
    String surname;

    C(int xenon) {
        this.x = 12 + xenon;

    }

    C(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}

public class Task1 {
    public static void main(String[] args) {
        C c = new C(3);
        C c1 = new C("fooo", "Yes");

        System.out.println(c1.surname + c1.name);
//        System.out.println(c1.name);
        System.out.println(c.x);
        System.out.println(c.name);
    }
}
