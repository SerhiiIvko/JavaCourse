package classworks.march2018.mar222018.homework.task1.devices;

class Processor implements DeviceManager {
    @Override
    public void on() {
        System.out.println("Processor start working");
    }

    @Override
    public void off() {
        System.out.println("Processor stop working");
    }
}