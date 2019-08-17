package classworks.dec262017.task14;

//3.С начала 1990 года (01.01.90) по некоторый день прошло n (запросить у пользователя) месяцев и 2 дня. Определить название месяца.

import java.util.Scanner;

public class FindMonth {
    public static void main(String[] args) {
        System.out.println("Введите количество дней с начала года");
        Scanner scanner = new Scanner(System.in);
        int daysNumber = scanner.nextInt();
        scanner.close();

        if (daysNumber < 0) {
            System.out.println();
        }


    }
}
