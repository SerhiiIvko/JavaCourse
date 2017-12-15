package independentWork.loops.task2;

/**
 * Проверить простое ли число? (число называется простым, если оно делится только само на себя и на 1)
 */
public class IsPrimeNumber {
    public static void main(String[] args) {
        boolean isPrime = true;
        int a = 190;
        for (int i = 1; i <= a / 2; i++) {
            if (a % 2 == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("Number is prime");
        } else {
            System.out.println("Number is not prime");
        }
    }
}


