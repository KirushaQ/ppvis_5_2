package manager;

import java.util.ArrayList;

public class Vehicle{
    private data.Vehicle veh;
    public Vehicle(data.Vehicle veh){
        this. veh = veh;
    }

    public void add(model.Vehicle vehicle){
        veh.add_element(vehicle);
    }

    public model.Vehicle get(int number){
        return veh.return_element(number);
    }

    public void delete(int name){
        veh.delete_element(name);
    }

    public ArrayList<model.Vehicle> get_all(){
        return veh.return_list();
    }
}