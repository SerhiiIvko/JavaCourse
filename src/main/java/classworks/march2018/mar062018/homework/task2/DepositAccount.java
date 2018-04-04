package classworks.march2018.mar062018.homework.task2;

/**
 * Создать класс Сберегательный счет. Используйте статическую переменную «годовая процентная ставка» для хранения годовой
 * процентной ставки всех владельцев счетов. Каждый объект класса содержит переменную частного сбережения, указывающую
 * сумму, которую хранитель в настоящее время имеет при внесении. Написать метод для расчета ежемесячного процента.
 * Напишите статический метод «изменение процентной ставки», который устанавливает «годовую процентную ставку» на новое
 * значение.
 * Напишите программу для тестирования класса Сберегательный счет. Создайте два объекта сберегательной учетной записи:
 * saver1 и saver2, с балансом $ 2000.00 и $ 3000.00 соответственно. Установить годовую процентную ставку до 4%, затем
 * рассчитать ежемесячный процент и распечатать новые балансы для обоих вкладчиков. Затем установите годовую процентную
 * ставку на 5%, рассчитайте проценты следующего месяца и распечатайте новые балансы для обоих вкладчиков.
 */
public class DepositAccount {
    private static double yearInterest;
    private static boolean isInit = false;

    private int id;
    private double balance;

    public DepositAccount(double balance) {
        this.id = IdGenerator.getNextId();
        this.balance = balance;
    }

    public static double getYearInterest() {
        return yearInterest;
    }

    public static void setYearInterest(double newYearInterest) {
        yearInterest = newYearInterest;
        isInit = true;
    }

    public static double getMonthInterest() {
        return ((yearInterest / 100) / 12);
    }

    public double getMonthInterestPayment() {
        checkInitialization();
        return balance * getMonthInterest();
    }

    private void checkInitialization() {
        if (!isInit) {
            throw new IllegalStateException("Year percent is not set");
        }
    }

    public String getAccountInformation() {
        return String.format("Account ID %s, Current balance %.2f, Next month balance %.2f",
                id, balance, balance + getMonthInterestPayment());
    }
}