package classworks.april.apr182018.homework.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuManager {
    private double totalScore;

    public List<Food> makeOrder(List<Food> menu, Scanner scanner) {
        List<Food> order = new ArrayList<>();
        while (true) {
            System.out.print("Введите номер блюда из предложенного меню (Для подтверждения заказа введите 0): ");
            String input = scanner.nextLine();
            if (!Character.isDigit(input.charAt(0))) {
                System.out.println("Вводите только положительные цифры!");
                makeOrder(menu, scanner);
            }
            int code = Integer.parseInt(input);
            if (code > menu.size()) {
                System.out.println("Блюда с таким номером в списке не существует");
                makeOrder(menu, scanner);
            }
            if (code > 0) {
                order.add(menu.get(code - 1));
            } else {
                break;
            }
        }
        if (!order.isEmpty()) {
            System.out.println(getOrderInfo(order));
        } else {
            System.out.println("Вы не заказали ни одного блюда");
        }
        return order;
    }

    private String getOrderInfo(List<Food> order) {
        System.out.println("Ваш заказ: ");
        double tips;
        StringBuilder stringBuilder = new StringBuilder();
        for (Food foods : order) {
            stringBuilder.append(foods).append("\n");
        }
        tips = getTotalScore(order) * 0.1;
        stringBuilder
                .append("Общий счёт: ")
                .append((float) totalScore + tips - (getDiscount() / 100))
                .append("\n").append("Из них чаевые официанту: ")
                .append((float) tips)
                .append("\nВаша скидка: ")
                .append(getDiscount())
                .append(" %");
        return stringBuilder.toString();
    }

    private double getTotalScore(List<Food> order) {
        for (Food food : order) {
            totalScore += food.getPrice();
        }
        return totalScore;
    }

    private double getDiscount() {
        if (totalScore < 50) {
            return 0;
        } else if (totalScore >= 50) {
            return 5;
        } else if (totalScore <= 199) {
            return 10;
        } else if (totalScore > 200) {
            return 15;
        }
        throw new IllegalArgumentException();
    }
}