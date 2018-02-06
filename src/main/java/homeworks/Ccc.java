package homeworks;

import java.util.Scanner;

public class Ccc {
    public static void main(String[] args) {
        System.out.println("Input your string");
        Scanner scanner = new Scanner(System.in);
        String userString = scanner.nextLine();
        System.out.println("Input your substring");
        String userSubString = scanner.nextLine();
        scanner.close();
        boolean isStringContainSubstring = false;
        userString = userString.toLowerCase();
        userSubString = userSubString.toLowerCase();
        if (userString.length() < userSubString.length()) {
            System.out.println("Incorrect input");
            return;
        }

//        char [] usrStr = new char[userString.length()];
//        char[] usrSbStr = new char[userSubString.length()];

        int index = 0;

        for (int i = 0; i < userString.length(); i++) {
            if (userSubString.charAt(index) == userString.charAt(i)) {
                index++;
                isStringContainSubstring = true;
            } else {
                index = 0;
            }
        }
        //System.out.println("String " + usrStr + " contains " + usrSbStr);
        System.out.println(isStringContainSubstring);
    }
}