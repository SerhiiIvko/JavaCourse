package classworks.jan162018.classwork.task5;

/**
 * 5.Одна единица некоторого товара стоит 24,5 грн. Напечатать таблицу стоимости 2, 3 ... 20 штук этого товара.
 */
public class PrintPrice {
    public static void main(String[] args) {
        double price = 24.5;
        double resultPrice = 0;
        for (int i = 2; i <= 20; i++) {
            resultPrice = resultPrice + price;
            System.out.println(i + " штук товара будут стоить " + resultPrice + " грн.");
        }
    }
}
