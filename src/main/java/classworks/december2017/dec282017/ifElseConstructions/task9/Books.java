package classworks.december2017.dec282017.ifElseConstructions.task9;

import java.util.Scanner;

/**
 * 9.На ввод в программу натурального числа из диапазона [1..25] программа выводит это число и согласованное с ним слово
 * «книга». Например, на ввод числа 1 программа выводит «1 книга», на ввод числа 2 — «2 книги» и т. д.
 */
public class Books {
    public static void main(String[] args) {
        System.out.println("Input number of book");
        Scanner scanner = new Scanner(System.in);
        int book = scanner.nextInt();
        scanner.close();

        if (book < 0 || book > 25) {
            System.out.println("Incorrect input");
            return;
        }

        if (book == 1 || book == 21) {
            System.out.println(book + " книга");
        } else if (book == 2 || book == 3 || book == 4 ||
                book == 22 || book == 23 || book == 24) {
            System.out.println(book + " книги");
        } else {
            System.out.println(book + " книг");
        }
    }
}
