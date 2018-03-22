package classworks.mar152018.homework.task1;

public class Smartphones implements Product, PhonesAndTablets, MobilePhones {
    private String brandName;
    private String modelName;
    private String countryProduction;
    private double price;
    private int yearProduction;

    Smartphones() {

    }

    public Smartphones(String brandName, String modelName, String countryProduction, double price, int yearProduction) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.countryProduction = countryProduction;
        this.price = price;
        this.yearProduction = yearProduction;
    }

    public String getBrandName() {
        return brandName;
    }

    public int getYearProduction() {
        return yearProduction;
    }

    public String getModelName() {
        return modelName;
    }

    public String getCountryProduction() {
        return countryProduction;
    }

    public double getPrice() {
        return price;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setCountryProduction(String countryProduction) {
        this.countryProduction = countryProduction;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setYearProduction(int yearProduction) {
        this.yearProduction = yearProduction;
    }

    @Override
    public void printBrand() {
        System.out.println("Name of brand " + getBrandName());
    }

    @Override
    public void printYearProduction() {
        System.out.println("Year of production " + getYearProduction());
    }

    @Override
    public void printModelDevice() {
        System.out.println("Model of device " + getModelName());
    }

    @Override
    public void printPriceDevice() {
        System.out.println("Price of device UAH " + getPrice());
    }

    @Override
    public void printCountryProductionDevice() {
        System.out.println("Country of production " + getCountryProduction());
    }

    public String toString() {
        return "Smartphone description: \n" +
                "Brand: '" + brandName + '\'' + "\n" +
                "Model: '" + modelName + '\'' + "\n" +
                "Country production: " + countryProduction + "\n" +
                "Price: UAH " + price + "\n" +
                "Year production: " + yearProduction;
    }
}