package classworks.april.apr252018.classwork.task2;

import java.text.DecimalFormat;
import java.text.ParseException;

/**
 * есть дробное число и два ограничителя - количество цифер в целой части и количество цифр в дробной части.
 * нужно применить ограничитель, отрезав лишнее
 * лишнее - справа
 */
public class Digit {
    public static void main(String[] args) {
        String doubleValue = "258,56.85698";
        System.out.println(doubleValue);
        doubleValue = doubleValue.replaceAll(",", "");
        System.out.println("not parsed " + doubleValue);
        int intDivider = 3;
        int doubleDivider = 4;
        double a = Double.parseDouble(doubleValue);

//        customFormat(a, intDivider, doubleDivider);
    }

    static public void customFormat(String numberString, int intDigits, int fractionDigits) {
        DecimalFormat myFormatter = new DecimalFormat();
        try {
            Number rawNumber = myFormatter.parse(numberString);
            double number = rawNumber.doubleValue();
            int integerPart = rawNumber.intValue();
            String integerString = String.valueOf(integerPart);
            boolean isNegative = number < 0;
            int integerLength = integerString.length();
            if (isNegative) {
                integerLength--;
                number = -number;
                integerPart = -integerPart;
            }
            if (integerLength < intDigits) {

            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}