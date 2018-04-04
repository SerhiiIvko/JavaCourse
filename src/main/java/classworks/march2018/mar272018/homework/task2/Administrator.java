package classworks.march2018.mar272018.homework.task2;

public class Administrator {
    public void offCustomerFromNetwork(Customer customer) {
        if (customer.checkBalance() < customer.getInvoiceForPeriod()) {
            System.out.println("You have no money on balance account. Services temporary stopped.");
        } else {
            System.out.println("Account is positive");
        }
    }

    public void onCustomerToNetwork(Customer customer) {
        if (customer.checkBalance() > customer.getInvoiceForPeriod()) {
            System.out.println("Services continue");
        } else {
            double difference = customer.getInvoiceForPeriod() - customer.checkBalance();
            System.out.println("Increase your balance, please! You must pay $" + difference);
        }
    }

    public void changeNumber(Customer customer, String newNumber) {
        customer.setPhoneNumber(newNumber);
    }

    public void toRefuseServices() {
        System.out.println("All services are stopped");
        System.out.println("All data is archived");
    }
}