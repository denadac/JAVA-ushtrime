package Ushtrimi5;

public class Circle extends Shape{
    private double reze;
    @Override
    public double getPerimeter(double reze) {
        return reze*3.14 *2;
    }

    @Override
    public double getSurface(double length) {
        return length * length* 3.14;
    }
}
