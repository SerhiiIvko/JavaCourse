package classworks.mar222018.homework.task1.devices;

class HDD implements DeviceManager {
    private int SIZE = 500;

    public int getSize() {
        return SIZE;
    }

    @Override
    public void on() {
        System.out.println("HDD start working");
    }

    @Override
    public void off() {
        System.out.println("HDD stop working");
    }
}