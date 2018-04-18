package classworks.april.apr052018.homework.task2;

/**
 * Created by ivko on 09.04.18.
 */
public class Product {
    private String kind;
    private double price;

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Incorrect price");
        }
    }

    public String getKind() {
        return kind;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product info: " + kind + ", price: $" + price;
    }
}