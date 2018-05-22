package classworks.april.apr182018.homework.task1;

public class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder = stringBuilder
                .append("Наименование товарa: ")
                .append(getName())
                .append(", Цена: ")
                .append(getPrice());
        return stringBuilder.toString();
    }
}