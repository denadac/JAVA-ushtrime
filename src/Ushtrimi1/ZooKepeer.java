package Ushtrimi1;
import java.util.Objects;

//Krijo nje klase ZooKepeer qe permbaje variablat e instances si name, surname, age. Krijo metodat get/set.
//Cila eshte superclass e klases ZooKepeer? Bej override metodat
//toString() dhe equals() te klases Object.

public class ZooKepeer extends Zoo {
    private String name, surname;
    private int age;
    public ZooKepeer(){}

    public ZooKepeer(String name, String surname,int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    //getters
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public int getAge(){
        return age;
    }
    //setters
    public void setName(String newName){
        name = newName;
    }
    public void setSurname(String newSurname){
        surname = newSurname;
    }
    public void setIsVegetarian(int newAge){
        age = newAge;
    }

    @Override
    public String toString() {  //overriding toString() method
        return "Name: " + String.valueOf(this.name) + " Surname: " + String.valueOf(this.surname) + " Age: " +String.valueOf(this.age);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ZooKepeer zoo = (ZooKepeer) o;
        return age == zoo.age && Objects.equals(name, zoo.name);
    }


}
