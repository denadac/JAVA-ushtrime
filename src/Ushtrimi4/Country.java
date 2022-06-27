package Ushtrimi4;

public class Country {
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
}
