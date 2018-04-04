package classworks.march2018.mar272018.homework.task2;

public class Customer {
    private String phoneNumber;
    private double callsTime;
    private double tariff;
    private double payment;
    private double balance;

    public Customer(String phoneNumber, double callsTime, double tariff, double payment, double balance) {
        this.phoneNumber = phoneNumber;
        this.callsTime = callsTime;
        this.tariff = tariff;
        this.payment = payment;
        this.balance = balance;
    }

    public double getPayment() {
        return payment;
    }

    public double getBalance() {
        return balance;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double checkBalance() {
        return getPayment() + this.balance;
    }

    public double getInvoiceForPeriod() {
        return (callsTime * tariff);
    }

    @Override
    public String toString() {
        return "\nMonth customer statistics: \n" +
                "PhoneNumber: '" + phoneNumber + '\'' + "\n" +
                "Calls time: " + callsTime + " sec\n" +
                "Tariff: $" + tariff + "/sec\n" +
                "Last payment: $" + payment + "\n" +
                "Current balance: $" + checkBalance() + "\n";
    }
}