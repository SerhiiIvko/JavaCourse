package classworks.february2018.feb152018.classwork.task2;

import java.util.Scanner;

public class PrimeDivision {
    static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int u = scanner.nextInt();
            scanner.close();
            if (u > 0) {
                if (isPrime(u)) {
                    System.out.println("число простое");
                } else {
                    System.out.println("делители: ");
                    for (int i = (int) Math.sqrt(u); i >= 2; i--) {
                        if (u % i == 0 && isPrime(i)) {
                            System.out.println(i + " ");
                        }
                    }
                    System.out.println();
                }
            } else {
                System.out.println("число отрицательное");
            }
        } else {
            System.out.println("число не целое");
        }
    }
}