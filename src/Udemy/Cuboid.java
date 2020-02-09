package Udemy;

public class Cuboid extends Rectangle {

    private double heigth = 0;

    public Cuboid(double length, double width, double heigth) {
        super(length, width);
        if (heigth < 0) {
            heigth = 0;
        }
    }
}
