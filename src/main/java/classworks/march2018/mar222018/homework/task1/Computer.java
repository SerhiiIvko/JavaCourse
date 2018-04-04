package classworks.march2018.mar222018.homework.task1;

import classworks.march2018.mar222018.homework.task1.devices.*;

public class Computer extends SystemBlock implements DeviceManager {
    private SystemBlock systemBlock = new SystemBlock();

    @Override
    public void on() {
        System.out.println("Computer start working");
        systemBlock.on();
    }

    @Override
    public void off() {
        System.out.println("Computer stop working");
        systemBlock.off();
    }
}