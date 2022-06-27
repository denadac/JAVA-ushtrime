package Ushtrimi3;
import Ushtrimi1.ZooKepeer;

import java.util.ArrayList;
import java.util.Objects;

public class Sportist {
    private ArrayList<Vehicle> vehicleList = new ArrayList();
    public ArrayList<Vehicle> getVehicleList(){
        return vehicleList;
    }
    public void setVehicleList(ArrayList<Vehicle> list) {
        this.vehicleList = list;
    }

    public void testMyVehicle(ArrayList<Vehicle> list){
        for (int i=0; i<list.size(); i++){
            list.get(i).speed(100);
            if (list.get(i) instanceof Car){
               ((Car) list.get(i)).refuel();
            }
            else if (list.get(i) instanceof Bicycle){
                ((Bicycle) list.get(i)).putToTheService();
            }
        }
    }






}
