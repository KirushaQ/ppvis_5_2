package Injector;

import data.Types;
import UI.Administrator;
import UI.Load_screen;
import UI.User;


public class Injector {
    private manager.Vehicle vehicle_man;
    private manager.Stops stops_man;
    private manager.Route route_man;

    public Injector() {
        data.Vehicle vehicle = new data.Vehicle();
        data.Stops stops = new data.Stops();
        data.Route route = new data.Route(stops);

        manager.Vehicle vehicle_man = new manager.Vehicle(vehicle);
        manager.Stops stops_man = new manager.Stops(stops);
        manager.Route route_man = new manager.Route(route);

        this.route_man = route_man;
        this.stops_man = stops_man;
        this.vehicle_man = vehicle_man;

        Load_screen screen = new Load_screen(this);
    }

    public void autorisation(String login, String password) {
        if (login.equals("admin") && password.equals("admin")) {
            Administrator admin = new Administrator(vehicle_man, stops_man, route_man);
        }
    }

    public void choose_type(Types v) {
        User user = new User(v, vehicle_man, stops_man, route_man);
    }
}
