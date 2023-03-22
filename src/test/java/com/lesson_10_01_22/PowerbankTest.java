package com.lesson_10_01_22;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowerbankTest {

    @Test
    void TOGGLE_TEST() {
        Powerbank powerbank = new Powerbank();
        powerbank.toggle(25);
        assertTrue(powerbank.getStatus());
        powerbank.toggle(25);
        assertFalse(powerbank.getStatus());

    }

    @Test
    void STATUS_TEST(){
        Powerbank CheckStatus = new Powerbank();
        int capacity = 25;
        double current = 10.05;
        double expected = 3.48;
        boolean actual = CheckStatus.getStatus();
        assertEquals(actual,expected); // проверяеи равны ли два значения
        System.out.println(CheckStatus);
    }
    @Test
    void CHARGE_TEST(){
        Powerbank powerbank = new Powerbank();
        powerbank.getCharge(25, 1.2);
        assertNotNull(powerbank.getStatus()); // проверяем, чтобы параметр не был равен null
        assertNull(powerbank.getCharge(10,0.5)); // проверяем, чтобы параметр был равен null
        System.out.println(powerbank);
    }
    @Test
    void TIMER_TEST(){
        Powerbank powerbank = new Powerbank();
        powerbank.getOffTimer();
        assertNotEquals(powerbank.chargeLevel,powerbank.getStatus()); // проверка не равен ли уровень заряда с статусом заряда
        System.out.println(powerbank);
    }



}
