package classworks.march2018.mar152018.homework.lanaEdition.task2;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by ivko on 16.03.18.
 * <p>
 * <p>
 * Создайте интерфейс Developer с методами «писать код» и «наслаждаться жизнью», и интерфейс Person с методом «дышать».
 * В классе JavaDeveloper с приватным параметром «Имя» нужно реализовать методы эти двух интерфейсов. То же самое сделать
 * и в классе CppDeveloper.
 * В классе DeveloperRunner создайте экземпляры разработчиков, в конструкторе дайте им имена и выведете результат работы
 * реализованных методов на консоль.
 * Так же во всех классах где необходимо должны быть созданы методы для работы с параметрами и организован вывод данных
 * (toString).
 */

public class DeveloperRunner {
    public static void main(String[] args) {
        Developer sergey = new JavaDeveloper("Sergey");
        Developer eugeny = new JavaDeveloper("Eugeny");
        DeveloperListener developerListener = new DeveloperListener();
        sergey.setDeveloperListener(developerListener);
        eugeny.setDeveloperListener(developerListener);
        Timer timerS = new Timer("S");
        timerS.schedule(new TimerTask() {
            @Override
            public void run() {
                changeState(sergey);
            }
        }, 10000, 10000);
        Timer timerE = new Timer("E");
        timerE.schedule(new TimerTask() {
            @Override
            public void run() {
                changeState(eugeny);
            }
        }, 15000, 15000);
    }

    static synchronized void changeState(Developer developer) {
        int stateCode = (int) (Math.random() * 3);
        DeveloperState state = DeveloperState.getByCode(stateCode);
        boolean value = (int) (Math.random() * 2) == 1;
        try {
            developer.changeState(state, value);
        } catch (IllegalStateException e) {
            System.out.println(String.format("Soryan, %s can't %s: he says: %s", developer, state, e.getMessage()));
        }
    }
}