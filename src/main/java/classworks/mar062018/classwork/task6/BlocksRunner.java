package classworks.mar062018.classwork.task6;

public class BlocksRunner {
    public static void main(String[] args) {
        Blocks b1 = new Blocks();
        Blocks b2 = new Blocks(10);
        Blocks b3 = new Blocks(4, 5, 5);
        Blocks clone = new Blocks(b3);

        System.out.println("Not initialized constructor block b1 parameters: " + b1.getA() + ", " + b1.getB() + ", " +
                b1.getC());
        System.out.println("Created block b2 with parameters: " + b2.getA() + ", " + b2.getB() + ", " + b2.getC());
        System.out.println("Created block b2 is cube? Answer: " + b2.isBlockCube());
        System.out.println("Created block b3 with parameters: " + b3.getA() + ", " + b3.getB() + ", " + b3.getC());
        System.out.println("Created block b3 is cube? Answer: " + b3.isBlockCube());
        System.out.println("Block b3 volume = " + b3.calculateVolume());
        System.out.println("Create block clone with parameters b3: " + clone.getA() + ", " + clone.getB() + ", " +
                clone.getC());
        System.out.println("Block clone volume = " + clone.calculateVolume());
    }
}