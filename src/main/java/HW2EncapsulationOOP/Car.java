package main.java.HW2EncapsulationOOP;

public class Car {
    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startElectricity() {
        System.out.println("Starting electricity system in this car");
    }

    private void startCommand() {
        System.out.println("Starting command system in this car");
    }

    private void startFuelSystem() {
        System.out.println("Starting fuel system in this car");
    }
}
