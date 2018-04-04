package Perimeter;

import static org.junit.Assert.*;

import org.junit.Test;
import classworks.february2018.feb152018.homework.task2.FigurePerimeter;

public class PerimeterTest {
    FigurePerimeter figurePerimeter;

    public PerimeterTest() {
        figurePerimeter = new FigurePerimeter();
    }

    @Test
    public void hypothenuze() {
        System.out.println("Starting test " + new Object() {
        }.getClass().getEnclosingMethod().getName());

        double firstCatheter = 3;
        double secondCatheter = 4;

        assertEquals(Math.sqrt(Math.pow(firstCatheter, 2) + Math.pow(secondCatheter, 2)),
                FigurePerimeter.getHypotenuseLength(firstCatheter, secondCatheter), 0.0);

        System.out.println("Ending test " + new Object() {
        }.getClass().getEnclosingMethod().getName());
    }
}