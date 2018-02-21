package MathProviderTest;

import static org.junit.Assert.*;

import org.junit.Test;
import Application.MathProvider;

public class JunitMathProvider_1 {

    MathProvider provider;

    public JunitMathProvider_1() {
        provider = new MathProvider();
    }

    @Test
    public void add() {
//        System.out.println("Starting test " + new Object() {
//        }.getClass().getEnclosingMethod().getName());

        int firstNumber = 10;
        int secondNumber = 20;

//        int expected = firstNumber + secondNumber;
        int expected = 31;
        int actual = provider.add(firstNumber, secondNumber);
        assertEquals(expected, actual);

//        System.out.println("Ending test " + new Object() {
//        }.getClass().getEnclosingMethod().getName());

    }

    @Test
    public void substruct() {
        System.out.println("Starting test " + new Object() {
        }.getClass().getEnclosingMethod().getName());

        int firstNumber = 10;
        int secondNumber = 20;

        assertEquals(firstNumber - secondNumber, provider.substract(firstNumber, secondNumber));

        System.out.println("Ending test " + new Object() {
        }.getClass().getEnclosingMethod().getName());
    }

    @Test
    public void mult() {
        System.out.println("Starting test " + new Object() {
        }.getClass().getEnclosingMethod().getName());

        int firstNumber = 10;
        int secondNumber = 20;

        assertEquals(firstNumber * secondNumber, provider.multiply(firstNumber, secondNumber));

        System.out.println("Ending test " + new Object() {
        }.getClass().getEnclosingMethod().getName());
    }

    @Test
    public void division() {
        System.out.println("Starting test " + new Object() {
        }.getClass().getEnclosingMethod().getName());

        int firstNumber = 6;
        int secondNumber = 3;
        assertEquals(2, provider.divide(firstNumber, secondNumber), 0.0);
    }
}