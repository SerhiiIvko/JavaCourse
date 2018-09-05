package zzz;

import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Created by ivko on 21.04.18.
 */
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("test");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setLocation(300, 200);
        frame.setSize(600, 400);
        DecimalFormat format = (DecimalFormat) NumberFormat.getPercentInstance();
//        DecimalFormat format = (DecimalFormat) NumberFormat.getNumberInstance();
//        format.setDecimalSeparatorAlwaysShown(true);
//        DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance();
//        decimalFormatSymbols.setGroupingSeparator(',');
//        format.getDecimalFormatSymbols().setDecimalSeparator('.');
//        format.setParseIntegerOnly(false);
//        format.setGroupingUsed(true);
//        format.setCurrency(Currency.getInstance(Locale.US));
        VNFormattedTextField textField = new VNFormattedTextField(format);
        JComboBox<String> comboBox = new JComboBox<>(new String[]{"111", "222"});
        JPanel panel = new JPanel(new GridBagLayout());
        panel.add(textField, new GridBagConstraints(0, 0, 1, 1, 1, 0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(10, 10, 0, 10), 0, 0));
        panel.add(comboBox, new GridBagConstraints(0, 1, 1, 1, 1, 0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(10, 10, 0, 10), 0, 0));
        panel.add(new JPanel(), new GridBagConstraints(0, 2, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.BOTH, new Insets(10, 0, 0, 0), 0, 0));
        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}
