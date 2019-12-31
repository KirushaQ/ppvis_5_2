package manager;

import java.util.ArrayList;

public class Stops{
    private data.Stops stops;
    public Stops(data.Stops veh){
        this.stops = veh;
    }

    public void add(model.Stops stop){
        stops.add_element(stop);
    }

    public model.Stops get(String number){
        return stops.return_element(number);
    }

    public void delete(String name){
        stops.delete_element(name);
    }

    public ArrayList<model.Stops> get_all(){
        return stops.return_list();
    }

}
