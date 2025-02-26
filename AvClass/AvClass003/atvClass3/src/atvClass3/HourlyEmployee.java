package atvClass3;

public class HourlyEmployee extends Employee {

    private double hoursWorked;
    private double hourlyRate;

    public HourlyEmployee(double hoursWorked, double hourlyRate) {
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}
