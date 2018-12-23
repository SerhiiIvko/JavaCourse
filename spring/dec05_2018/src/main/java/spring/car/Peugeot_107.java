package spring.car;

import spring.engine.Dfihatsu;
import spring.engine.IEngine;
import spring.transmission.ITransmission;
import spring.transmission.Toyota_aygo;

public class Peugeot_107 implements ICar {
    private String brand;
    private String model;
    private IEngine engine;
    private ITransmission transmission;

    public Peugeot_107() {
        this.brand = "Peugeot";
        this.model = "p107";
        this.engine = (IEngine) new Dfihatsu();
        this.transmission = (ITransmission) new Toyota_aygo();
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Peugeot_107{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", engine=" + engine.toString() +
                ", transmission=" + transmission.getTransType() +
                '}';
    }
}