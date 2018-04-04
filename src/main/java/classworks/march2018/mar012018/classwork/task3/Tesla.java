package classworks.march2018.mar012018.classwork.task3;

public class Tesla {
    public int maxSpeed;
    public int currentSpeed;
    public String vendor;
    public String model;

    private int speedOn = 5;

    public void stepOn() {
        if (currentSpeed + speedOn <= maxSpeed) {
            currentSpeed += speedOn;
        }
    }

    public void showDescription() {
        System.out.println("Vendor: " + vendor + "\nModel: " + model + " \nCurrent Speed: " + currentSpeed);
    }
}