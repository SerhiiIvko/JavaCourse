package classworks.mar152018.homework.task1;

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

        smartphones[2] = new Smartphones();
        smartphones[3] = new Smartphones();
        smartphones[4] = new Smartphones();

        smartphones[0].printCountryProductionDevice();
        smartphones[0].printBrand();
        smartphones[0].printModelDevice();
        smartphones[0].printPriceDevice();
        smartphones[0].printYearProduction();
        System.out.println();
        System.out.println(smartphones[1].toStringInfo());
    }
}