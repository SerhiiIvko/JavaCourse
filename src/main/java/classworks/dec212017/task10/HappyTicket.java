package classworks.dec212017.task10;

import java.util.Scanner;

/**
 * 2.Написать программу, которая запрашивает у пользователя номер билетика (шестизначное число). Определить
 * является ли билет счастливым (сумма первых трёх чисел, должна быть равна последним трём).
 * Если билетик счастливый вывести на экран сообщение: «Везунчик! Твой билетик счастливый ».
 * В противном случае: «Увы! Ваш билет не счастливый ».
 */
public class HappyTicket {
    public static void main(String[] args) {
        System.out.println("input 6-char number of ticket!");
        Scanner scanner = new Scanner(System.in);
        int ticketNumber = scanner.nextInt();
        scanner.close();

        if (ticketNumber < 100000 || ticketNumber > 999999) {
            System.out.println("Your input is incorrect");
            return;
        }

        int num1 = ticketNumber % 10;
        ticketNumber = ticketNumber / 10;
        int num2 = ticketNumber % 10;
        ticketNumber = ticketNumber / 10;
        int num3 = ticketNumber % 10;
        ticketNumber = ticketNumber / 10;
        int num4 = ticketNumber % 10;
        ticketNumber = ticketNumber / 10;
        int num5 = ticketNumber % 10;
        ticketNumber = ticketNumber / 10;
        int num6 = ticketNumber % 10;
        int sum1 = (num1 + num2 + num3);
        int sum2 = (num4 + num5 + num6);

        if (sum1 == sum2) {
            System.out.println("Везунчик! Твой билетик счастливый!");
        } else {
            System.out.println("Увы! Твой билет не счастливый!");
        }
    }
}
