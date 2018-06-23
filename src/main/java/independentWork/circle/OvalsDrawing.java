package independentWork.circle;

import javax.swing.*;
import java.awt.*;

public class OvalsDrawing extends JFrame implements Runnable {
    public OvalsDrawing() {
        setSize(20, 20);
        setVisible(true);
    }

    public void paint(Graphics g) {
        g.setColor(Color.GREEN);
        g.fillOval(230, 80, 150, 100);
    }

    public static void main(String args[]) {
        Thread thread = new Thread();
        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setSize(400, 400);
        jFrame.setVisible(true);
        thread.start();
    }

    @Override
    public void run() {
        new OvalsDrawing();
    }
}