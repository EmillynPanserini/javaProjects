package atvClass3;

public class Main {

    public static void main(String[] args) {

        Employee[] employees = new Employee[3];

        employees[0] = new HourlyEmployee(160, 25.0);  
        employees[1] = new SalariedEmployee (3000.0);    
        employees[2] = new HourlyEmployee(180, 30.0); 

        // Calculating and displaying the salaries
        for (Employee e : employees) {
            System.out.println("Salary: $" + e.calculateSalary());
        }
    }
}


