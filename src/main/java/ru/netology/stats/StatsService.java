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

    public int AverageSum(long[] sales) {
        long sum = sum(sales);
        int month = 0;
        for (long sale : sales) {
            month = month + 1;
        }
        int averagesum = (int) (sum / month);
        return averagesum;
    }

    public int NumbMonthMaxSale(long[] sales) {
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

    public int NumbMonthMinSale(long[] sales) {
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

    public int AboveAverage(long[] sales) {
        long AverageSum = AverageSum(sales);
        int AboveAverage = 0;
        for (long sale : sales) {
            if (AverageSum > sale) {
                AboveAverage++;
            }
        }
        return AboveAverage;
    }

    public int BelowAverage(long[] sales) {
        int month = 0;
        long AverageSum = AverageSum(sales);
        int BelowAverage = 0;
        for (long sale : sales) {
            if (AverageSum < sale) {
                BelowAverage++;
            }
        }
        return BelowAverage;
    }
}
