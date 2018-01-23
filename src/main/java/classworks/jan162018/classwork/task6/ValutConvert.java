package classworks.jan162018.classwork.task6;

/**
 * 6.Напечатать таблицу перевода 1, 2 ... 20 долларов США в гривны по текущему курсу (значение курса вводится с клавиатуры).
 */
public class ValutConvert {
    public static void main(String[] args) {
        double courseDollar = 28.55;
        double sumInGrivnas = 0;
        for (int i = 1; i < 21; i++) {
            sumInGrivnas += courseDollar;
            System.out.println(i + " dollars is " + (float) sumInGrivnas + " grivnas");
        }
    }
}
