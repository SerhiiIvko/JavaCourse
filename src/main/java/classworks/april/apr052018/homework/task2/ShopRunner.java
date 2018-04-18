package classworks.april.apr052018.homework.task2;

/**
 * Система Интернет-магазин. Администратор добавляет информацию о Товаре. Клиент делает и оплачивает Заказ на Товары.
 * Администратор регистрирует Продажу и может занести неплательщиков в «черный список».
 * Задачу сделать, используя принципы ООП.  Добавляйте исключения.
 */
public class ShopRunner {
    public static void main(String[] args) {
        int payed = (int) (Math.random() * 4);
        Administrator administrator = new Administrator();
        Product product = new Product();
        Product product1 = new Product();
        administrator.addInfoAboutProduct(product, "IPad", 888.5);
        administrator.addInfoAboutProduct(product1, "Acer", 588);
        Client client = new Client("Danil Petrov", 1001);
        client.makeOrder(product);
        client.payOrder(payed);
        administrator.registerSale(payed);
        administrator.addClientToBlackList(payed);
    }   //входные данные в задаче ограничены условием, потому исключения тут бросать нет смысла, т.к. можно обойтись
    //проверками, где это необходимо.
}