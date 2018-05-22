package classworks.april.apr182018.homework.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Создать консольное приложение:
 * ● Выводит список блюд из меню ресторана
 * ● Позволяет выбрать необходимые блюда (сделать заказ)
 * ● Выводит стоимость заказа (стоимость всех блюд + 10% чаевых)
 * ● Действует система скидок: - до $500 – 0%, $500 – 999 – 5%, $1000 – 1500 – 10%, $1501 и более – 15%
 * ● Работу с пользователем организовать через меню
 */
public class MealRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Food> foods = getMenu();
        MenuManager menuManager = new MenuManager();
        menuManager.makeOrder(foods, scanner);
    }

    private static List<Food> getMenu() {
        List<Food> foods = new ArrayList<>();
        foods.add(new Food("Яичница", 5.5));
        foods.add(new Food("Хлеб", 1.5));
        foods.add(new Food("Суп", 12.5));
        foods.add(new Food("Хот-дог", 8.5));
        foods.add(new Food("Чай", 2.5));
        foods.add(new Food("Кофе", 4.5));
        foods.add(new Food("Кекс", 6.5));
        foods.add(new Food("Пирожное", 8.5));
        foods.add(new Food("Пиво", 11.5));
        foods.add(new Food("Чипсы", 8.5));
        Menu menu = new Menu(foods);
        System.out.println(menu.showMenu());
        return foods;
    }
}