package independentWork.calculatorGraphic;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogicCalc implements ActionListener {
    private CalcGUI calcGUI;
    private char selectedAction = ' ';
    private double currentResult = 0;

    LogicCalc(CalcGUI calcGUI) {
        this.calcGUI = calcGUI;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

//        JButton clicked = (JButton) e.getSource();
        String clickedLabel = calcGUI.getDisplayText().getText();
//        String clickedButton = clicked.getText();
        double displayValue = 0;
        Object src = e.getSource();

        if (src == calcGUI.getOperationButtons().get(1)) {
            clickedLabel = "";
//            clickedButton = "";
            currentResult = 0;
            displayValue = 0;
            return;
        }
        calcGUI.getOperationButtons().get(0);

        if (!"".equals(clickedLabel)) {
            displayValue = Double.parseDouble(clickedLabel);
        }
        if (src == calcGUI.getOperationButtons().get(9)) {
//            selectedAction = clickedButton.toLowerCase().charAt(0);
            if (selectedAction == 's') {
                currentResult = displayValue;
                currentResult = Math.sqrt(currentResult);
                calcGUI.getDisplayText().setText("" + currentResult);
            }
        }
        if (src == calcGUI.getOperationButtons().get(5)) {
            selectedAction = '+';
            currentResult = displayValue;
            calcGUI.getDisplayText().setText("");
        } else if (src == calcGUI.getOperationButtons().get(6)) {
            selectedAction = '-';
            currentResult = displayValue;
            calcGUI.getDisplayText().setText("");
        } else if (src == calcGUI.getOperationButtons().get(3)) {
            selectedAction = '*';
            currentResult = displayValue;
            calcGUI.getDisplayText().setText("");
        } else if (src == calcGUI.getOperationButtons().get(4)) {
            selectedAction = '/';
            currentResult = displayValue;
            calcGUI.getDisplayText().setText("");
        } else if (src == calcGUI.getOperationButtons().get(7)) {
            selectedAction = '%';
            currentResult = displayValue;
            calcGUI.getDisplayText().setText("");
        } else if (src == calcGUI.getOperationButtons().get(8)) {
            selectedAction = calcGUI.getOperationButtons().get(8).getText().toLowerCase().charAt(0);
            currentResult = displayValue;
            calcGUI.getDisplayText().setText("");
        } else if (src == calcGUI.getOperationButtons().get(2)) {
            if (selectedAction == '+') {
                currentResult += displayValue;
                calcGUI.getDisplayText().setText("" + currentResult);
            } else if (selectedAction == '-') {
                currentResult -= displayValue;
                calcGUI.getDisplayText().setText("" + currentResult);
            } else if (selectedAction == '*') {
                currentResult *= displayValue;
                calcGUI.getDisplayText().setText("" + currentResult);
            } else if (selectedAction == '/') {
                currentResult /= displayValue;
                calcGUI.getDisplayText().setText("" + currentResult);
            } else if (selectedAction == '%') {
                currentResult = currentResult * (displayValue / 100);
                calcGUI.getDisplayText().setText("" + currentResult);
            } else if (selectedAction == 'p') {
                currentResult = Math.pow(currentResult, displayValue);
                calcGUI.getDisplayText().setText("" + currentResult);
            }
        } else {
            calcGUI.getDisplayText().setText(clickedLabel);
        }
    }
}