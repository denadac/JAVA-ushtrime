package Ushtrimi3;

import java.util.Objects;

//Krijo nje klase Vehicle e cila do te jete super class e klasave me siper. Zbulo variablat e
//instances dhe metodat e ngjashme per seicilen klase.
public abstract class Vehicle {
    private String type, color;
    private int year;
    public Vehicle(String type, String color, int year){
        this.type = type;
        this.year  = year;
        this.color=color;

    }

    //getters
    public String getType(){
        return type;
    }
    public String getColor(){
        return color;
    }
    public int getYear(){
        return year;
    }

    //setters
    public void setType(String newType){
        this.type = newType;
    }
    public void setColor(String newColor){
        this.color = newColor;
    }
    public void setYear(int newYear){
        this.year = newYear;
    }

    public abstract void speed(int speed);
    @Override
    public String toString(){
        return String.format("Type: %s\nColor: %s\nYear: %d",getType(),getColor(),getYear());
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj.getClass() == getClass()) {
            return type == ((Vehicle) obj).type && color == ((Vehicle) obj).color &&  year == ((Vehicle) obj).year;
        }
        return false;
    }
}
