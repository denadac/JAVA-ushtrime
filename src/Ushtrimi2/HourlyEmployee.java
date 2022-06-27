package Ushtrimi2;

public class HourlyEmployee extends Employee {
    private int hours;
    private double hourlyRate;

    public HourlyEmployee(String n, String s, int i, int hr, double rate){
        super( n, s, i);
        this.hours = hr;
        this.hourlyRate = rate;
    }

    //getters
    public int getHours(){
        return hours;
    }
    public double getHourlyRate(){
        return hourlyRate;
    }

    //setters
    public void setHours( int hr){
        this.hours = hr;
    }
    public void setHourlyRate(double hourly){
        this.hourlyRate = hourly;
    }


    public  double totalSalary(){
        if (getHours() <= 40){
            return hourlyRate*hours;

        }
        else {
            return hourlyRate*40 + 2*hourlyRate*(hours-40);
        }
    }

    public String toString()
    {
        return String.format( "%s\nHours worked: %s\nHourly Rate: %s\nTotal Salary :%s",super.toString(), getHours(), getHourlyRate(), totalSalary() );
    }
}
