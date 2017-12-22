package classworks.dec212017.task8;

import java.util.Scanner;

/**
 * 5.Сгенерируйте число от 0 до 100. Пользователь должен угадать полученное число за 7 попыток. После каждой попытки
 * выводим сообщение «Мало» или «Много» (подсказка для пользователя). Если после семи попыток пользователь не смог
 * угадать число, сообщите ему о проигрыше и какое число было загадано.
 */
public class Ugadaika {
    public static void main(String[] args) {
        System.out.println("Input your number: ");

        int secret = (int) (Math.random() * 50);
        Scanner scanner = new Scanner(System.in);
        int userTry = 0;
        int number1;
        while (userTry < 7) {
            number1 = scanner.nextInt();
            if (number1 < secret) {
                System.out.println("So few!");
            } else if (number1 > secret) {
                System.out.println("So much!");
            } else if (number1 == secret) {
                System.out.println("You win! Secret number is " + secret);
                System.exit(0);
            } else {
                System.out.println("You loose!");
                System.exit(0);
            }
            userTry++;
        }
        scanner.close();
        System.out.println("You loose! Number was " + secret);
    }
}
