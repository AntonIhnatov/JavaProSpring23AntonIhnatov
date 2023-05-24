package main.java.HW3InheritanceAndPolymorphismOOP1.Vehicle;

import main.java.HW3InheritanceAndPolymorphismOOP1.Vehicle.MotorCar;

public class ElectricEngineCar extends MotorCar {
    public ElectricEngineCar(String brand, int year) {
        super(brand, year);
    }

    public void methodOfElectricMotor() {
        System.out.println("This car has an electric engine");
    }

}
