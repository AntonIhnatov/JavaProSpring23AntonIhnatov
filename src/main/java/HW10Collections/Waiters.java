package main.java.HW10Collections;

import java.util.HashMap;

public class Waiters {
    private final Employee waiters;

    public Waiters(Employee waiters) {
        this.waiters = waiters;
    }

    public HashMap<String, String> getWaiter(DiningHall.RestaurantTable table) {
        HashMap<String, String> waiterInfo = new HashMap<>();

        switch (table) {
            case KINGS_ROW:
                System.out.println("Вы выбрали тематический столик Kings Row\n");
                waiterInfo.put("Трейсер",waiters.getEmployeeInfo("Трейсер"));
                break;
            case DORADO:
                System.out.println("Вы выбрали тематический столик Dorado");
                waiterInfo.put("Райнхардт", waiters.getEmployeeInfo("Райнхардт"));
                break;
            case NEPAL:
                System.out.println("Вы выбрали тематический столик Nepal");
                waiterInfo.put("Роковая вдова", waiters.getEmployeeInfo("Роковая вдова"));
                break;
            case ROUTE_66:
                System.out.println("Вы выбрали тематический столик Route 66");
                waiterInfo.put("Генджи", waiters.getEmployeeInfo("Генджи"));
                break;
            default:
                waiterInfo.put("Invalid table choice", "");
        }

        return waiterInfo;
    }
}


