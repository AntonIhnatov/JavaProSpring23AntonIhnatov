package main.java.HW3InheritanceAndPolymorphismOOP1.Vehicle;

import main.java.HW3InheritanceAndPolymorphismOOP1.Interfaces.InterfacesForVehicle.SecondaryTechnicalInspection;
import main.java.HW3InheritanceAndPolymorphismOOP1.Interfaces.OffSeasonTechnicalInspection;

public abstract class Vehicle implements SecondaryTechnicalInspection, OffSeasonTechnicalInspection {
    private String brand;
    private int year;

    protected Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public abstract void startEngine();
}
