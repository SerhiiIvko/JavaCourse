package classworks.mar012018.classwork.task3;

public class TeslaRunner {
    public static void main(String[] args) {
        Tesla tesla = new Tesla();

        tesla.model = "Model_S";
        tesla.vendor = "Tesla";
        tesla.currentSpeed = 100;
        tesla.maxSpeed = 300;
        tesla.showDescription();
        tesla.stepOn();
        tesla.showDescription();
    }
}