package classworks.feb222018.controlwork.task1;

import java.util.Scanner;

/**
 * Проверить валидность пароля. Пароль должен состоять из букв и цифр. Допустимая длина 8 символов. Должен содержать не
 * менее 2 цифр.
 */
public class Password {
    private static String readNumber(Scanner scanner, String inviteText) {
        String s = "";
        System.out.println(inviteText);
        while (s.length() != 8) {
            if (!scanner.hasNextLine()) {
                System.out.println("Password must contain 8 symbols!");
                scanner.next();
            } else {
                s = scanner.nextLine();
                if (s.length() != 8) {
                    System.out.println("Password must contain 8 symbols!");
                }
            }
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = readNumber(scanner, "Input password: ");
        scanner.close();
        password = password.trim();
        password = password.toLowerCase();
        char[] passwordArr = password.toCharArray();
        if ((countDigits(password) > 2) && isContainLetters(passwordArr)) {
            System.out.println("password correct");
        } else {
            System.out.println("password invalid");
            return;
        }
    }

    public static boolean isContainLetters(char[] password) {
        boolean isConLet = false;
        for (int i = 0; i < password.length; i++) {
            if (((password[i] >= 'a') && (password[i] <= 'z'))) {
                isConLet = true;
            }
        }
        return isConLet;
    }

    public static int countDigits(String password) {
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}