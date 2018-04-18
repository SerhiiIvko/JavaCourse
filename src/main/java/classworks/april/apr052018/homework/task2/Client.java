package classworks.april.apr052018.homework.task2;

/**
 * Created by ivko on 09.04.18.
 */
public class Client implements Order {
    private String name;
    private int id;

    public Client(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public void makeOrder(Product product) {
        System.out.println("Client " + name + " make order, client ID: " + id);
        System.out.println(product.toString());
    }

    @Override
    public boolean payOrder(int payed) {
        boolean isPayed = false;
        if (payed <= 1) {
            isPayed = true;
            System.out.println("Client " + name + " pay order, client ID: " + id);
        }
        return isPayed;
    }
}