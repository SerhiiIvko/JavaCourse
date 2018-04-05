package independentWork.testSoftServe.rental;

public class Runner {
    public static void main(String[] args) {
        Customer customer = new Customer("Ivan");
        Rental rental = new Rental(1, 10);
        System.out.println(customer.getName());
        System.out.println(rental.amountFor(rental));
    }
}
