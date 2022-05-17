import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        StatsService manager = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println(manager.sum(sales));
        System.out.println(manager.averageSums(sales));
        System.out.println(manager.numbMonthMaxSale(sales));
        System.out.println(manager.numbMonthMinSale(sales));
        System.out.println(manager.aboveAverage(sales));
        System.out.println(manager.belowAverage(sales));
    }
}
