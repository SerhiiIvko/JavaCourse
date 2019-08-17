package independentWork.work2.task3;

//В переменной n хранится вещественное число с ненулевой дробной частью. Создайте
//программу, округляющую число n до ближайшего целого и выводящую результат на
//экран.

public class RoundInt {
    public static void main(String[] args) {
        float number = 3.54f;
        int roundFloat = Math.round(number);

        System.out.println(roundFloat);
    }
}
