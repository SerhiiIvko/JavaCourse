package independentWork.work2.task5;
/*
У Деда Мороза есть часы, которые в секундах показывают сколько осталось до каждого
Нового Года. Так как Дед Мороз уже человек в возрасте, то некоторые математические
операции он быстро выполнять не в состоянии. Помогите Деду Морозу определить
сколько полных дней, часов, минут и секунд осталось до следующего Нового Года, если
известно сколько осталось секунд, т.е. разложите время в секундах на полное
количество дней, часов, минут и секунд.
 */

import java.util.Scanner;

public class DedMoroz {
    public static void main(String[] args) {
        System.out.println("Введите количесиво секунд, оставшихся до Нового года");
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        scanner.close();

        int oneMinute = 60;
        int oneHour = 3600;
        int oneDay = 86400;

        if (seconds > 0) {
            int seconsToYear = (((seconds % oneDay) % oneHour) % oneMinute);
            int minutesToYear = ((seconds % oneDay) % oneHour) / oneMinute;
            int hoursToYear = (seconds % oneDay) / oneHour;
            int daysToYear = seconds / oneDay;
            System.out.println("До нового года осталось " + daysToYear + " дней " + hoursToYear + " часов " + minutesToYear + " минут " + seconsToYear + " секунд");
        } else {
            System.out.println("Incorrect input");
        }
    }
}
