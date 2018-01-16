package classworks.dec282017.ifElseConstructions.task10;

import java.util.Scanner;

/**
 * 10. Составить программу, позволяющую получить словесное описание школьных отметок (1 — «плохо»,
 * 2 — «неудовлетворительно», 3 — «удовлетворительно», 4 — «хорошо», 5 — «отлично»).
 */
public class SchoolRates {
    public static void main(String[] args) {
        System.out.println("Введите школьную отметку от 1 до 5");
        Scanner scanner = new Scanner(System.in);
        int rate = scanner.nextInt();
        scanner.close();

        switch (rate) {
            case 1:
                System.out.println("Плохо");
                break;
            case 2:
                System.out.println("Неудовлетворительно");
                break;
            case 3:
                System.out.println("Удовлетворительно");
                break;
            case 4:
                System.out.println("Хорошо");
                break;
            case 5:
                System.out.println("Отлично");
                break;
            default:
                System.out.println("Некорректный ввод");
        }
    }
}
