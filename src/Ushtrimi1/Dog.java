package Ushtrimi1;

//Krijo klasen Dog qe trashegon nga klasa Animal si dhe permban metoden bark().

public class Dog extends Animal {
    public Dog(){  //konstruktori default

    }

    public Dog(String name, String color, Boolean isVeg) {
        super(name, color, isVeg);
    }
    static void bark(){
        System.out.println("The dog says Woof Woof");
    }
    @Override
    public void animalSound(){
        System.out.println("The dog says Woof Woof"); //Permirsim me polimorfizem
    }
}
