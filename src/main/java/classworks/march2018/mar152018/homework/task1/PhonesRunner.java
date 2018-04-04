package classworks.march2018.mar152018.homework.task1;

/**
 * Создать интерфейсы: Товар <- Телефоны и планшеты <- Мобильные телефоны
 * Класс Смартфоны должен реализовать указанные интерфейсы и содержать дополнительно 4-5 полей.
 * На базе класса Смартфоны создать как минимум пять экземпляров класса.
 * В качестве источника информации о характеристиках товаров можно взять магазины
 * fotomag.com.ua или rozetka.com.ua
 */
public class PhonesRunner {
    public static void main(String[] args) {
        String nameBrand = "LG";
        String nameModel = "Star-2";
        String countryProduction = "China";
        double price = 700;
        int yearProduction = 2015;
        Smartphones[] smartphones = new Smartphones[5];

        smartphones[0] =
                new Smartphones("Nokia", "d7", "Denmark", 1000, 2016);

        smartphones[1] = new Smartphones();
        smartphones[1].setBrandName(nameBrand);
        smartphones[1].setModelName(nameModel);
        smartphones[1].setCountryProduction(countryProduction);
        smartphones[1].setPrice(price);
        smartphones[1].setYearProduction(yearProduction);

        smartphones[2] =
                new Smartphones("Xiaomi", "Note 4X Pro", "China", 5000, 2017);
        smartphones[3] =
                new Smartphones("Philips", "CY", "Indonesia", 2000, 2015);
        smartphones[4] =
                new Smartphones("Asus", "X11", "China", 4000, 2015);

        smartphones[0].printCountryProductionDevice();
        smartphones[0].printBrand();
        smartphones[0].printModelDevice();
        smartphones[0].printPriceDevice();
        smartphones[0].printYearProduction();
        System.out.println();
        System.out.println(smartphones[1].toString());
        System.out.println();
        System.out.println(smartphones[2].toString());
        System.out.println();
        System.out.println(smartphones[3].toString());
        System.out.println();
        System.out.println(smartphones[4].toString());

    }
}