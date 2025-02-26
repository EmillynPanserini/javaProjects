package company;

public class Employee {

    public String name;          
    private double salary;         
    protected String position;     

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
