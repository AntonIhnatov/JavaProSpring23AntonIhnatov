package HW3.InheritanceAndPolymorphismOOP.Vehicle;

public class MotorCar extends Vehicle{
    protected MotorCar(String brand, int year){
        super(brand,year);
    }

    public void carHorn(){
        System.out.println("Car can horn");
    }

    @Override
    public void startEngine() {
        System.out.println("Starting engine...");
    }

    @Override
    public void checkCarEngine() {
        System.out.println("Checking car engine..");
    }

    @Override
    public void checkBrakeSystem() {
        System.out.println("Checking brake system...");
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
    public void offSeasonTIMethod() { System.out.println("Do off-season technical inspection..."); }
}
