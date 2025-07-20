package ru.netology.stats;

public class StatsService {

    // номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }


    // номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму

    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i; //
            }
        }

        return maxMonth + 1;
    }


    // сумму всех продаж

    public long sumSales(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }

        return sum;
    }


    // среднюю сумму продаж в месяц

    public long averageSumSales(long[] sales) {
        long sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        long avarageSum = sum / 12;

        return avarageSum;
    }


    // количество месяцев, в которых продажи были ниже среднего

    public int monthsBelowAverage(long[] sales) {
        long avarageSum = averageSumSales(sales);
        int months = 0;

        for (int i =0; i < sales.length; i++) {
            if (sales[i] < avarageSum) {
                months = months + 1;
            }

        }
        return months;
    }


    // количество месяцев, в которых продажи были выше среднего

    public int monthsUnderAverage(long[] sales) {
        long avarageSum = averageSumSales(sales);
        int months = 0;

        for (int i =0; i < sales.length; i++) {
            if (sales[i] >= avarageSum) {
                months = months + 1;
            }

        }
        return months;

    }

}
