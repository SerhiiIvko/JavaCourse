package classworks.mar062018.classwork.task2;

class Block {
    private int a, b, c;
    private int volume;

    Block(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        volume = a * b * c;
    }

    boolean sameBlock(Block block) {
        if (block.a == a && block.b == b && block.c == c) {
            return true;
        } else {
            return false;
        }
    }

    boolean sameVolume(Block block) {
        if (block.volume == volume) {
            return true;
        } else {
            return false;
        }
    }
}

class BlockRunner {
    public static void main(String[] args) {
        Block b1 = new Block(10, 2, 5);
        Block b2 = new Block(10, 2, 5);
        Block b3 = new Block(4, 5, 5);
        System.out.println("Values are equals " + (b1.sameBlock(b2) ? "Yes" : "No"));
        System.out.println("Values are equals " + (b2.sameBlock(b3) ? "Yes" : "No"));
        System.out.println("Values are equals " + (b1.sameVolume(b3) ? "Yes" : "No"));
    }
}