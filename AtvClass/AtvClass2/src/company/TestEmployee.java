package company;

public class TestEmployee {

    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.name = "John";
        employee.position = "Developer"; 
        employee.setSalary(5000.0);

        System.out.println("Name: " + employee.name);
        System.out.println("Position: " + employee.position);
        System.out.println("Salary: " + employee.getSalary());

    }
}
