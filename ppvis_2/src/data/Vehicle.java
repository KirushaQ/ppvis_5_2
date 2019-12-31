package data;

import java.util.ArrayList;

public class Vehicle{
    private ArrayList<model.Vehicle> list = new ArrayList<>();

    public Vehicle(){
        model.Vehicle bus55 = new model.Vehicle(Types.BUS, 55, 60);
        list.add(bus55);
        model.Vehicle bus27 = new model.Vehicle(Types.BUS, 27, 60);
        list.add(bus27);
        model.Vehicle tram10 = new model.Vehicle(Types.TRAM, 10, 45);
        list.add(tram10);
        model.Vehicle trbus14 = new model.Vehicle(Types.TROLLEY_BUS, 14, 55);
        list.add(trbus14);
        model.Vehicle sub1 = new model.Vehicle(Types.SUBWAY, 1, 65);
        list.add(sub1);
    }

    public void add_element(model.Vehicle veh){
        list.add(veh);
    };

    public void delete_element(int number){
        for (int i=0; i<list.size(); i++){
            if (list.get(i).get_number() == number){
                list.remove(i);
                break;
            }
        }
    };

    public model.Vehicle return_element(int number){
        for (int i=0; i<list.size(); i++){
            if (list.get(i).get_number() == number){
                return list.get(i);
            }
        }
        return null;
    };

    public ArrayList<model.Vehicle> return_list(){
        return list;
    };
}

