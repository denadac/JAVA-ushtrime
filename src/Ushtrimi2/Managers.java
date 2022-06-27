package Ushtrimi2;

public class Managers  extends Employee{

    double bonus, base;
    public Managers(String n, String s, int i,double base, double bon) {
        super(n, s, i);
        this.bonus = bon;
        this.base = base;
    }

    //getters
    public double getBase(){
        return base;
    }
    public double getBonus(){
        return bonus;
    }

    //setters
    public void setBase(double b){
        this.base = b;
    }
    public void setBonus(double br){
        this.bonus = br;
    }
    public  double totalSalary(){
        return base + bonus;
    }
    public String toString()
    {
        return String.format( "%s\nBase wage: %s\nBonus: %s\nTotal Salary :%s",super.toString(),getBase(), getBonus(),  totalSalary() );
    }
}
