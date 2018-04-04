package classworks.march2018.mar222018.homework.task1.devices;

class DiskDrive implements DeviceManager {

    @Override
    public void on() {
        System.out.println("Disk drive start working");
    }

    @Override
    public void off() {
        System.out.println("Disk drive stop working");
    }
}