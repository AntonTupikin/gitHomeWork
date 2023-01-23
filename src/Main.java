public class Main {
    public static void main(String[] args) {
        long[] sales = new long[10];
        for (int i = 0; i < sales.length; i++) {
            sales[i] = (long) ((i + 1) * Math.random()*10);
        }
        SalesManager salesManager = new SalesManager(sales);
        System.out.println("Лучшая продажа " + salesManager.max());
        System.out.println("Средние продажи " + salesManager.ave());
    }
}