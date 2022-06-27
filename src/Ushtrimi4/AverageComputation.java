package Ushtrimi4;
import java.util.ArrayList;

public class AverageComputation {
    public ArrayList<BankAccount> accountList;
    public ArrayList<Country> countryList;
    public double getAverageBankAmount(ArrayList<BankAccount> accountList){
        double sum = 0;
        for (int i= 0; i< accountList.size(); i++){
             sum += accountList.get(i).getAmount();

        }
        return sum / accountList.size();

    }
    public double getAverageSurface(ArrayList<Country> countryList){
        double sum = 0;
        for (int i= 0; i< countryList.size(); i++){
            sum += countryList.get(i).getSurface();

        }
        return sum / countryList.size();

    }
}
