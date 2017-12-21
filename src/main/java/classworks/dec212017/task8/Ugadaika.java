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
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        scanner.close();
    }
}
