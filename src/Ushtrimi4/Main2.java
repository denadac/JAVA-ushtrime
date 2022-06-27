package Ushtrimi4;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(12488, 100);
        BankAccount acc2 = new BankAccount(12488, 500.5);
        AverageComputation comp1 = new AverageComputation();
        comp1.accountList = new ArrayList<BankAccount>();
        comp1.accountList.add(acc1);
        comp1.accountList.add(acc2);
        double result = comp1.getAverageBankAmount(comp1.accountList);
        System.out.println(result);
        //Kodi shume i gjate dhe jo praktik

        Country c1 = new Country("Albania", 21546);
        Country c2 = new Country("Kosovo", 1520);
        AverageComputation comp2 = new AverageComputation();
        comp2.countryList = new ArrayList<Country>();
        comp2.countryList.add(c1);
        comp2.countryList.add(c2);

        double result2 = comp2.getAverageSurface(comp2.countryList);
        System.out.println(result2);






    }
}
