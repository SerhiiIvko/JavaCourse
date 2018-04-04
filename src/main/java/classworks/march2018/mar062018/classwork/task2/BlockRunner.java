package classworks.march2018.mar062018.classwork.task2;

public class BlockRunner {
    public static void main(String[] args) {
        Block b1 = new Block(10, 2, 5);
        Block b2 = new Block(10, 2, 5);
        Block b3 = new Block(4, 5, 5);
        System.out.println("Values are equals " + (b1.sameBlock(b2) ? "Yes" : "No"));
        System.out.println("Values are equals " + (b2.sameBlock(b3) ? "Yes" : "No"));
        System.out.println("Values are equals " + (b1.sameVolume(b3) ? "Yes" : "No"));
    }
}