package com.example.testdemo.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceTestParameters {

    CalculatorService calculatorService;

    @BeforeEach
    public void setUp() {
        calculatorService = new CalculatorService();
    }
    @ParameterizedTest
    @CsvSource(value = {"2:2:4", "3:17:20", "999:999:1998", "-1: -2: -3"}, delimiter = ':')
    public void testSum_With_ValidNumbers(int input1, int input2, int expected) {
        int actual = calculatorService.sum(input1,input2);
        assertEquals(expected, actual);
    }

    @Test
    public void testSum_ExpectedToFail() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculatorService.sum(1001,1001));
    }

}
