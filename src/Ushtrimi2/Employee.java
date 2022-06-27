package Ushtrimi2;

public abstract class Employee {
    private String name, surname;
    private int id;

    public Employee(String n,String s, int i){
        this.name = n;
        this.surname= s;
        this.id = i;

    }
    //Getters
    public String getName(){
        return name;
    }
    public  String getSurname() {
        return surname;
    }
    public int getId(){
        return id;
    }

    //Setters
    public void setName(String n){
        this.name = n;
    }
    public void setSurname(String s){
        this.surname = s;
    }
    public void setId(int i){
        this.id = i;
    }
    @Override
    public String toString()
 {
        return String.format( "First Name: %s\nLast Name: %s\nEmployee ID: %s",getName(), getSurname(), getId() );
        }

        //abstract method
        public abstract double totalSalary();

}
