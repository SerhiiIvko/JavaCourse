package independentWork.circle;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Ball extends JPanel {
    private int dx, dy;
    private int radius;
    private Color color;

    public void paint(Graphics g) {
        g.setColor(color);
        g.fillOval(0, 0, this.getWidth(), this.getHeight());
    }

    public Ball(int x, int y) {
        Random rnd = new Random();

        int dirX = rnd.nextInt(2);
        if (dirX == 0) dirX = -1;
        int dirY = rnd.nextInt(2);
        if (dirY == 0) dirY = -1;
        this.dx = (rnd.nextInt(10)) * dirX;
        this.dy = (rnd.nextInt(10)) * dirY;
        this.radius = 20 + rnd.nextInt(30);
        int r = rnd.nextInt(255);
        int g = rnd.nextInt(255);
        int b = rnd.nextInt(255);
        this.color = new Color(r, g, b);
        this.setSize(radius, radius);
        this.setLocation(x, y);
    }

    public void step() {
        Component owner = getParent();
        Point p = this.getLocation();

        if (p.x <= 0 || p.x >= owner.getWidth() - radius) {
            dx = -dx;
        }
        if (p.y <= 0 || p.y >= owner.getHeight() - radius) {
            dy = -dy;
        }
        this.setLocation(p.x + dx, p.y + dy);
    }
}