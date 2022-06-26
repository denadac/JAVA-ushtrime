package Ushtrimi1;
import java.util.ArrayList;

public class Zoo  {
      ArrayList<Cat> cats;
      ArrayList<Dog> dogs;

    public Zoo() {
        cats = new ArrayList<Cat>();
        dogs = new ArrayList<Dog>();
    }
    public ArrayList<Cat> getCats(){
        return cats;
    }
    public ArrayList<Dog> getDogs(){
        return dogs;
    }
    public void setCats(ArrayList<Cat> newCat){
        cats = newCat;
    }
    public void setDogs(ArrayList<Dog> newDog){
        dogs = newDog;
    }
    public void addCat(Cat cat1) {
        cats.add(cat1);
    }
    public void addDog(Dog dog1) {
        dogs.add(dog1);
    }








}
