import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        JFrame frame = new JFrame("test");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(new JFileChooser());
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
