package classworks.april.apr182018.homework.task3.task2;

public class Menu extends FoodList {

    public Menu() {
        super();
    }

    public String showMenu() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < foodList.size(); i++) {
            Food food = foodList.get(i);
            stringBuilder
                    .append(i + 1)
                    .append(". ")
                    .append(food).append("\n");
        }
        return "Menu:\n" + "N\tType\t\t" + "Price\n" +
                stringBuilder.toString();
    }
}