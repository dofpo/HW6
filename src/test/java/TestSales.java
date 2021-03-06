import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;
import ru.netology.stats.StatsService;

public class TestSales {

    @Test
    public void TestAllSumm() {
        StatsService manager = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = (int) manager.sum(sales);
        int expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestAverageSum() {
        StatsService manager = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = (int) manager.averageSums(sales);
        int expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestMaxNumbMonthSale() {
        StatsService manager = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = manager.numbMonthMaxSale(sales);
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestMinNumbMonthSale() {
        StatsService manager = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = manager.numbMonthMinSale(sales);
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestAboveAverageMonthSale() {
        StatsService manager = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = manager.aboveAverage(sales);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestBelowAverageMonthSale() {
        StatsService manager = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = manager.belowAverage(sales);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }
}
