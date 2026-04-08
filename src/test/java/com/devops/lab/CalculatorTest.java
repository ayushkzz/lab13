package com.devops.lab;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(100, calculator.add(5, 5));
    }
}