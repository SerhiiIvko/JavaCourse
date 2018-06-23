package independentWork.circle;

import javax.swing.*;
import java.awt.*;
import java.util.Random;
import javax.swing.JFrame;

public class MovingCircle extends JFrame {
    private static final int STEPS_OF_IMAGE_PER_SECOND = 20;
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private Random random = new Random();
    private double xCircle;
    private double yCircle;
    private double xcCircle = WIDTH / 2;
    private double ycCircle = HEIGHT / 2;

    public void initAction() {
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
                if (random.nextBoolean()) xCircle = getNextSpeed() * 1;
                else xCircle = getNextSpeed() * -1;
                if (random.nextBoolean()) yCircle = getNextSpeed() * 1;
                else yCircle = getNextSpeed() * -1;
                Timer timer = new Timer(10000 / STEPS_OF_IMAGE_PER_SECOND, e -> {
                    xcCircle += xCircle;
                    ycCircle += yCircle;
                    if (xcCircle + width > frame.getContentPane().getWidth()) {
                        xcCircle = frame.getContentPane().getWidth() - width;
                        xCircle = -MovingCircle.this.getNextSpeed();
                    } else if (xcCircle < 0) {
                        xcCircle = 0;
                        xCircle = MovingCircle.this.getNextSpeed();
                    }
                    if (ycCircle + height > frame.getContentPane().getHeight()) {
                        ycCircle = frame.getContentPane().getHeight() - height;
                        yCircle = -MovingCircle.this.getNextSpeed();
                    } else if (ycCircle < 0) {
                        ycCircle = 0;
                        yCircle = MovingCircle.this.getNextSpeed();
                    }
                    setLocation((int) (xcCircle), (int) ycCircle);
                });
                timer.start();
            }
        };
        circle.setSize(circle.getPreferredSize());
        circle.setLocation(20, 20);
        frame.setMinimumSize(new Rectangle(circle.getPreferredSize()).getSize());
        frame.getContentPane().add(circle);
        frame.setSize(WIDTH, HEIGHT);
        frame.setVisible(true);

//        final JLabel circle = new JLabel(new ImageIcon("dot.png"));
//        frame.setLayout(null);
//        if (random.nextBoolean()) xCircle = getNextSpeed() * 1;
//        else xCircle = getNextSpeed() * -1;
//        if (random.nextBoolean()) yCircle = getNextSpeed() * 1;
//        else yCircle = getNextSpeed() * -1;

//        Timer t = new Timer(1000 / STEPS_OF_IMAGE_PER_SECOND, new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                xcCircle += xCircle;
//                ycCircle += yCircle;
//                if (xcCircle + circle.getWidth() > frame.getContentPane().getWidth()) {
//                    xcCircle = frame.getContentPane().getWidth() - circle.getWidth();
//                    xCircle = -MovingCircle.this.getNextSpeed();
//                } else if (xcCircle < 0) {
//                    xcCircle = 0;
//                    xCircle = MovingCircle.this.getNextSpeed();
//                }
//                if (ycCircle + circle.getHeight() > frame.getContentPane().getHeight()) {
//                    ycCircle = frame.getContentPane().getHeight() - circle.getHeight();
//                    yCircle = -MovingCircle.this.getNextSpeed();
//                } else if (ycCircle < 0) {
//                    ycCircle = 0;
//                    yCircle = MovingCircle.this.getNextSpeed();
//                }
//                circle.setLocation((int) xcCircle, (int) ycCircle);
//            }
//        });

//        t.start();
    }

    private double getNextSpeed() {
        return 2 * Math.PI * (0.5 + random.nextDouble());
    }

    public static void main(String[] args) {
        new MovingCircle().initAction();
    }
}