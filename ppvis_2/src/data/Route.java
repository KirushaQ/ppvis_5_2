package data;

import java.util.ArrayList;

public class Route {
    private ArrayList<model.Route> list = new ArrayList<>();

    public Route(Stops stops){
        model.Route bus55 = new model.Route(55);
        bus55.add_stop(stops.return_element("Пушкинская"));
        bus55.add_stop(stops.return_element("Дружная"));
        bus55.add_stop(stops.return_element("Гостиница"));
        list.add(bus55);

        model.Route bus27 = new model.Route(27);
        bus27.add_stop(stops.return_element("Пушкинская"));
        bus27.add_stop(stops.return_element("Широкая"));
        bus27.add_stop(stops.return_element("Новая"));
        list.add(bus27);

        model.Route tram10 = new model.Route(10);
        tram10.add_stop(stops.return_element("Пл. Ленина"));
        tram10.add_stop(stops.return_element("Широкая"));
        tram10.add_stop(stops.return_element("Академия управления"));
        list.add(tram10);

        model.Route trbus14 = new model.Route(14);
        trbus14.add_stop(stops.return_element("Пл. Ленина"));
        trbus14.add_stop(stops.return_element("Кунцевщина"));
        trbus14.add_stop(stops.return_element("Гостиница"));
        list.add(trbus14);

        model.Route sub1 = new model.Route(1);
        sub1.add_stop(stops.return_element("Дружная"));
        sub1.add_stop(stops.return_element("Молодёжная"));
        sub1.add_stop(stops.return_element("Пролетраская"));
        list.add(sub1);

    }

    public void add_element(model.Route veh){
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

    public model.Route return_element(int number){
        for (int i=0; i<list.size(); i++){
            if (list.get(i).get_number() == number){
                return list.get(i);
            }
        }
        return null;
    };

    public ArrayList<model.Route> return_list(){
        return list;
    };
}

