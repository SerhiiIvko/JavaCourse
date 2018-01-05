package classworks.dec282017.ifElseConstructions.task10;

import java.util.Scanner;

/**
 * 10. Составить программу, позволяющую получить словесное описание школьных отметок (1 — «плохо»,
 * 2 — «неудовлетворительно», 3 — «удовлетворительно», 4 — «хорошо», 5 — «отлично»).
 */
public class SchoolRates {
    public static void main(String[] args) {
        System.out.println("Input rate number");
        Scanner scanner = new Scanner(System.in);
        int rate = scanner.nextInt();
        scanner.close();

        switch (rate) {
            case 1:
                System.out.println("Bad");
                break;
            case 2:
                System.out.println("Not bad");
                break;
            case 3:
                System.out.println("Better");
                break;
            case 4:
                System.out.println("Good");
                break;
            case 5:
                System.out.println("Great");
                break;
            default:
                System.out.println("Incorrect input");
        }
    }
}
