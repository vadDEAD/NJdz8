package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    void findMaxMiddle() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 50, 3, 8, 6, 11, 11, 12};
        long expected = 50;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    void findMaxBeginning() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {90, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 90;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    void findMaxEnd() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 20, 12};
        long expected = 20;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}