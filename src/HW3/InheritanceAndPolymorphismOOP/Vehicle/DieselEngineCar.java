package HW3.InheritanceAndPolymorphismOOP.Vehicle;

public final class DieselEngineCar extends MotorCar{

    public DieselEngineCar(String brand, int year) {
        super(brand, year);
    }

    public void methodOfDieselEngine(){
        System.out.println("This car has a diesel engine");
    }
}
