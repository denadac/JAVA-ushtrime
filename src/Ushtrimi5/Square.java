package Ushtrimi5;

public class Square extends Shape {
    @Override
    public double getPerimeter(double length) {
        return 4* length;
    }

    @Override
    public double getSurface(double length) {
        return length * length;
    }
}
