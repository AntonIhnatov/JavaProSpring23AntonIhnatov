package HW3.InheritanceAndPolymorphismOOP.Vehicle;

public final class ElectricMotorCar extends MotorCar{

    public ElectricMotorCar(String brand, int year) {
        super(brand, year);
    }

    public void methodOfElectricMotor(){
        System.out.println("This car has an electric engine");
    }

}
