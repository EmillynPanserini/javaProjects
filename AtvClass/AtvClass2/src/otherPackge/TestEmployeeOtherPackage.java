package otherPackge;

import company.Employee;

public class TestEmployeeOtherPackage {

    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.name = "Maria"; 
        System.out.println("Name: " + employee.name);
    }
}
