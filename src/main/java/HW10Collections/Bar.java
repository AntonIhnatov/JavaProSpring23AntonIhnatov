package main.java.HW10Collections;

import java.util.List;

public class Bar {
    private List<Menu> drinkOrder;

    public Bar(List<Menu> drinkOrder) {
        this.drinkOrder = drinkOrder;
    }

    public void processDrinkOrder() {
        for (Menu drinkItem : drinkOrder) {
            switch (drinkItem.getName()) {
                case "Dead Eye Martini":
                case "High Noon Old Fashioned":
                case "Peacekeeper Margarita":
                    System.out.println("Маккри готовит: " + drinkItem + " -" + drinkItem.getDescription());
                    break;
                case "Harmony Bliss":
                case "Transcendent Elixir":
                case "Zen Bliss":
                    System.out.println("Дзеньята готовит: " + drinkItem + " -" + drinkItem.getDescription());
                    break;
                case "Soundwave Mojito":
                case "Amped-Up Margarita":
                case "Beat Drop Punch":
                    System.out.println("Лусио готовит: " + drinkItem + " -" + drinkItem.getDescription());
                    break;
                case "Shadow Sour":
                case "Hacktini":
                case "Infiltrator Martini":
                    System.out.println("Сомбра готовит: " + drinkItem + " -" + drinkItem.getDescription());
                    break;
                default:
                    System.out.println("Неизвестный напиток: " + drinkItem);
                    break;
            }
        }
    }
}