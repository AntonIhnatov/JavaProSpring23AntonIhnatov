package HW2EncapsulationOOP.example;

import HW2EncapsulationOOP.example.package1.SameName;

public class Main {
    public static void main(String[] args) {
        HW2EncapsulationOOP.example.package1.SameName sameName1 = new HW2EncapsulationOOP.example.package1.SameName();
        HW2EncapsulationOOP.example.package2.SameName sameName2 = new HW2EncapsulationOOP.example.package2.SameName();

        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        Employee employee = new Employee();
        Employee employee1 = new Employee("Ivan", "Ivanovich", "Ivanovski", "manager", "managert@example.com", "+380400404040", 18, 24000.0);
        Employee employee2 = new Employee("Natalia", "Grigorenko", "Pavlovna",20);

        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        Car car = new Car();
        car.start();

    }
}
