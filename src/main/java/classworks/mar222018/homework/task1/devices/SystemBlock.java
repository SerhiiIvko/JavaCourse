package classworks.mar222018.homework.task1.devices;

public class SystemBlock implements DeviceManager {
    private DiskDrive diskDrive = new DiskDrive();
    private HDD hdd = new HDD();
    private Processor processor = new Processor();
    private RAM ram = new RAM();
    private VirusGenerator virusGenerator = new VirusGenerator();

    @Override
    public void on() {
        diskDrive.on();
        hdd.on();
        processor.on();
        ram.on();
    }

    @Override
    public void off() {
        diskDrive.off();
        hdd.off();
        processor.off();
        ram.off();
    }

    public void virusFinder() {
        virusGenerator.checkViruses();
    }

    public void getHddSize() {
        System.out.println("Size of hard disk device: " + hdd.getSize() + " Gb");
    }
}