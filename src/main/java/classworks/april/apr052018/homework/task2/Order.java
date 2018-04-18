package classworks.april.apr052018.homework.task2;

/**
 * Created by ivko on 09.04.18.
 */
public interface Order {
    void makeOrder(Product product);

    boolean payOrder(int payed);
}