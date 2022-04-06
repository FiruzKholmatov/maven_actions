package ru.netology.statistics;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {2, 5, 8, 4, 15, 3, 8, 6, 10, 11, 12};
        long expected = 15;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    void findMin() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {2, 5, 8, 4, 15, 3, 8, 6, 10, 11, 12};
        long expected = 2;

        long actual = service.findMin(incomesInBillions);

        assertEquals(expected, actual);
    }


}