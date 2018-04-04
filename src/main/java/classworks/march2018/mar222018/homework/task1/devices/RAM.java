package classworks.march2018.mar222018.homework.task1.devices;

class RAM implements DeviceManager {
    @Override
    public void on() {
        System.out.println("RAM start working");
    }

    @Override
    public void off() {
        System.out.println("RAM stop working");
    }
}