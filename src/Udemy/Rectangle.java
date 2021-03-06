package Udemy;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        if (width < 0) {
            width = 0;
        }
        if (length < 0) {
            length = 0;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double area() {
        return width * length;
    }
}

