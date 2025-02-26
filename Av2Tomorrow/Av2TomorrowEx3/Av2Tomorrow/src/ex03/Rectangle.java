package ex03;

public class Rectangle extends Form {
    private double width;  
    private double height;  

    // Constructor to  the rectangle dimensions
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}

