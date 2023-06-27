package main.java.HW9Collections;

import java.util.HashMap;
import java.util.Map;

public class Menu {
    private final String name;
    private final String description;
    private final Map<Integer, Menu> positions;

    @Override
    public String toString() {
        return name;
    }
    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
        this.positions = new HashMap<>();
    }

    public void addPosition(int positionsNumber, String name, String description) {
        Menu dish = new Menu(name, description);
        positions.put(positionsNumber, dish);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Map<Integer, Menu> getPosition() {
        return positions;
    }
}

