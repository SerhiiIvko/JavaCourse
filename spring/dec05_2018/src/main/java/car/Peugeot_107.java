package car;

import engine.Dfihatsu;
import engine.IEngine;
import transmission.ITransmission;
import transmission.Toyota_aygo;

public class Peugeot_107 implements ICar {
    private String brand = "Peugeot";
    private String model = "107";

    private IEngine engine = new Dfihatsu();
    private ITransmission trans = new Toyota_aygo();


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
        return getBrand() + " " + getModel() + "\n"
                + engine.getCapacity() + "cm3 " + engine.getPouwerHP() + "HP\n"
                + trans.getWillDrive() + " " + trans.getTrinsType();

    }
}
