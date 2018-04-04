package classworks.march2018.mar222018.classwork.task2;

public class BoxingUnboxing {
    public static void main(String[] args) {
        Double number1 = 8.5;
        Integer number2 = 23;
        Character character = 'C';//boxing character 'C' to object
        number1 += 5.2;
        number2 += 56;
        char ch = character;//unboxing character 'C' to char variable

        int sum = ((number1.intValue()) + number2);
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(sum);
        System.out.println(ch);
    }
}