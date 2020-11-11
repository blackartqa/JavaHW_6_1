package ru.netology.stats;

public class StatsService {
    //1. метод для рассчёта общей выручки за год
    public int calculateSales(int[] salesByMonths) {
        int totalSales = 0;
        for (int monthlySales : salesByMonths) {
            totalSales += monthlySales;
        }

        return totalSales;
    }

    //2. метод для рассчёта средней выручки в месяц
    public int calculateMeanSales(int[] salesByMonths) {

        int meanSales = calculateSales(salesByMonths) / salesByMonths.length;
        return meanSales;
    }

    //3. метод для рассчёта месяца с максимальными продажами
    public int calculateMaxMonthSales(int[] salesByMonths) {
        int maxMontlySales = salesByMonths[1];
        int maxMonthNumber = 0;
        int monthNumber = 1;
        for (int monthlySales : salesByMonths) {
            if (monthlySales >= maxMontlySales) {
                maxMontlySales = monthlySales;
                maxMonthNumber = monthNumber;
            }
            monthNumber++;
        }
        return maxMonthNumber;
    }

    //4. метод для рассчёта месяца с минимальными продажами
    public int calculateMinMonthSales(int[] salesByMonths) {
        int minMontlySales = salesByMonths[1];
        int minMonthNumber = 0;
        int monthNumber = 1;
        for (int monthlySales : salesByMonths) {
            if (monthlySales <= minMontlySales) {
                minMontlySales = monthlySales;
                minMonthNumber = monthNumber;
            }
            monthNumber++;
        }
        return minMonthNumber;
    }

    //5. метод для поиска месяца с продажами выше среднего
    public int calculateOverAverageSales(int[] salesByMonths) {
        int monthNumberOverAverege = 0;
        int monthNumber = 1;
        for (int monthlySales : salesByMonths) {
            if (monthlySales > calculateMeanSales(salesByMonths)) {
                monthNumberOverAverege = monthNumber;
            }
            monthNumber++;
        }

        return monthNumberOverAverege;
    }

    //5. метод для поиска месяца с продажами выше среднего
    public int calculateUnderAverageSales(int[] salesByMonths) {
        int monthNumberUnderAverege = 0;
        int monthNumber = 1;
        for (int monthlySales : salesByMonths) {
            if (monthlySales < calculateMeanSales(salesByMonths)) {
                monthNumberUnderAverege = monthNumber;
            }
            monthNumber++;
        }

        return monthNumberUnderAverege;
    }

}
