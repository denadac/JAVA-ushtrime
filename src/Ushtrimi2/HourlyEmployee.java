package Ushtrimi2;

public class HourlyEmployee extends Employee {
    private int hours;
    private double hourlyRate;

    public HourlyEmployee(String n, String s, int i, int hr, int rate){
        super( n, s, i);
        this.hours = hr;
        this.hourlyRate = rate;
    }
}
