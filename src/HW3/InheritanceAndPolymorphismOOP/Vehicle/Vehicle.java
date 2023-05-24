package HW3.InheritanceAndPolymorphismOOP.Vehicle;
import HW3.InheritanceAndPolymorphismOOP.Interfaces.InterfacesForVehicle.SecondTechnicalInspection;
import HW3.InheritanceAndPolymorphismOOP.Interfaces.OffSeasonTechnicalInspection;

public abstract class Vehicle implements SecondTechnicalInspection, OffSeasonTechnicalInspection {
    private String brand;
    private int year;

    protected Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    protected abstract void startEngine();

}
