package classworks.april.apr182018.homework.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Создать консольное приложение
 * - создать приложение, которое выводит список производителей;
 * - при выборе производителя выводятся все его товары;
 * - Производитель может иметь много товаров;
 * - работу с пользователем организовать через консоль;
 * - выполнить сортировку товаров на названию и цене.
 */
public class Runner {
    public static void main(String[] args) {
        createProducers();
        run();
    }

    private static List<Producer> createProducers() {
        List<Producer> producers = new ArrayList<>();
        List<Product> productsIbm = new ArrayList<>();
        Producer ibm = new Producer("IBM", productsIbm);
        productsIbm.add(new Product("Comp", 2000));
        productsIbm.add(new Product("Printer", 500));
        productsIbm.add(new Product("Mouse", 25));
        productsIbm.add(new Product("Scanner", 800));
        List<Product> productsMicrosoft = new ArrayList<>();
        Producer microsoft = new Producer("Microsoft", productsMicrosoft);
        productsMicrosoft.add(new Product("Notebook", 4000));
        producers.add(ibm);
        producers.add(microsoft);
        return producers;
    }

    private static void run() {
        Scanner scanner = new Scanner(System.in);
        MenuManager menuManager = new MenuManager();
        menuManager.displayMainMenu(scanner, createProducers());
        scanner.close();
    }
}