package main.java.HW2EncapsulationOOP;

public class Employee {
    //клас "Співробітник" з полями: ім'я, прізвище, по-батькові, посада, email, телефон, вік, заробітня платня
    private final String firstName;
    private final String secondName;
    private final String fatherName;
    public String position;
    public String email;
    public String phone;
    public int age;
    public double salary;

    //Конструктор за замовчуванням
    public Employee() {
        this.firstName = "";
        this.secondName = "";
        this.fatherName = "";
        System.out.println("Default constructor");
    }
    //Конструктор з усіма полями
    public Employee(String firstName, String secondName, String fatherName, String position, String email, String phone, int age, double salary) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.fatherName = fatherName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.age = age;
        this.salary = salary;

        System.out.println("firstName: " + firstName + ", secondName: " + secondName + ", fatherName: " + fatherName + ", position: " + position + ", email: " + email + ", phone: " + phone + ", age: " + age + ", salary: " + salary);
    }
    //Конструктор для створення бугалтера
    public Employee(String firstName, String secondName, String fatherName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.fatherName = fatherName;
        this.position = "accountant";
        this.email = "accountant@example.com";
        this.phone = "+0800330222";
        this.age = age;
        this.salary = 50000.0;

        System.out.println("firstName: " + firstName + ", secondName: " + secondName + ", fatherName: " + fatherName + ", position: " + position + ", email: " + email + ", phone: " + phone + ", age: " + age + ", salary: " + salary);
    }

    public Employee(String firstName, String secondName, String fatherName, String position, double salary) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.fatherName = fatherName;
        this.position = position;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
}
