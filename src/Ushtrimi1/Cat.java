package Ushtrimi1;

//Krijo klasen Cat qe trashegon nga klasa Animal si dhe permban metoden meow().

public class Cat extends Animal {
    public Cat(){  //konstruktori default

    }

    public Cat(String name, String color, Boolean isVeg) {
        super(name, color, isVeg);
    }
    static void meow(){
        System.out.println("The cat says Meow Meow");
    }
    @Override
    public void animalSound(){
        System.out.println("The cat says Meow Meow"); //Permirsim me polimorfizem
    }
    @Override
     public void eat(){
        System.out.println("The cat eats mice, fish...");
    }


}
