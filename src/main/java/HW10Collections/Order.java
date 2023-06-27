package main.java.HW10Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Order {
    private final List<Menu> foodOrder;
    private final List<Menu> drinkOrder;

    public Order() {
        foodOrder = new ArrayList<>();
        drinkOrder = new ArrayList<>();
    }

    public List<Menu> getFoodOrder() {
        return foodOrder;
    }

    public List<Menu> getDrinkOrder() {
        return drinkOrder;
    }

    public void makeOrder(Menu menu) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Меню кафе");
        System.out.println("Блюда:");
        for (int i = 1; i <= 12; i++) {
            Menu dish = menu.getPosition().get(i);
            System.out.println(i + " - " + dish.getName());
        }

        System.out.println("Напитки:");
        for (int i = 13; i <= 24; i++) {
            Menu drink = menu.getPosition().get(i);
            System.out.println(i + " - " + drink.getName());
        }

        List<Menu> currentFoodOrder = new ArrayList<>();
        List<Menu> currentDrinkOrder = new ArrayList<>();

        while (true) {
            System.out.println("Выберите номер позиции (или введите '0' для завершения заказа):");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("0")) {
                break;
            }

            try {
                int selectedNumber = Integer.parseInt(input);
                Menu selectedPosition = menu.getPosition().get(selectedNumber);

                if (selectedPosition != null) {
                    if (selectedNumber <= 12) {
                        currentFoodOrder.add(selectedPosition);
                        System.out.println("Выбрана позиция из заказа на блюда: " + selectedPosition.getName());
                    } else if (selectedNumber <= 24) {
                        currentDrinkOrder.add(selectedPosition);
                        System.out.println("Выбрана позиция из заказа на напитки: " + selectedPosition.getName());
                    } else {
                        System.out.println("Неверный номер позиции.");
                    }
                } else {
                    System.out.println("Неверный номер позиции.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод.");
            }
        }

        foodOrder.addAll(currentFoodOrder);
        drinkOrder.addAll(currentDrinkOrder);

        System.out.println("Ваш заказ на блюда:");
        for (Menu item : currentFoodOrder) {
            System.out.println(item.getName());
        }

        System.out.println("Ваш заказ на напитки:");
        for (Menu item : currentDrinkOrder) {
            System.out.println(item.getName());;
        }

    }

    public String getOrderDescription() {
        StringBuilder description = new StringBuilder();

        description.append("Блюда: ");
        for (Menu item : foodOrder) {
            description.append(item.getName()).append(", ");
        }

        description.append("Напитки: ");
        for (Menu item : drinkOrder) {
            description.append(item.getName()).append(", ");
        }

        if (description.length() > 0) {
            description.delete(description.length() - 2, description.length());
        }

        return description.toString();
    }
}