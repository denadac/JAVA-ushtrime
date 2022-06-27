package Ushtrimi1;
import Ushtrimi2.Employee;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        Dog myDog = new Dog("Bobi", "White", false);
        myCat.meow();
        myDog.bark();
        myCat.animalSound();
        myDog.animalSound();
        Dog myDog2 = new Dog("DR", "White", false);  //Therritja e konstruktorit te parametrizuar
        Cat myCat1 = new Cat("Rosi", "Orange", false);
        myDog2.displayAnimal();
        Cat myCat2 = new Cat(); //konstruktori default
        myCat2.displayAnimal();
        ArrayList<Cat> lista1 = new ArrayList<Cat>();
        lista1.add(myCat1);
        lista1.add(myCat2);
        ArrayList<Dog> lista2 = new ArrayList<Dog>();
        lista2.add(myDog);
        lista2.add(myDog2);
        Dog dog3 = new Dog("Rex", "Black", false);
        lista2.add(dog3);
        //Test overriding toString() method
        ZooKepeer person1 = new ZooKepeer("Billy", "Kahn", 23);
        System.out.println(person1);
        System.out.println();
        System.out.println(lista2);



        System.out.println("Lista e maceve ");
        for (int i = 0; i < lista1.size(); i++) {
            System.out.print("Cat " + (i+1) +":");
            Cat curr = lista1.get(i);
            curr.displayAnimal();
        }
        System.out.println("****************");
        System.out.println("Lista e qenve ");
        for (int i = 0; i < lista2.size(); i++) {
            System.out.print("Dog " + (i+1) +":");
            Dog curr = lista2.get(i);
            curr.displayAnimal();
        }






    }
}