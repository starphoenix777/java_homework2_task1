public class Main {
    public static void main(String[] args) {
        // Исходные данные
        int ticketCost = 785; // цена билета
        int mileCost = 20; // количество рублей за 1 милю

        // Вычисления
        int quantityMiles = ticketCost / mileCost; // количество миль за покупку билета

        // Вывод результатов
        System.out.print("За покупку билета на сумму " + (ticketCost) + " руб.");
        System.out.print(" начислено " + (quantityMiles) + " миль");

    }
}
