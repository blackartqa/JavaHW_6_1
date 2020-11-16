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
    public int calculateAverageSales(int[] salesByMonths) {

        int averageSales = calculateSales(salesByMonths) / salesByMonths.length;
        return averageSales;
    }

    //3. метод для рассчёта месяца с максимальными продажами
    public int calculateMaxMonthSales(int[] salesByMonths) {
        int maxMonthlySales = salesByMonths[1];
        int maxMonthNumber = 0;
        int monthNumber = 1;
        for (int monthlySales : salesByMonths) {
            if (monthlySales >= maxMonthlySales) {
                maxMonthlySales = monthlySales;
                maxMonthNumber = monthNumber;
            }
            monthNumber++;
        }
        return maxMonthNumber;
    }

    //4. метод для рассчёта месяца с минимальными продажами
    public int calculateMinMonthSales(int[] salesByMonths) {
        int minMonthlySales = salesByMonths[1];
        int minMonthNumber = 0;
        int monthNumber = 1;
        for (int monthlySales : salesByMonths) {
            if (monthlySales <= minMonthlySales) {
                minMonthlySales = monthlySales;
                minMonthNumber = monthNumber;
            }
            monthNumber++;
        }
        return minMonthNumber;
    }

    //5. метод для поиска количества месяцев с продажами выше среднего
    public int calculateOverAverageSales(int[] salesByMonths) {
        int monthNumberOverAverege = 0;
        for (int monthlySales : salesByMonths) {
            if (monthlySales > calculateAverageSales(salesByMonths)) {
                monthNumberOverAverege++;
            }

        }

        return monthNumberOverAverege;
    }

    //6. метод для поиска количества месяцев с продажами ниже среднего
    public int calculateUnderAverageSales(int[] salesByMonths) {
        int monthNumberUnderAverege = 0;

        for (int monthlySales : salesByMonths) {
            if (monthlySales < calculateAverageSales(salesByMonths)) {
                monthNumberUnderAverege++;
            }

        }

        return monthNumberUnderAverege;
    }

}
