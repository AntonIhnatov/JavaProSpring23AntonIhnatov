package main.java.HW3InheritanceAndPolymorphismOOP1.Vehicle;

public abstract class MotorCar extends Vehicle{
    public MotorCar(String brand, int year) {
        super(brand, year);
    }

    public void carHorn() {
        System.out.println("Car can horn");
    }

    @Override
    public void startEngine() {
        System.out.println("Starting engine");
    }

    @Override
    public void checkCoolingSystem() {
        System.out.println("Checking cooling system...");
    }

    @Override
    public void checkOilFilter() {
        System.out.println("Checking oil filter...");
    }

    @Override
    public void checkCarEngine() {
        System.out.println("Checking car engine...");
    }

    @Override
    public void checkBrakeSystem() {
        System.out.println("Checking brake system...");
    }

    @Override
    public void tireReplacement() {
        System.out.println("Tire replacement in progress..");
    }

    @Override
    public void changeOfOil() {
        System.out.println("Oil change in progress...");
    }
}
