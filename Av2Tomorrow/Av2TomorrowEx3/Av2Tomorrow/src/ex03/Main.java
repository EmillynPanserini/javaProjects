package ex03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating a list to hold different shapes
        List<Form> forms = new ArrayList<>();

        // Creating instances of Rectangle and Circle
        Form rectangle = new Rectangle(5.0, 10.0);  // Width = 5.0, Height = 10.0
        Form circle = new Circle(7.0);              // Radius = 7.0

        // Adding shapes to the list
        forms.add(rectangle);
        forms.add(circle);

        // Calculating and displaying the area of each shape
        for (Form form : forms) {
            System.out.println("Area: " + form.calculateArea());
        }
    }
}
