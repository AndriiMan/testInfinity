package org.example.task2;

import org.example.task1.StringCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {

    @Test
    public void testCalculateString_Addition() {
        String input = "12,34.56;67+";
        double expectedResult = 169;
        double result = StringCalculator.calculate(input);
        assertEquals(expectedResult, result, 0.001);
    }

    @Test
    public void testCalculateString_Subtraction() {
        String input = "100,20;30-";
        double expected = 50.0;
        assertEquals(expected, StringCalculator.calculate(input));
    }

    @Test
    public void testCalculateString_Subtraction2() {
        String input = "50,20;30-";
        double expected = 0.0;
        assertEquals(expected, StringCalculator.calculate(input));
    }


    @Test
    public void testCalculateString_Subtraction3() {
        String input = "10,20;30-";
        double expected = -40.0;
        assertEquals(expected, StringCalculator.calculate(input));
    }

    @Test
    public void testCalculateString_SingleElement() {
        String input = "123;";
        double expectedResult = 123;
        double result = StringCalculator.calculate(input);
        assertEquals(expectedResult, result, 0.001);
    }

    @Test
    public void testCalculateString_UnsupportedOperation() {
        String input = "10,20.30;40*";
        assertThrows(IllegalArgumentException.class, () -> {
            StringCalculator.calculate(input);
        });
    }

    @Test
    public void testCalculateString_NoElements() {
        String input = ";";
        assertThrows(IllegalArgumentException.class, () -> {
            StringCalculator.calculate(input);
        });
    }
}
