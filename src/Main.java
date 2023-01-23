public class Main {
    public static void main(String[] args) {
        int[] sales = new int[10];
        for (int i = 0; i < sales.length; i++) {
            sales[i] = (int) ((i + 1) * Math.random()*10);
        }
        SalesManager salesManager = new SalesManager(sales);
        System.out.println("Лучшая продажа " + salesManager.max());
        System.out.println("Средние продажи " + salesManager.ave());
    }
}