package ru.itpark.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusAmountTest {

    @Test
    public void calculate() {
        BonusAmount service = new BonusAmount();
        int []sales = {12_000, 8_000, 15_000, 9_000};
        int actual = service.calculate(sales);
        assertEquals(350,actual);
    }
    {
        BonusAmount service = new BonusAmount();
        int []sales = {10_000, 8_000, 1_000, 9_000};
        int actual = service.calculate(sales);
        assertEquals(0,actual);
    }
}