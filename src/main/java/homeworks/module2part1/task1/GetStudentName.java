package homeworks.module2part1.task1;

import java.util.Scanner;

/**
 * Задание 2:
 * 1. Создайте объект типа Scanner (не забываем закрывать в конце приложения).
 * 2. Запросите у юзера данные: Ф.И.О одной строкой и возраст.
 * 3. Выведите на экран введённые юзером данные.
 */
public class GetStudentName {
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
