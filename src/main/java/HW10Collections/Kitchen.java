package main.java.HW10Collections;

import java.util.List;

class Kitchen {
    private List<Menu> foodOrder;

    public Kitchen(List<Menu> foodOrder) {
        this.foodOrder = foodOrder;
    }

    public void processFoodOrder() {
        for (Menu foodItem : foodOrder) {
            switch (foodItem.getName()) {
                case "Взрывной сэндвич":
                case "Взрывной салат":
                case "Бомбовые картофельные палочки":
                    System.out.println("Джункарт готовит: " + foodItem + " -" + foodItem.getDescription());
                    break;
                case "Биологический суп":
                case "Витаминный тартар":
                case "Био-пудинг":
                    System.out.println("Мойра готовит: " + foodItem + " -" + foodItem.getDescription());
                    break;
                case "Свинина з терияки":
                case "Большой бургер Турбосвина":
                case "Картофельные дольки по-свински":
                    System.out.println("Турбосвин готовит: " + foodItem + " -" + foodItem.getDescription());
                    break;
                case "Лечебный суп":
                case "Ориентальный салат с куриной грудкой":
                case "Медовый торт с лавандой":
                    System.out.println("Ана готовит: " + foodItem + " -" + foodItem.getDescription());
                    break;
                default:
                    System.out.println("Неизвестное блюдо: " + foodItem);
                    break;
            }
        }
    }
}