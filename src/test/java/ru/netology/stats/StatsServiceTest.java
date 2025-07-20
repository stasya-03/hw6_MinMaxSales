package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    // номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
    @Test
    void shouldCalculateMinSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinSales = 9;
        int actualMinSales = service.minSales(sales);

        Assertions.assertEquals(expectedMinSales, actualMinSales);
    }

    // номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
    @Test
    void shouldCalculateMaxSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxSales = 8;
        int actualMaxSales = service.maxSales(sales);

        Assertions.assertEquals(expectedMaxSales, actualMaxSales);
    }

    // сумма всех продаж
    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSum = 180;
        long actualSum = service.sumSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    // средняя сумма продаж в месяц
    @Test
    void shouldCalculateAverageSum() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAverageSum =15;
        long actualAveregeSum = service.averageSumSales(sales);

        Assertions.assertEquals(expectedAverageSum, actualAveregeSum);
    }

    // количество месяцев, в которых продажи были ниже среднего
    @Test
    void shouldCalculateMonthsBelowAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMontsBelowAverage = 5;
        int actualMonthBelowAverage = service.monthsBelowAverage(sales);

        Assertions.assertEquals(expectedMontsBelowAverage, actualMonthBelowAverage);
    }


    // количество месяцев, в которых продажи были выше среднего
    @Test
    void shouldCalculateMonthsUnderAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMontsUnderAverage = 5;
        int actualMonthUnderAverage = service.monthsBelowAverage(sales);

        Assertions.assertEquals(expectedMontsUnderAverage, actualMonthUnderAverage);
    }

}
