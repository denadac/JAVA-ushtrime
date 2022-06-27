package Ushtrimi3;

import java.util.Objects;

// Krijo nje klase Bicycle e cila do te permbaje disa variabla si type, color, year,
//height,isRaceBike si dhe metodat move(int speed) e cila do te printoje ne ekran ”Moving
//”+speed+”kilometers/hour” dhe metoden putToTheService() e cila do te printoje ne
//ekran “Time to upgrade.”
public class Bicycle extends Vehicle {
    private double height;
    private Boolean isRaceBike;

    public Bicycle(String type, String color, int year, double h, Boolean race){
        super(type,color, year);
        this.height  = h;
        this.isRaceBike=race;

    }

    //getter
    public double getHeight(){
        return height;
    }
    public Boolean getIsRaceBike(){
        return isRaceBike;
    }

    //setters
    public void setHeight(int h){
        this.height = h;
    }
    public void setIsRaceBike(Boolean race){
        this.isRaceBike = race;
    }


    public void speed(int speed){
        System.out.println("Moving " + speed + " km/h");
    }
    public void putToTheService(){
        System.out.println("Time to upgrade.");
    }

    public String toString(){
        return String.format("%s\nHeight: %s\nIs race bike: %b",super.toString(), getHeight(), getIsRaceBike());
    }


}
