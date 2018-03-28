package classworks.mar222018.homework.task1.devices;

class VirusGenerator {
    public void checkViruses() {
        System.out.println();
        int randomVirusFound = (int) (Math.random() * 2);
        if (randomVirusFound == 0) {
            System.out.println("Viruses not found");
        } else {
            System.out.println("Some problem was found. Start curring system.");
            System.out.println("System was curring successfully!");
        }
        System.out.println();
    }
}