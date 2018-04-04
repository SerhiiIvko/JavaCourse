package classworks.march2018.mar272018.homework.task2;

/**
 * Система Телефонная станция. Абонент оплачивает Счет за разговоры и Услуги, может попросить Администратора сменить
 * номер и отказаться от услуг. Администратор изменяет номер, Услуги и временно отключает Абонента за неуплату.
 */
public class PhoneStationRunner {
    public static void main(String[] args) {
        Customer customer = new Customer("386658954", 3005, 0.01, 10, 12);
        Administrator administrator = new Administrator();
        int payment = 10;
        String newNumber = "380256484";
        System.out.println("Invoice for current moment: " + customer.getInvoiceForPeriod());
        System.out.println("Current balance: " + customer.getBalance());
        customer.setPayment(payment);
        System.out.println("Customer payment = " + payment);
        administrator.offCustomerFromNetwork(customer);
        administrator.onCustomerToNetwork(customer);
        administrator.changeNumber(customer, newNumber);
        System.out.println(customer.toString());

        administrator.toRefuseServices();
    }
}