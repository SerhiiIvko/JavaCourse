package classworks.december2017.dec142017.task1;

import java.util.Scanner;

public class NameAgeStudent {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input student name: ");
        String nameStudent = scanner.nextLine();
        System.out.println("Input student age: ");
        int ageStudent = scanner.nextInt();
        scanner.close();

        System.out.println("Student name: " + nameStudent);
        System.out.println("Student age: " + ageStudent);
    }
}
