package classworks.march2018.mar062018.classwork.task2;

public class Block {
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