package Ushtrimi1;

public class Animal extends Zoo {
    //Krijo klasen Animal qe do permbaje variablat e instances name, color, isVegetarian. Krijo
    //metodat eat(), sleep(), play() si dhe metodat get/set.

    private String name, color;
    private Boolean isVegetarian;
    public Animal(){  //konstruktori default
        this.name = "";
        this.color = "";
        this.isVegetarian = null;
    }
    public Animal(String name, String color, Boolean isVeg) {  //konstruktori i paramatrizuar
        this.name = name;
        this.color = color;
        this.isVegetarian = isVeg;
    }
    //getters
    public String getName(){
        return name;
    }
    public String getColor(){
        return color;
    }
    public Boolean getIsVegetarian(){
        return isVegetarian;
    }
    //setters
    public void setName(String newName){
        name = newName;
    }
    public void setColor(String newColor){
        color = newColor;
    }
    public void setIsVegetarian(Boolean veg){
        isVegetarian = veg;
    }
    public void eat(){
        System.out.println("Animal eating...");
    }
    static void sleep(){
        System.out.println("Animal sleeping");
    }
    public void animalSound(){
        System.out.println("Animal sound is...");
    }
    public void displayAnimal() {
        System.out.println("------------------");
        System.out.println("Name: "+ this.name);
        System.out.println("Color: " + this.color);
        System.out.println("Is vegetarian: " + this.isVegetarian);
        System.out.println("------------------");

    }


}
