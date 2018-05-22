package classworks.april.apr182018.homework.task3.task2.command;

import classworks.april.apr182018.homework.task3.task2.Food;
import classworks.april.apr182018.homework.task3.task2.FoodList;

public class PrintPaymentCommand implements Command {
    public static final String NEW_LINE = "\n";
    private FoodList order;

    public void setOrder(FoodList order) {
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(buildOrderInfo());
    }

    public String buildOrderInfo() {
        if (order == null) {
            throw new IllegalArgumentException("Order is not set");
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Your foods:").append(NEW_LINE);
        for (Food food : order) {
            stringBuilder.append(food).append(NEW_LINE);
        }
        double totalScore = getTotalScore();
        double tips = totalScore * 0.1;
        stringBuilder
                .append("Total payment: ")
                .append(totalScore + tips)
                .append(NEW_LINE).append("Where tips are: ")
                .append((float) tips)
                .append("Discount: ")
                .append(getDiscount());


        if (stringBuilder.length() == 0) {
            return "Your order is empty!";
        }

        return stringBuilder.toString();
    }

    private double getTotalScore() {
        double totalScore = 0;
        for (Food food : order) {
            totalScore += food.getPrice();
        }
        if (Double.compare(totalScore, 0) == 0) {
            throw new IllegalArgumentException("Order is empty! Add foods please.");
        }
        return totalScore;
    }

    public String getDiscount() {
        String discount;
        double totalScore = getTotalScore();
        if (totalScore == 0) {
            throw new IllegalArgumentException("Your foods is empty!");
        }
        if (totalScore < 500) {
            discount = "Your discount = 0%";
        } else if (totalScore < 1000) {
            discount = "Your discount = 5%";
        } else if (totalScore < 1500) {
            discount = "Your discount = 10%";
        } else {
            return "Your discount = 15%";
        }
        return discount;
    }
}