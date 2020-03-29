package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculatedForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        //поднотавливаем данные:
        long amount = 100060;
        boolean registered = true;
        long expected = 30;

        //вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculatedForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        //поднотавливаем данные:
        long amount = 1_000_000_60;
        boolean registered = true;
        long expected = 500;

        //вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculatedForUnregisteredAndUnderLimit() {
        BonusService service = new BonusService();

        //поднотавливаем данные:
        long amount = 100060;
        boolean registered = false;
        long expected = 10;

        //вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculatedForUnregisteredAndOverLimit() {
        BonusService service = new BonusService();

        //поднотавливаем данные:
        long amount = 1_000_000_60;
        boolean registered = false;
        long expected = 500;

        //вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculatedForRegisteredAndZeroAmount() {
        BonusService service = new BonusService();

        //поднотавливаем данные:
        long amount = 0;
        boolean registered = true;
        long expected = 0;

        //вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculatedForUnregisteredAndZeroAmount() {
        BonusService service = new BonusService();

        //поднотавливаем данные:
        long amount = 0;
        boolean registered = false;
        long expected = 0;

        //вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
}