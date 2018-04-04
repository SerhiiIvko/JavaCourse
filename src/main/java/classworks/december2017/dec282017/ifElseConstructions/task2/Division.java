package classworks.december2017.dec282017.ifElseConstructions.task2;

/**
 * 2.(Тернарный оператор) Если целое число m делится нацело на целое число n, то вывести на экран частное от деления,
 * в противном случае вывести сообщение «m на n нацело не делится»
 */
public class Division {
    public static void main(String[] args) {
        int m = 42;
        int n = 7;
        System.out.println(m % n == 0 ? m / n : "m на n нацело не делится");
    }
}
