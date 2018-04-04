package classworks.december2017.controlWork28dec.task3;

/**
 * 3.С начала суток прошло n секунд. Определить:
 * a.сколько полных часов прошло с начала суток
 * b.сколько подных минут прошло с начала очередного часа
 * c.сколько полных секунд просло с начала очередной минуты.
 */
public class FindTime {
    public static void main(String[] args) {
        int seconds = 61;

        int oneMinute = 60;
        int oneHour = 3600;
        int hours;
        int minutes;
        int halfSeconds;

        halfSeconds = ((seconds % oneHour) % oneMinute);
        minutes = (seconds % oneHour) / oneMinute;
        hours = (seconds) / oneHour;
        System.out.println("С начала суток прошло " + hours + " часов " + minutes + " минут " + halfSeconds + " полных секунд");
    }
}
