package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result = result + sale;
        }
        return result;
    }

    public long average(long[] sales) {
        long result = sum(sales);
        return sum(sales) / sales.length;
    }

    public int maximumMonthSale(long[] sales) {
        int monthMax = 0;
        long saleMax = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= saleMax) {
                monthMax = i;
                saleMax = sales[i];
            }
        }
        return monthMax + 1;
    }

    public int minimumMonthSale(long[] sales) {
        int monthMin = 0;
        long saleMin = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= saleMin) {
                monthMin = i;
                saleMin = sales[i];
            }
        }
        return monthMin + 1;
    }

    public int calcmonthesSaleBellowAverege(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale < average((sales))) {
                counter++;
            }
        }
        return counter;
    }

    public int calcmonthesSaleAboveAverege(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale > average((sales))) {
                counter++;
            }
        }
        return counter;
    }
}


