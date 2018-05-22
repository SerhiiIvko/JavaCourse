package classworks.april.apr182018.homework.task2;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<Food> foodList;

    public Menu(List<Food> foodList) {
        this.foodList = new ArrayList<>(foodList);
    }

    public String showMenu() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < foodList.size(); i++) {
            Food food = foodList.get(i);
            stringBuilder
                    .append(i + 1)
                    .append(". ")
                    .append(food)
                    .append("\n");
        }
        return "Меню блюд:\n" + "Название            " + "Цена\n" +
                stringBuilder.toString();
    }
}