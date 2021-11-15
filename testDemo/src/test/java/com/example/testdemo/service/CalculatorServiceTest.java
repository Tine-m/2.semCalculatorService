package com.example.testdemo.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {

    // Valid Test case
    @Test
    public void test_Sum_With_Positive_Numbers() {
        // Arrange
        CalculatorService calculatorService = new CalculatorService();
        // Act
        int result = calculatorService.sum(10,20);
        // Assert
        assertEquals(30, result);
    }

    // Valid Test case
    @Test
    public void test_Sum_With_Negative_Number() {
        CalculatorService calculatorService = new CalculatorService();
        int result = calculatorService.sum(-10,20);
        assertEquals(10, result);
    }

    // Invalid Test case
    @Test
    public void test_Sum_With_Too_Large_Number() {
        CalculatorService calculatorService = new CalculatorService();
        assertThrows(IllegalArgumentException.class, () -> calculatorService.sum(1001,10));
    }
}