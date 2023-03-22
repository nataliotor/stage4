package com.lesson_31_01_23;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 1 - Employee (hour_rate)
 * 2 - DayStat
 * 3 - Employee + DayStat (One-to-Many) Array or Not?
 * 4 - Method -> get salary for this month
 * 5 - Cover previous method by 3 tests
 */

class PointTest {

    @Test
    public void CHECK_DISTANCE_TEST() {
        Point p1 = new Point(5, 5);
        Point p2 = new Point(10, 10);

        double actualDistance = p1.getDistance(p2);
        double expectedDistance = 7.0710678118655;

        assertEquals(expectedDistance, actualDistance, 0.0001);

    }

    @Test
    public void CHECK_DISTANCE_WITH_THE_SAME_POINTS() {
        Point p1 = new Point(5, 5);
        Point p2 = new Point(5, 5);


        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            p1.getDistance(p2);
        });

        String expectedMessage = "These two point are the same";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

}