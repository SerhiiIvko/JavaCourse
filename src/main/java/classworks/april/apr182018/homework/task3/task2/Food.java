package classworks.april.apr182018.homework.task3.task2;

public class Food {
    private String foodName;
    private double price;

    public Food(String foodName, double price) {
        this.foodName = foodName;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return foodName + "\t\t\t" + price;
    }
}