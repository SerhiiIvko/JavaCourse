package classworks.dec282017.ternar.task3;

import java.util.Scanner;

/**
 * 3.Сгенерируйте два числа (-10 до 10). Выведите их на экран. Запросите у пользователя какую операцию он хочет
 * произвести: 1 - сложение, 2 – вычитание. Вывести результат на экран.
 */
public class RandomNumber {
    public static void main(String[] args) {
        int a = (int) (Math.random() * 20) - 10;
        int b = (int) (Math.random() * 20) - 10;

        System.out.println("Input code operation: 1 = '+', 2 = '-'");
        Scanner scanner = new Scanner(System.in);
        int code = scanner.nextInt();

        if (code < 1 || code > 2) {
            System.out.println("Incorrect code");
            return;
        }
        System.out.println(a + " and " + b);
        System.out.println(code == 1 ? a + b : a - b);
    }
}
