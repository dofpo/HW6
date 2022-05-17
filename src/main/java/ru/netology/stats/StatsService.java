package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            if (sale > 0) {
                sum += sale;
            }
        }
        return sum;

    }

    public int averageSums(long[] sales) {
        long sum = sum(sales);
        int month = 0;
        for (long sale : sales) {
            month = month + 1;
        }
        int averageSum = (int) (sum / month);
        return averageSum;
    }

    public int numbMonthMaxSale(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int numbMonthMinSale(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int aboveAverage(long[] sales) {
        long averageSum = averageSums(sales);
        int aboveAverage = 0;
        for (long sale : sales) {
            if (averageSum > sale) {
                aboveAverage++;
            }
        }
        return aboveAverage;
    }

    public int belowAverage(long[] sales) {
        int month = 0;
        long averageSum = averageSums(sales);
        int belowAverage = 0;
        for (long sale : sales) {
            if (averageSum < sale) {
                belowAverage++;
            }
        }
        return belowAverage;
    }
}
