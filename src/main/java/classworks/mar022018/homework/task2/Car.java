package classworks.mar022018.homework.task2;

/**
 * Создать класс Car со следующими полями:
 * id,
 * Марка,
 * Модель,
 * Год выпуска,
 * Цвет,
 * Цена,
 * Регистрационный номер.
 * Определить конструкторы и методы setТип(), getТип(), toString(). Создать массив объектов. Вывести:
 * a) список автомобилей заданной марки;
 * b) список автомобилей заданной модели, которые эксплуатируются больше n лет;
 * c) список автомобилей заданного года выпуска, цена которых больше указанной.
 */
public class Car {
    private int id;
    private int registrNumber;
    private int yearProduction;
    private double price;
    private String type;
    private String model;
    private String color;
    final static int CURRENT_YEAR = 2018;

    Car(int id, int registrNumber, int yearProduction, double price, String type, String model, String color) {
        this.id = id;
        this.registrNumber = registrNumber;
        this.yearProduction = yearProduction;
        this.price = price;
        this.type = type;
        this.model = model;
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void getType(String type, Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            if ((cars[i]).getType().equals(type)) {
                System.out.println(cars[i]);
            }
        }
    }

    public int getYearProduction() {
        return yearProduction;
    }

    public void getOldCars(int year, Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            if (CURRENT_YEAR - cars[i].getYearProduction() > year) {
                System.out.println(cars[i]);
            }
        }
    }

    public double getPrice() {
        return price;
    }

    public void getCarByPrice(double price, Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            if (cars[i].getPrice() > price) {
                System.out.println(cars[i]);
            }
        }
    }

    @Override
    public String toString() {
        return "id = " + id +
                ", registrNumber: " + registrNumber +
                ", yearProduction: " + yearProduction +
                ", price = " + price +
                ", type: " + type +
                ", model: " + model +
                ", color: " + color;
    }
}