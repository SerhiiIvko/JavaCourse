package classworks.april.apr182018.homework.task3.task2.command;

import classworks.april.apr182018.homework.task3.task2.FoodList;
import classworks.april.apr182018.homework.task3.task2.Menu;

import java.util.Arrays;
import java.util.Scanner;

public class MakeOrderCommand implements Command {
    private Menu menu;
    private FoodList order;
    private Scanner scanner;

    public MakeOrderCommand(Menu menu, Scanner scanner) {
        this.menu = menu;
        this.scanner = scanner;
    }

    @Override
    public void execute() {
        order = new FoodList();
        addFoodToOrder();
    }

    public FoodList getOrder() {
        return order;
    }

    public void addFoodToOrder() {
        System.out.print("Input all numbers of food to add to your order: ");
        String orderLine = scanner.nextLine();
        orderLine = orderLine.replaceAll(" ", "");
        String[] orders = orderLine.split(",");
        Arrays.stream(orders).map(Integer::parseInt).forEach(index -> order.addFood(menu.get(index)));
    }
}