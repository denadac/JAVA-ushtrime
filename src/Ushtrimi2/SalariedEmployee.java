package Ushtrimi2;

public class SalariedEmployee extends Employee {
    double fixedSalary;

    public SalariedEmployee(String n, String s, int i, double salary) {
        super(n, s, i);
        this.fixedSalary = salary;
    }


    //getters
    public double getFixedSalary(){
        return fixedSalary;
    }

    //setters
    public void setFixedSalary(double fSalary){
        this.fixedSalary = fSalary;
    }

    public  double totalSalary(){
        return getFixedSalary();
    }

    public String toString()
    {
        return String.format( "%s\nTotal Salary :%s",super.toString(),  totalSalary() );
    }
}
