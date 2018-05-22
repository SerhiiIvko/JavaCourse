package classworks.april.apr182018.homework.task1;

import java.util.List;

public class Producer {
    private String name;
    private List<Product> products;


    public Producer(String name, List<Product> products) {
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public List<Product> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder = stringBuilder
                .append(getName());
        return stringBuilder.toString();
    }
}