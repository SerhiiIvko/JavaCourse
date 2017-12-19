package independentWork.work1.methods.task2.two;

import java.util.Scanner;

/**
 * Created by ivko on 19.12.17.
 */
public class NameValue {

    public static void main(String[] args) {

    }

    enum Hungreds {
        Сто, Двести, Триста, Четыреста, Пятьсот, Шестьсот, Семьсот, Восемьсот, Девятьсот
    }

    public static void getValue() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        //String value = Hungreds.valueOf();
    }
}
