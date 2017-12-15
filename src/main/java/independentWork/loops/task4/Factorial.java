package independentWork.loops.task4;

/**
 * Вычислить факториал числа n. n! = 1*2*...*n-1*n;!
 */
public class Factorial {
    public static void main(String[] args) {
        int n = 5;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
