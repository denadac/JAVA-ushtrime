package Ushtrimi3;

import java.util.ArrayList;

public class Main3 {
    public static void main(String[] args) {
        Bicycle bike = new Bicycle("Urban", "Silver", 2019, 0.98, true);
        bike.speed(14);
        bike.putToTheService();
        System.out.println(bike);
        System.out.println("---------------");
        Car car1 = new Car("BMW", "Red", 2019, 5);
        car1.speed(120);
        car1.refuel();
        System.out.println(car1);

        Car car2 = new Car("Tesla", "White", 2020, 5);

        //arraylist
        System.out.println("---------------");
        System.out.println("Test my vehicle method");
        ArrayList<Vehicle> list = new ArrayList<Vehicle>();
        list.add(bike);
        list.add(car1);
        list.add(car2);
        Bicycle bike2 = new Bicycle("Mountain", "Blue", 2020, 1, false);
        list.add(bike2);

        for (int i = 0; i < list.size(); i++) {
            list.get(i).speed(100);
            if (list.get(i) instanceof Car) {
                ((Car) list.get(i)).refuel();
            } else if (list.get(i) instanceof Bicycle) {
                ((Bicycle) list.get(i)).putToTheService();
            }

        }

        if (car1.equals(car2)) {
            System.out.println("Same car properties");
        }
        else {
            System.out.println("Not same car properties");
        }
        Car car3 = new Car("Tesla", "White", 2020, 5);
        if (car3.equals(car2)) {
            System.out.println("Same car properties");
        }
        else {
            System.out.println("Not same car properties");
        }


    }
}
