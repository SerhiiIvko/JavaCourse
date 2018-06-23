package independentWork.circle;

import javax.swing.*;

public class Frame {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(500, 500);
        ActionBall actionBall = new ActionBall();
        jFrame.add(actionBall);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

    }
}
