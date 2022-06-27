package Ushtrimi5;

public abstract class Shape {
    private double length;

    public double getLength(){
        return length;
    }
    public void setLength(){
        this.length= length;
    }

    public abstract double getPerimeter(double length);
    public abstract double getSurface(double length);
}
