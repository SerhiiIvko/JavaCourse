package independentWork.app;

public class TradeManager {
    private String currency;
    private double deposit;

    public TradeManager(String currency, double deposit) {
        this.currency = currency;
        this.deposit = deposit;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }
}
