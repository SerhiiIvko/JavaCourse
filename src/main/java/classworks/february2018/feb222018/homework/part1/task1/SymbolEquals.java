package classworks.february2018.feb222018.homework.part1.task1;

import java.util.Scanner;

/**
 * Написать метод, который получает слово и определяет одинаковы ли второй и четвертый символы в нем.
 */
public class SymbolEquals {
    public static void equalsCharOfString(String str) {
        System.out.println((str.charAt(1) == str.charAt(3)) ? "Second and fours characters are equals" :
                "Second and fours characters are not equals");
    }

    public static void main(String[] args) {
        System.out.println("Input word");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        scanner.close();
        equalsCharOfString(string);
    }
}
