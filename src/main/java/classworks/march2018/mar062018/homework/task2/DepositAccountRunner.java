package classworks.march2018.mar062018.homework.task2;

public class DepositAccountRunner {
    public static void main(String[] args) {
        DepositAccount.setYearInterest(4);
        DepositAccount saver1 = new DepositAccount(2000);
        DepositAccount saver2 = new DepositAccount(3000);
        printInformation(saver1, saver2);
        DepositAccount.setYearInterest(5);
        printInformation(saver1, saver2);
    }

    private static void printInformation(DepositAccount saver1, DepositAccount saver2) {
        System.out.println(String.format("Year interest %.2f, Month interest %.4f",
                DepositAccount.getYearInterest(), DepositAccount.getMonthInterest()));
        System.out.println(saver1.getAccountInformation());
        System.out.println(saver2.getAccountInformation());
    }
}