package Ushtrimi2;

public class Main2 {
    public static void main(String[] args) {
        HourlyEmployee emp1 = new HourlyEmployee("Ben", "King", 1245,45,18);
        System.out.println(emp1);

        System.out.println("------------------");

        SalariedEmployee emp2 = new SalariedEmployee("Ross", "Geller", 4457,1948);
        System.out.println(emp2);

        System.out.println("------------------");

        Managers emp3 = new Managers("Joey", "Tribiani", 4548961, 700,385);
        System.out.println(emp3);


    }
}
