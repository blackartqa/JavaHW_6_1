package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @org.junit.jupiter.api.Test
        //проверяем соответствие общей выручки за год
    void shouldTotalSales() {
        StatsService service = new StatsService();

        int[] salesByMonths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculateSales(salesByMonths);
        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
        //проверяем соответствие средней выручки в месяц
    void shouldAverageSales() {
        StatsService service = new StatsService();

        int[] salesByMonths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.calculateAverageSales(salesByMonths);
        assertEquals(expected, actual);


    }

    @org.junit.jupiter.api.Test
        //проверяем соответствие месяцев с максимальной выручкой
    void shouldMaxMonthSales() {
        StatsService service = new StatsService();

        int[] salesByMonths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.calculateMaxMonthSales(salesByMonths);
        assertEquals(expected, actual);


    }

    @org.junit.jupiter.api.Test
        //проверяем соответствие месяцев с минимальной выручкой
    void shouldMinMonthSales() {
        StatsService service = new StatsService();

        int[] salesByMonths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.calculateMinMonthSales(salesByMonths);
        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
        //проверяем соответствие месяцев с продажами выше среднего
    void shouldOverAverageSales() {
        StatsService service = new StatsService();

        int[] salesByMonths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.calculateOverAverageSales(salesByMonths);
        assertEquals(expected, actual);

    }

    @org.junit.jupiter.api.Test
        //проверяем соответствие месяцев с продажами ниже среднего
    void shouldUnderAverageSales() {
        StatsService service = new StatsService();

        int[] salesByMonths = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.calculateUnderAverageSales(salesByMonths);
        assertEquals(expected, actual);

    }

}