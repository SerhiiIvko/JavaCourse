package classworks.dec282017.ifElseConstructions.task7;

/**
 * 7.Определить, верно ли, что при делении неотрицательного целого числа a на положительное число b  получается остаток,
 * равный одному из двух заданных чисел c или d.
 */
public class AdivisionB {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 2;
        int d = 1;

        System.out.println(a % b == c || a % b == d ? "Yes" : "No");
    }
}
