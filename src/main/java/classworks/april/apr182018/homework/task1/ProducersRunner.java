package classworks.april.apr182018.homework.task1;

/**
 * Создать консольное приложение
 * - создать приложение, которое выводит список производителей;
 * - при выборе производителя выводятся все его товары;
 * - Производитель может иметь много товаров;
 * - работу с пользователем организовать через консоль;
 * - выполнить сортировку товаров на названию и цене.
 */
public class ProducersRunner {
    public static void main(String[] args) {
        Manufacture manufacture = new Manufacture("IBM");
        manufacture.addProduct(new Product("Comp", 2000));
        manufacture.addProduct(new Product("Printer", 500));
        manufacture.addProduct(new Product("Mouse", 25));
        manufacture.addProduct(new Product("Scaner", 800));

        System.out.println(manufacture.toString());

    }
}
