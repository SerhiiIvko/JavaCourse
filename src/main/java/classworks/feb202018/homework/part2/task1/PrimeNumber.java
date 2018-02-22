package classworks.feb202018.homework.part2.task1;

import java.util.Scanner;

/**
 * Написать   рекурсивную функцию, определяющую, является ли заданное натуральное число простым (простым называется
 * натуральное число, больше 1, не имеющее других делителей кроме единицы и самого себя).
 */
public class PrimeNumber {
    public static int isNumberPrime(int number, int prime) {
        if (prime == 1) {
            return 1;
        } else if (number % prime == 0) {
            return 0;
        } else {
            return isNumberPrime(number, prime - 1);
        }
    }

    private static int readNumber(Scanner scanner, String inviteText) {
        int number = -1;
        System.out.println(inviteText);
        while (number < 2) {
            if (!scanner.hasNextInt()) {
                System.out.println("Input only natural positive digits more 1!");
                scanner.next();
            } else {
                number = scanner.nextInt();
                if (number < 2) {
                    System.out.println("Number must be positive and more 1!");
                }
            }
        }
        return number;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = readNumber(scanner, "Input positive number");
        scanner.close();
        int prime = isNumberPrime(number, number / 2);
        System.out.println(prime == 1 ? "Number is prime" : "Number is not prime");
    }
}