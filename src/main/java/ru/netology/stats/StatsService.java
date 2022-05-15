package ru.netology.stats;

public class StatsService {
    public int sum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            if (sale > 0) {
                sum += sale;
            }
        }
        return sum;
    }

    public int averagesum(int[] sales) {
        int sum = 0;
        int month = 0;
        for (int sale : sales) {
            month = month + 1;
            if (sale > 0) {
                sum += sale;
            }
        }
        int averagesum = sum / month;
        return averagesum;
    }

    public int NumbMonthMaxSale(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int NumbMonthMinSale(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int AboveAverage(int[] sales) {
        int sum = 0;
        int month = 0;
        for (int sale : sales) {
            month = month + 1;
            if (sale > 0) {
                sum += sale;
            }
        }
        int averagesum = sum / month;
        int aboveaverage = 0;
        for (int sale : sales) {
            month = month + 1;
            if (averagesum > sale) {
                aboveaverage++;
            }
        }
        return aboveaverage;
    }

    public int BelowAverage(int[] sales) {
        int sum = 0;
        int month = 0;
        for (int sale : sales) {
            month = month + 1;
            if (sale > 0) {
                sum += sale;
            }
        }
        int averagesum = sum / month;
        int belowaverage = 0;
        for (int sale : sales) {
            month = month + 1;
            if (averagesum < sale) {
                belowaverage++;
            }
        }
        return belowaverage;
    }
}
