package lana;

import javax.swing.*;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;

/**
 * Created by ivko on 21.04.18.
 */
public class VNFormattedTextField extends JTextField {
    public static final NumberFormat NUMBER_FORMAT = NumberFormat.getNumberInstance();
    private DecimalFormat format;
    private int multiplier;
    private double minValue = 0;

    public VNFormattedTextField(DecimalFormat format) {
//        format = NumberFormat.getPercentInstance();
        this.format = format;
        this.multiplier = format.getMultiplier();
        AbstractDocument document = (AbstractDocument) getDocument();
        document.setDocumentFilter(new DocumentFilter() {
            @Override
            public void remove(FilterBypass fb, int offset, int length) throws BadLocationException {
                String oldText = getDocument().getText(0, getDocument().getLength());
                int rawCaretPosition = 0;
                for (int i = 0; i < offset; ++i) {
                    char ch = oldText.charAt(i);
                    if (isSignificantCharacter(ch, i)) {
                        rawCaretPosition++;
                    }
                }
                String possibleText = new StringBuilder(oldText).replace(offset, offset + length, "").toString();
                StringBuilder rawNumberText = new StringBuilder();
                for (int i = 0; i < possibleText.length(); ++i) {
                    char ch = possibleText.charAt(i);
                    if (isSignificantCharacter(ch, i)) {
                        rawNumberText.append(ch);
                    }
                }
                possibleText = rawNumberText.toString();
                boolean containsDigit = !(possibleText.isEmpty() && possibleText.matches(".+\\d.+"));
                if (!containsDigit) {
                    possibleText = format.format(minValue);
                }
                try {
                    double possibleNumber = NUMBER_FORMAT.parse(possibleText).doubleValue();
                    if (offset > 0 && Double.compare(format.parse(oldText).doubleValue() * multiplier, possibleNumber) == 0) {
                        remove(fb, offset - 1, length);
                    }
                    rawCaretPosition = rawCaretPosition == 0 && possibleNumber == 0 ? 1 : rawCaretPosition;
                    String formattedText = VNFormattedTextField.this.format.format(possibleNumber / multiplier);
                    int caretPosition = 0;
                    for (int i = 0; i < formattedText.length(); ++i) {
                        char ch = formattedText.charAt(i);
                        if (isSignificantCharacter(ch, i)) {
                            caretPosition++;
                            if (caretPosition == rawCaretPosition) {
                                caretPosition = i + 1;
                                break;
                            }
                        }
                    }
                    super.replace(fb, 0, oldText.length(), formattedText, null);
                    setCaretPosition(caretPosition);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void insertString(FilterBypass fb, int offset, String string, AttributeSet attr) throws BadLocationException {
                super.insertString(fb, offset, string, attr);
            }

            // 111
            @Override
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                int caretPosition = 0;
                String oldText = getDocument().getText(0, getDocument().getLength());
                if (oldText.endsWith(String.valueOf(format.getDecimalFormatSymbols().getDecimalSeparator()))) {
                    oldText = oldText.substring(0, oldText.length() - 1);
                }
                try {
                    double oldNumber = 0;
                    if (oldText.length() > 0) {
                        oldNumber = format.parse(oldText).doubleValue();
                    }
                    int rawCaretPosition = 0;
                    StringBuilder result = new StringBuilder();
                    for (int i = 0; i < offset && i < oldText.length(); ++i) {
                        char ch = oldText.charAt(i);
                        if (isSignificantCharacter(ch, i)) {
                            if (result.length() == 0 && ch == '0') {
                                continue;
                            }
                            result.append(ch);
                            rawCaretPosition++;
                        }
                    }
                    for (int i = 0; i < text.length(); ++i) {
                        char ch = text.charAt(i);
                        if (isSignificantCharacter(ch, result.length())) {
                            result.append(ch);
                            rawCaretPosition++;
                        }
                    }
                    //   145
                    for (int i = offset + length; i >= 0 && i < oldText.length(); ++i) {
                        char ch = oldText.charAt(i);
                        if (isSignificantCharacter(ch, result.length())) {
                            result.append(ch);
                        }
                    }
                    double newNumber = oldNumber;
                    try {
                        newNumber = NUMBER_FORMAT.parse(result.toString()).doubleValue() / multiplier;
                    } catch (ParseException e) {
                        e.printStackTrace();
                    }
                    text = ((DecimalFormat) format).format(newNumber);
                    for (int i = 0; i < text.length(); ++i) {
                        char ch = text.charAt(i);
                        if (isSignificantCharacter(ch, i)) {
                            caretPosition++;
                            if (caretPosition == rawCaretPosition) {
                                caretPosition = i + 1;
                                break;
                            }
                        }
                    }
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                super.replace(fb, 0, getDocument().getLength(), text, attrs);
                setCaretPosition(caretPosition);
            }
        });
    }

    private boolean isSignificantCharacter(char ch, int position) {
        return Character.isDigit(ch)
                || format.getDecimalFormatSymbols().getDecimalSeparator() == ch
                || format.getNegativePrefix().charAt(0) == ch && position == 0;
    }

    @Override
    public void moveCaretPosition(int pos) {
        System.out.println(String.format("caret position before move: %s", getCaretPosition()));
        super.moveCaretPosition(pos);
        System.out.println(String.format("caret position after move: %s", getCaretPosition()));
    }

    @Override
    public void setCaretPosition(int position) {
        System.out.println(String.format("caret position before set: %s", getCaretPosition()));
        super.setCaretPosition(position);
        System.out.println(String.format("caret position after set: %s", getCaretPosition()));
    }

    @Override
    public int getCaretPosition() {
        return super.getCaretPosition();
    }
}
