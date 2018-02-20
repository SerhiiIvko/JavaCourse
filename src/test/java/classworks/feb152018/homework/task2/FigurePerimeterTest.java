package classworks.feb152018.homework.task2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ivko on 19.02.18.
 */
public class FigurePerimeterTest {

    @Test
    public void test() {
        double perimeter = FigurePerimeter.getPerimeter(20, 10, 20);
        assertEquals(80, perimeter, 0.0);
    }

    @Test
    public void test2() {
        double hypotenuseLenghth = FigurePerimeter.getHypotenuseLength(3, 4);
        assertEquals(5, hypotenuseLenghth, 0.0);
    }

}