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
        long averagesum = AverageSum(sales);
        int aboveaverage = 0;
        for (long sale : sales) {
            if (averagesum > sale) {
                aboveaverage++;
            }
        }
        return aboveaverage;
    }

    public int BelowAverage(long[] sales) {
        int month = 0;
        long averagesum = AverageSum(sales);
        int belowaverage = 0;
        for (long sale : sales) {
            if (averagesum < sale) {
                belowaverage++;
            }
        }
        return belowaverage;
    }
}
