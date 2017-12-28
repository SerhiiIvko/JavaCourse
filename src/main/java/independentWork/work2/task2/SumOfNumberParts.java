package independentWork.work2.task2;

//В переменной n хранится натуральное двузначное число. Создайте программу,
//вычисляющую и выводящую на экран сумму цифр числа n.

public class SumOfNumberParts {
    public static void main(String[] args) {
        int number = 99;

        int sumOfParts = (number / 10) + (number % 10);

        System.out.println(sumOfParts);
    }
}
