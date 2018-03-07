package classworks.mar022018.homework.task1;

import classworks.feb152018.classwork.task4.A;

import javax.swing.text.Segment;
import java.util.Scanner;

/**
 * 1)Создайте класс Account, у которого будет метод дебет, который будет снимать деньги с учетной записи. Убедитесь,
 * что сумма дебетов не превышает баланс счета. Если это так, баланс должен быть оставлен без изменений, и метод должен
 * напечатать сообщение:
 * -Дебит суммы превысил остаток на счете или
 * -Недостаточно средств на счету (как решите сами)
 * В классе AccountTest создать логику дебетования.
 */
public class AccountTest {
    public static void main(String[] args) {
        int cash;
        Account account = new Account(200);
        System.out.println("Input sum of cash");
        Scanner scanner = new Scanner(System.in);
        cash = scanner.nextInt();
        scanner.close();
        account.debit(cash);
        if (account.getBalance() < 0) {
            account.printBalance();
            System.out.println("Current balance = " + (cash + account.getBalance()));
        } else {
            account.printBalance();
        }
    }
}