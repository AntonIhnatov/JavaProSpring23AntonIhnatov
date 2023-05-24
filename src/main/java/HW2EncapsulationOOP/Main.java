package main.java.HW2EncapsulationOOP;

import main.java.HW2EncapsulationOOP.package1.SameName;

public class Main {
    public static void main(String[] args) {
        SameName sameName1 = new SameName();
        main.java.HW2EncapsulationOOP.package2.SameName sameName2 = new main.java.HW2EncapsulationOOP.package2.SameName();

        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        Employee employee = new Employee();
        Employee employee1 = new Employee("Ivan", "Ivanovich", "Ivanovski", "manager", "managert@example.com", "+380400404040", 18, 24000.0);
        Employee employee2 = new Employee("Natalia", "Grigorenko", "Pavlovna",20);
        Employee employee3 = new Employee("Anton", "Ihnatov", "Borysovich", "accountant", 77000.0);
        System.out.println("firstName: " + employee3.getFirstName() + ", secondName: " + employee3.getSecondName() + ", fatherName: " + employee3.getFatherName() + ", position: " + employee3.getPosition() + ", salary: " + employee3.getSalary());
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        Car car = new Car();
        car.start();

    }
}
