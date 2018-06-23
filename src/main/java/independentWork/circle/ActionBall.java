package independentWork.circle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ActionBall extends JPanel {
    private Timer timer;
    private ActionListener timeListener;

    public ActionBall() {
        addMouseListener(
                new MouseAdapter() {
                    public void mouseClicked(MouseEvent me) {
                        Ball b = new Ball(me.getX(), me.getY());
                        ActionBall.this.add(b);
                    }
                }
        );

        timeListener = e -> {
            for (Component cc : ActionBall.this.getComponents()) {
                ((Ball) cc).step();
            }
            //repaint();
        };
        timer = new Timer(20, timeListener);
        timer.start();
    }
}
