package atvClass3;

public class SalariedEmployee extends Employee {

    private double monthlySalary;

    public SalariedEmployee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}
