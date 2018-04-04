package classworks.march2018.mar022018.homework.task2;

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
    private int registerNumber;
    private int yearProduction;
    private double price;
    private String type;
    private String model;
    private String color;

    Car(int id, int registerNumber, int yearProduction, double price, String type, String model, String color) {
        this.id = id;
        this.registerNumber = registerNumber;
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

    public int getYearProduction() {
        return yearProduction;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car id = " + id +
                ", registerNumber: " + registerNumber +
                ", yearProduction: " + yearProduction +
                ", price = " + price +
                ", type: " + type +
                ", model: " + model +
                ", color: " + color;
    }
}