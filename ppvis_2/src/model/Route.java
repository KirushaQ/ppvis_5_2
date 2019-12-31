package model;

import java.util.ArrayList;

public class Route {
    private int number;
    private ArrayList<Stops> route  = new ArrayList<>();
        public Route(int number){
            this.number = number;
        }

        public void add_stop(Stops stop){
            route.add(stop);
        }

        public void remove_stop(String name){
            for (int i=0; i<route.size(); i++){
                if (route.get(i).get_name().equals(name)){
                    route.remove(i);
                    break;
                }
            }
        }

        public void clear(){
            route.clear();
        }

        public int get_number(){
            return number;
        }

        public ArrayList<Stops> get_route(){
            return route;
        }
}


