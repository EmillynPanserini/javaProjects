package ex04;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("John Doe", 8.0, 7.5);

        student1.calculateAverage();

        student1.checkApproval();

        Student student2 = new Student("Jane Smith", 5.0, 4.5);

        // Displaying information for the second student
        student2.calculateAverage();
        student2.checkApproval();
    }
}
