package classworks.april.apr052018.homework.task2;

/**
 * Created by ivko on 09.04.18.
 */
public class Administrator {
    public void addInfoAboutProduct(Product product, String name, double price) {
        System.out.println("Added new product:");
        product.setKind(name);
        product.setPrice(price);
        System.out.println("Type: " + product.getKind());
        System.out.println("Price: " + product.getPrice());
    }

    public void registerSale(int payed) {
        if (payed <= 1) {
            System.out.println("Sale is registered");
        }
    }

    public void addClientToBlackList(int payed) {
        if (payed > 1) {
            System.out.println("Client doesn't payed the order, he added to blacklist");
        } else {
            System.out.println("Product was successfully payed");
        }
    }
}