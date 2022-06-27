package Ushtrimi4;
import java.sql.Array;
import java.util.ArrayList;


public class Country  implements Measurable {
    private String countryName;
    private double surface;
    public Country(){
        this.countryName = "";
        this.surface = 0;
    }
    public Country(String name, double s){
        this.countryName = name;
        this.surface = s;
    }
    public String getCountryName(){
        return countryName;
    }
    public double getSurface(){
        return surface;
    }
    public void setCountryName(String name){
        this.countryName = name;
    }
    public void setSurface(double s){
        this.surface = s;
    }
    public double getMeasure(){
        ArrayList<Country> cList = new ArrayList<Country>();
        double sum = 0;
        for (int i= 0; i< cList.size(); i++){
            sum += cList.get(i).getSurface();

        }
        return sum / cList.size();

    }
}
