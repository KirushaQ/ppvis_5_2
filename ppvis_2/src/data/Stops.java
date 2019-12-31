package data;
import java.util.ArrayList;

public class Stops {
    private ArrayList<model.Stops> list = new ArrayList<>();

    public Stops(){
        model.Stops st1 = new model.Stops("Пушкинская");
        list.add(st1);
        model.Stops st2 = new model.Stops("Кунцевщина");
        list.add(st2);
        model.Stops st3 = new model.Stops("Пролетраская");
        list.add(st3);
        model.Stops st4 = new model.Stops("Пл. Ленина");
        list.add(st4);
        model.Stops st5 = new model.Stops("Дружная");
        list.add(st5);
        model.Stops st6 = new model.Stops("Академия управления");
        list.add(st6);
        model.Stops st7 = new model.Stops("Широкая");
        list.add(st7);
        model.Stops st8 = new model.Stops("Гостиница");
        list.add(st8);
        model.Stops st9 = new model.Stops("Молодёжная");
        list.add(st9);
        model.Stops st10 = new model.Stops("Новая");
        list.add(st10);

    }

    public void add_element(model.Stops veh){
        list.add(veh);
    };

    public void delete_element(String number){
        for (int i=0; i<list.size(); i++){
            if (list.get(i).get_name().equals(number)){
                list.remove(i);
                break;
            }
        }
    };

    public model.Stops return_element(String number){
        for (int i=0; i<list.size(); i++){
            if (list.get(i).get_name().equals(number)){
                return list.get(i);
            }
        }
        return null;
    };

    public ArrayList<model.Stops> return_list(){
        return list;
    };
}

