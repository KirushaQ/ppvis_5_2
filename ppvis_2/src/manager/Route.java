package manager;

import java.util.ArrayList;

public class Route{
    private data.Route route;
    public Route(data.Route veh){
        this.route = veh;
    }

    public void add(model.Route stop){
        route.add_element(stop);
    }

    public model.Route get(int number){
        return route.return_element(number);
    }

    public void delete(int name){
        route.delete_element(name);
    }

    public ArrayList<model.Route> get_all(){
        return route.return_list();
    }

    public void add_stop(int number, model.Stops stop){
        route.return_element(number).add_stop(stop);
    }

}
