package com.testeur.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calc = new Calculator();
        int result = calc.add(2, 3);
        assertEquals(5, result, "2 + 3 doit être égal à 5");
    }
    @Test
    public void testDivide() {
        Calculator calc = new Calculator();
        int result = calc.divide(6, 2);
        assertEquals(3, result, "La division de 6 par 2 doit être égale à 3");
    }

}
