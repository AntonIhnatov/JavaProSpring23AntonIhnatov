package HW3.InheritanceAndPolymorphismOOP.Vehicle;

public final class PetrolEngineCar extends MotorCar{
    public PetrolEngineCar(String brand, int year) {
        super(brand, year);
    }

    public void methodOfPetrolEngine(){
        System.out.println("This car has a petrol engine");
    }

}
