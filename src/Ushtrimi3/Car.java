package Ushtrimi3;

import Ushtrimi1.ZooKepeer;

import java.util.Objects;

//Krijo nje klase Car e cila do te permbaje disa variabla instance si type, color,
//year,numberOfSeats, si dhe metodat move(int speed) e cila do te printoje ne ekran ”Moving
//”+speed+”kilometers/hour” dhe refuel() e cila do te printoje ne ekran “No more fuel. Time to
//refuel.”
public class Car extends Vehicle {

    private int  numberOfSeats;

    public Car(String type, String color, int year, int seats){
        super(type,color, year);
        this.numberOfSeats  = seats;
    }

    //getters

    public int getNumberOfSeats(){
        return numberOfSeats;
    }

    //setters

    public void setNumberOfSeats(int seats){
        this.numberOfSeats = seats;
    }
    public void speed(int speed){
        System.out.println("Moving " + speed + " km/h");
    }
    public void refuel(){
        System.out.println("No more fuel. Time to refuel.");
    }

    public String toString(){
        return String.format("%s\nNumber of seats: %s",super.toString(), getNumberOfSeats());
    }
    public boolean equals(Object obj) {
        if (obj instanceof Car) {
            return super.equals(obj) &&  numberOfSeats == ((Car) obj).numberOfSeats;
        }
        return false;
    }




}
