package classworks.march2018.mar022018;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WindowTest {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(300, 300);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        jFrame.setLocation(500, 300);
        JPanel panel = new JPanel(new GridBagLayout());
        JButton button = new JButton("Click me");
        panel.setBackground(Color.cyan);
        button.setBackground(Color.green);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog dialog = new JDialog(jFrame, "AAAAAAAAAAAAAAAAAA!!!");
                dialog.setSize(panel.getSize());
                dialog.setLocation(500, 300);
                dialog.setBackground(Color.red);
                JPanel contentPane = new JPanel();
                contentPane.setBackground(Color.red);
                contentPane.add(new JLabel("We all will die!!!"));
                dialog.setContentPane(contentPane);
                dialog.show();
            }
        });
        panel.add(button);
        jFrame.add(panel);
        jFrame.setTitle("My Frame");
    }
}