package independentWork.app;

import java.util.ArrayList;
import java.util.List;

public class TradeDataCalc {
    private TradeManager tradeManager;

    public TradeDataCalc(TradeManager tradeManager) {
        this.tradeManager = tradeManager;
    }

    public void checkCurrency() {
        String currency = tradeManager.getCurrency();
        List<String> currencys = new ArrayList<>();
        currencys.add("UAH");
        currencys.add("RUB");
        currencys.add("USD");
        currencys.add("EUR");
        if (currency.equalsIgnoreCase(currencys.get(0))) {
            String resume = uahStrategy();
            System.out.println("uah strategy");
            System.out.println(resume);
        }
        if (currency.equalsIgnoreCase(currencys.get(1))) {
            String resume = rubStrategy();
            System.out.println("rub strategy");
            System.out.println(resume);
        }
        if (currency.equalsIgnoreCase(currencys.get(2)) || currency.equalsIgnoreCase(currencys.get(3))) {
            String resume = usdAndEurStrategy();
            System.out.println("usd or eur strategy");
            System.out.println(resume);
        }
    }

    public String uahStrategy() {
        double deposit = tradeManager.getDeposit();
        double percent = 2;
        double minDepo = 1350;
        double percentFromDepo = 0;
        String warning = "";
        if (deposit < minDepo / 2) {
            percentFromDepo = minDepo * (percent / 100);
            warning = "You have high risks! Trading not recommended!";
        }
        if (deposit >= minDepo / 2 && deposit < minDepo * 2) {
            percentFromDepo = minDepo * (percent / 100);
            warning = "You have low deposit and high risks! Be very careful";
        }
        if (deposit >= minDepo * 2) {
            percentFromDepo = (deposit / 100) * 2;
            warning = "";
        }
        return warning + "\nYour deposit = " + deposit
                + ",\nYour minimum order is " + (int) percent + "% from deposit.\n" +
                "Order value = " + (int) percentFromDepo;
    }

    public String rubStrategy() {
        double deposit = tradeManager.getDeposit();
        double percent = 2;
        double minDepo = 3000;
        double percentFromDepo = 0;
        String warning = "";
        if (deposit < minDepo / 2) {
            percentFromDepo = minDepo * (percent / 100);
            warning = "You have high risks! Trading not recommended!";
        }
        if (deposit >= minDepo / 2 && deposit < minDepo * 2) {
            percentFromDepo = minDepo * (percent / 100);
            warning = "You have low deposit and high risks! Be very careful";
        }
        if (deposit >= minDepo * 2) {
            percentFromDepo = (deposit / 100) * 2;
            warning = "";
        }
        return warning + "\nYour deposit = " + deposit
                + ",\nYour minimum order is " + (int) percent + "% from deposit.\n" +
                "Order value = " + (int) percentFromDepo;
    }

    public String usdAndEurStrategy() {
        double deposit = tradeManager.getDeposit();
        double percent = 2;
        double minDepo = 50;
        double percentFromDepo = 0;
        String warning = "";
        if (deposit < minDepo / 2) {
            percentFromDepo = minDepo * (percent / 100);
            percent = 1;
            warning = "You have high risks! Trading not recommended!";
        }
        if (deposit >= minDepo / 2 && deposit < minDepo * 2) {
            percentFromDepo = minDepo * (percent / 100);
            percent = 1;
            warning = "You have low deposit and high risks! Be very careful";
        }
        if (deposit >= minDepo * 2) {
            percentFromDepo = (deposit / 100) * 2;
            warning = "";
        }
        return warning + "\nYour deposit = " + deposit
                + ",\nYour minimum order is " + (int) percent + "% from deposit.\n" +
                "Order value = " + (int) percentFromDepo;
    }

    public static void main(String[] args) {
        double depo = 100;
        String currency = "rub";
        TradeManager tradeManager = new TradeManager(currency, depo);
        TradeDataCalc tradeDataCalc = new TradeDataCalc(tradeManager);
        tradeDataCalc.checkCurrency();
    }
}
