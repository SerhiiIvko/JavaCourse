package independentWork.calculatorGraphic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;

public class CalcGUI {
    private JPanel windowContent;
    private JTextField displayText;
    private List<JButton> operationButtons;
    private List<JButton> digitsButtons;
    private JButton buttonPoint;
    private JButton buttonEqual;
    private JButton multiplyButton;
    private JButton divideButton;
    private JButton plusButton;
    private JButton minusButton;
    private JButton percentButton;
    private JButton powButton;
    private JButton sqrtButton;
    private JButton clearButton;
    private JPanel p1;
    private JPanel p2;

    CalcGUI() {
        Font font = new Font("Arial", Font.BOLD, 20);
        windowContent = new JPanel();
        BorderLayout bl = new BorderLayout();
        windowContent.setLayout(bl);
        displayText = new JTextField(30);
        displayText.setFont(font);
        displayText.setFocusable(true);
        displayText.grabFocus();
        displayText.setEditable(false);
        windowContent.add("North", displayText);
        digitsButtons = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String name = "";
            digitsButtons.add(new JButton(name + i));
            digitsButtons.get(i).setFont(font);
        }
        operationButtons = new ArrayList<>();
        operationButtons.add(new JButton("."));
        operationButtons.add(new JButton("C"));
        operationButtons.add(new JButton("="));
        operationButtons.add(new JButton("*"));
        operationButtons.add(new JButton("/"));
        operationButtons.add(new JButton("+"));
        operationButtons.add(new JButton("-"));
        operationButtons.add(new JButton("%"));
        operationButtons.add(new JButton("x\u00B2"));
        operationButtons.add(new JButton("\u221A"));
        p1 = new JPanel();
        GridLayout gl1 = new GridLayout(4, 3);
        p1.setLayout(gl1);
        for (JButton button : digitsButtons) {
            p1.add(button);
        }
        ActionListener al = (ActionEvent e) -> {
            JButton b = (JButton) e.getSource();
            displayText.setText(displayText.getText() + b.getText());
        };
        for (JButton b : digitsButtons) {
            b.addActionListener(al);
        }

        displayText.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char s = e.getKeyChar();
                if (!Character.isDigit(s)) {
                    return;
                }
                displayText.setText(displayText.getText() + s);
            }
        });
        p1.add(operationButtons.get(0));
        p1.add(operationButtons.get(1));
        p2 = new JPanel();
        GridLayout gl2 = new GridLayout(4, 2);
        p2.setLayout(gl2);
        for (int i = 2; i < operationButtons.size(); i++) {
            p2.add(operationButtons.get(i));
        }
        windowContent.add(p1);
        windowContent.add("East", p2);
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(windowContent);
        frame.pack();
        frame.setSize(300, 310);
        frame.setLocation(400, 250);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        LogicCalc logicCalc = new LogicCalc(this);
        for (JButton button : digitsButtons) {
            button.addActionListener(logicCalc);
        }
        ActionListener a = (ActionEvent e) -> {
            JButton b = (JButton) e.getSource();
            displayText.setText(displayText.getText() + b.getText());
        };
        operationButtons.forEach(b -> {
            b.setFont(font);
            b.addActionListener(a);
        });
        p2.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char symbol = e.getKeyChar();
                if (symbol == displayText.getText().charAt(0)) {
                    return;
                }
                displayText.setText(displayText.getText() + symbol);
            }
        });
    }

    public JTextField getDisplayText() {
        return displayText;
    }

    public List<JButton> getOperationButtons() {
        return operationButtons;
    }
}