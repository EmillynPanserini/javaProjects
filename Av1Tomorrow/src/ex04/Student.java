package ex04;

public class Student {

    private String name;          
    private double grade1;        
    private double grade2;        
    
    public Student(String name, double grade1, double grade2) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
    }

    // Method to calculate and display the average of the two grades
    public void calculateAverage() {
        double average = (grade1 + grade2) / 2;
        System.out.println("Average: " + average);
    }

    // Method to check if the student is approved or not
    public void checkApproval() {
        double average = (grade1 + grade2) / 2;
        if (average >= 6.0) {
            System.out.println("Student " + name + " is approved.");
        } else {
            System.out.println("Student " + name + " is not approved.");
        }
    }
}

