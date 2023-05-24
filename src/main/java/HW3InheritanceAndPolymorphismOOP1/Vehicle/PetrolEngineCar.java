package main.java.HW3InheritanceAndPolymorphismOOP1.Vehicle;


public class PetrolEngineCar extends MotorCar {
    public PetrolEngineCar(String brand, int year) {
        super(brand, year);
    }

    public void methodOfPetrolEngine() {
        System.out.println("This car has a petrol engine");
    }

}
