package independentWork.circle;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Random;

public class Circle extends JFrame {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static Random random = new Random();
    private static double xCircle;
    private static double yCircle;
    private static double xcCircle;
    private static double ycCircle;

    public static void initAction() {
        JFrame frame = new JFrame(MovingCircle.class.getSimpleName());
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        final JLabel circle = new JLabel() {
            protected void paintComponent(Graphics grphcs) {
                super.paintComponent(grphcs);
                Graphics2D g2d = (Graphics2D) grphcs;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2d.setColor(Color.GREEN);
                int position1 = 100;
                int position2 = 100;
                int width = 100;
                int height = 100;
                g2d.fillOval(position1, position2, width, height);
                setLocation(position1, position2);
                xCircle = getNextSpeed() * (random.nextBoolean() ? 1 : -1);
                yCircle = getNextSpeed() * (random.nextBoolean() ? 1 : -1);
                xCircle = getX();
                yCircle = getY();
                if (xCircle == 0) {
                    xCircle = -1;
                } else {
                    xCircle = 1;
                }
                if (yCircle == 0) {
                    yCircle = -1;
                } else {
                    yCircle = 1;
                }
                Timer timer = new Timer(1000, (ActionEvent e) -> {
                    xcCircle += xCircle;
                    ycCircle += yCircle;
                    xcCircle = random.nextInt(2) * xCircle;
                    ycCircle = random.nextInt(2) * yCircle;
                    Component owner = getParent();
                    Point p = owner.getLocation();
                    if (p.x <= 0 || p.x >= owner.getWidth() - width) {
                        xCircle = -xCircle;
                    }
                    if (p.y <= 0 || p.y >= owner.getHeight() - height) {
                        yCircle = -yCircle;
                    }
                    if (xcCircle + width > frame.getContentPane().getWidth()) {
                        xcCircle = frame.getContentPane().getWidth() - width;
                        xCircle = -Circle.getNextSpeed();
                    } else if (xcCircle < 0) {
                        xcCircle = 0;
                        xCircle = Circle.getNextSpeed();
                    }
                    if (ycCircle + height > frame.getContentPane().getHeight()) {
                        ycCircle = frame.getContentPane().getHeight() - height;
                        yCircle = -Circle.getNextSpeed();
                    } else if (ycCircle < 0) {
                        ycCircle = 0;
                        yCircle = Circle.getNextSpeed();
                    }
                    setLocation((int) (xcCircle + xCircle), (int) (ycCircle + yCircle));
                });
                timer.start();
            }
        };
        frame.getContentPane().add(circle);
        frame.setSize(WIDTH, HEIGHT);
        frame.setVisible(true);
    }

    private static double getNextSpeed() {
        return 2 * Math.PI * (0.5 + random.nextDouble());
    }

    public static void main(String[] args) {
        initAction();
    }
}