package Ushtrimi5;

public class Main5 {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.getPerimeter(25);
        System.out.println("Perimetri i rrethit: " + c.getPerimeter(25));
        System.out.println("Siperfaqe e rrethit: " + c.getSurface(6));

        Square sq = new Square();
        sq.getPerimeter(5);
        System.out.println("Perimetri i katrorit: " + sq.getPerimeter(5));
        System.out.println("Siperfaqe e katrorit: " + sq.getSurface(10));

    }

}
