package independentWork.lab1.task4;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
 * Создать класс Airlines со следующими полями:
 *  Пункт назначения,
 *  Номер рейса,
 *  Тип самолета,
 *  Время вылета,
 *  Дни недели.
 * Определить конструкторы и методы setТип(), getТип(), toString().
 * Создать массив объектов.
 * Вывести:
 * a) список рейсов для заданного пункта назначения;
 * b) список рейсов для заданного дня недели;
 * c) список рейсов для заданного дня недели, время вылета для которых
 * больше заданного.
 */
public class Airlines {
    private static String destination;
    private static int flightNumber;
    private static String airCraftType;
    private static int departureTime;
    private static String weekDay;

    public Airlines(String destination, int flightNumber, String airCraftType, int departureTime, String weekDay) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.airCraftType = airCraftType;
        this.departureTime = departureTime;
        this.weekDay = weekDay;
    }

    public void setAirCraftType(String airCraftType) {
        this.airCraftType = airCraftType;
    }

    public String getAirCraftType() {
        return airCraftType;
    }

    @Override
    public String toString() {
        return "Airlines{" +
                "destination='" + destination + '\'' +
                ", flightNumber=" + flightNumber +
                ", airCraftType='" + airCraftType + '\'' +
                ", departureTime=" + departureTime +
                ", weekDay='" + weekDay + '\'' +
                '}';
    }

    public String[] aircrafts = {"Boeing-740", "Boeing-747", "Boeing-761", "Boeing-780", "Boeing-790"};
    public String[] destinationPlace = {"London", "Kyiv", "Paris", "Ankara", "Tokyo", "New York", "Amsterdam"};
    public String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    public int[] numberFlight = {1001, 1222, 1116, 1115, 2215};
    public int[] timeDeparture = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
    //public Object[] objects = {aircrafts, destinationPlace, days, numberFlight, timeDeparture};

    public static void main(String[] args) {
        Airlines airlines = new Airlines(destination, flightNumber, airCraftType, departureTime, weekDay);
        System.out.println(departureTime);
        Shape shape = new Shape() {
            @Override
            public Rectangle getBounds() {
                return null;
            }

            @Override
            public Rectangle2D getBounds2D() {
                return null;
            }

            @Override
            public boolean contains(double x, double y) {
                return false;
            }

            @Override
            public boolean contains(Point2D p) {
                return false;
            }

            @Override
            public boolean intersects(double x, double y, double w, double h) {
                return false;
            }

            @Override
            public boolean intersects(Rectangle2D r) {
                return false;
            }

            @Override
            public boolean contains(double x, double y, double w, double h) {
                return false;
            }

            @Override
            public boolean contains(Rectangle2D r) {
                return false;
            }

            @Override
            public PathIterator getPathIterator(AffineTransform at) {
                return null;
            }

            @Override
            public PathIterator getPathIterator(AffineTransform at, double flatness) {
                return null;
            }

        };
    }
}
