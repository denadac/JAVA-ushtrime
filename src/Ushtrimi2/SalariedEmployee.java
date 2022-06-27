package Ushtrimi2;

public class SalariedEmployee extends Employee {
    double fixedSalary;

    public SalariedEmployee(String n, String s, int i, double salary) {
        super(n, s, i);
        this.fixedSalary = salary;
    }
}
