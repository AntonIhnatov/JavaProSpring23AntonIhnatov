package main.java.HW9Collections;


import java.util.HashMap;
import java.util.Scanner;

public class DiningHall extends Order {

    private RestaurantTable selectedTable;
    private Employee selectedWaiter;

    public enum RestaurantTable {
        KINGS_ROW("I"),
        DORADO("II"),
        NEPAL("III"),
        ROUTE_66("IV");

        public final String tableNumber;

        RestaurantTable(String tableNumber) {
            this.tableNumber = tableNumber;
        }

        public String getTableNumber() {
            return tableNumber;
        }
    }

    public void selectTable(Employee waiters) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Добро пожаловать в косплей-кафе по игре Overwatch 2!\n" + "Здесь вы сможете окунуться в удивительный мир Overwatch и насладиться атмосферой игры в реальной жизни\n");
            System.out.println("Выберите столик для посетителя:");
            System.out.println("1 - Столик King's Row");
            System.out.println("2 - Столик Dorado");
            System.out.println("3 - Столик Nepal");
            System.out.println("4 - Столик Route 66");

            int choiceUser = scanner.nextInt();

            RestaurantTable table;

            switch (choiceUser) {
                case 1:
                    table = RestaurantTable.KINGS_ROW;
                    System.out.println("Номер столика: " + table.getTableNumber());
                    break;
                case 2:
                    table = RestaurantTable.DORADO;
                    System.out.println("Номер столика: " + table.getTableNumber());
                    break;
                case 3:
                    table = RestaurantTable.NEPAL;
                    System.out.println("Номер столика: " + table.getTableNumber());
                    break;
                case 4:
                    table = RestaurantTable.ROUTE_66;
                    System.out.println("Номер столика: " + table.getTableNumber());
                    break;
                default:
                    System.out.println("Неверный ввод");
                    continue;
            }

            Waiters overwatchWaiters = new Waiters(waiters);
            HashMap<String, String> waiterInfo = overwatchWaiters.getWaiter(table);

            if (waiterInfo.containsKey("Invalid table choice")) {
                System.out.println(waiterInfo.get("Invalid table choice"));
            } else {
                selectedTable = table;
                selectedWaiter = waiters;
                System.out.println("Назначенный официант: " + waiterInfo.keySet().iterator().next());
                System.out.println("Описание официанта: " + waiterInfo.values().iterator().next() + "\n");
            }
            break;
        }
    }
    public void deliverOrder() {
        if (selectedTable != null && selectedWaiter != null) {
            System.out.println("Официант несет заказ за столик " + selectedTable.getTableNumber() + ". Ваш заказ готов.");
        } else {
            System.out.println("Заказ еще не выбран");
        }
    }
}

