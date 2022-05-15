import ru.netology.stats.StatsService;

public class Main {
    public static void main(String[] args) {
        StatsService manager = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        System.out.println(manager.sum(sales));
        System.out.println(manager.averagesum(sales));
        System.out.println(manager.NumbMonthMaxSale(sales));
        System.out.println(manager.NumbMonthMinSale(sales));
        System.out.println(manager.AboveAverage(sales));
        System.out.println(manager.BelowAverage(sales));
    }
}
