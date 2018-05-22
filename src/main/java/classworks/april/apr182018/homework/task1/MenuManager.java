package classworks.april.apr182018.homework.task1;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MenuManager {
    private String description;

    public void displayMainMenu(Scanner scanner, List<Producer> producers) {
        description = " * 1. Показать производителей\n * 2. Выход";
        while (true) {
            System.out.println(description);
            System.out.print("Введите код операции: ");
            String input = scanner.nextLine();
            int choice = 0;
            if (!Character.isDigit(input.charAt(0))) {
                System.out.println("Input digits only!");
                displayMainMenu(scanner, producers);
            } else {
                choice = Integer.parseInt(input);
            }
            switch (choice) {
                case 1:
                    displaySecondMenu(scanner, producers);
                    break;
                case 2:
                    System.out.println("Программа успешно завершена");
                    System.exit(1);
                    break;
                default:
                    System.out.println("Некорректный ввод");
            }
        }
    }

    public void displaySecondMenu(Scanner scanner, List<Producer> producers) {
        for (int i = 0; i < producers.size(); i++) {
            System.out.println(i + 1 + ". " + producers.get(i));
        }
        description = " * Введите номер производителя из списка\n * Введите 0 для перехода в главное меню";
        while (true) {
            System.out.println(description);
            System.out.print("Введите код операции: ");
            String input = scanner.nextLine();
            int choice = 0;
            if (!Character.isDigit(input.charAt(0))) {
                System.out.println("Input digits only!");
                displaySecondMenu(scanner, producers);
            } else {
                choice = Integer.parseInt(input);
            }
            for (int i = 0; i < producers.size(); i++) {
                if (choice == 0) {
                    displayMainMenu(scanner, producers);
                }
                if (choice == i + 1) {
                    System.out.println(producers.get(choice - 1).getName());
                    System.out.println(producers.get(choice - 1).getProducts());
                    displaySortedByName(choice - 1, producers);
                    displaySortedByPrice(choice - 1, producers);
                }
            }
        }
    }

    public void displaySortedByName(int index, List<Producer> producers) {
        producers.get(index).getProducts().sort(Comparator.comparing(Product::getName));
        System.out.println("Сортировка товаров по названию: \n" + producers.get(index).getProducts().toString());
    }

    public void displaySortedByPrice(int index, List<Producer> producers) {
        producers.get(index).getProducts().sort(Comparator.comparing(Product::getPrice));
        System.out.println("Сортировка товаров по цене: \n" + producers.get(index).getProducts().toString());
    }
}