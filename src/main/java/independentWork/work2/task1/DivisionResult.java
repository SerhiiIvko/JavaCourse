package independentWork.work2.task1;

//В переменных x и y хранятся два натуральных числа. Создайте программу, выводящую
//на экран результат деления x на y с остатком.

public class DivisionResult {
    public static void main(String[] args) {
        int x = 31;
        int y = 8;
        int result = x / y;
        int stayOfDivision = x % y;

        System.out.println(result + "." + stayOfDivision);

        float resultDivision = (float) x / y;

        System.out.println(resultDivision);
    }
}
