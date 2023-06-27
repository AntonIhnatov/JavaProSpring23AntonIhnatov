package main.java.HW9Collections;

import java.util.HashMap;
import java.util.Map;

class Employee {

    private final Map<String, String> employees;

    public Employee() {
        employees = new HashMap<>();
    }

    public void initializeEmployees(String name, String ability) {
        employees.put(name, ability);
    }

    public String getEmployeeInfo(String name) {
        return employees.get(name);
    }

}