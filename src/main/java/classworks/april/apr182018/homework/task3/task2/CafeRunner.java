package classworks.april.apr182018.homework.task3.task2;

import classworks.april.apr182018.homework.task3.task2.command.Command;
import classworks.april.apr182018.homework.task3.task2.command.ExitCommand;
import classworks.april.apr182018.homework.task3.task2.command.MakeOrderCommand;
import classworks.april.apr182018.homework.task3.task2.command.PrintPaymentCommand;

import java.util.*;

public class CafeRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = createMenu();
        System.out.println(menu.showMenu());
        List<Command> commands = new ArrayList<>();
        commands.add(new MakeOrderCommand(menu, scanner));
        commands.add(new PrintPaymentCommand());
        commands.add(new ExitCommand());
        CafeManager cafeManager = new CafeManager(menu, commands);
        cafeManager.work();
        scanner.close();
    }

    private static Menu createMenu() {
        Menu menu = new Menu();
        menu.addFood(new Food("Egg", 5.5));
        menu.addFood(new Food("Bread", 1.5));
        menu.addFood(new Food("Soup", 12.5));
        menu.addFood(new Food("Hot-dog", 8.5));
        menu.addFood(new Food("Tea", 2.5));
        menu.addFood(new Food("Coffee", 4.5));
        menu.addFood(new Food("Cake", 6.5));
        menu.addFood(new Food("Pancake", 8.5));
        menu.addFood(new Food("Beer", 11.5));
        menu.addFood(new Food("Peanuts", 8.5));
        return menu;
    }
}