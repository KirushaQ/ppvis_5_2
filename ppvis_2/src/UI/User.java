package UI;

import data.Types;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class User {
    private JFrame frame;
    private JButton routs;
    private JButton stops;
    private JButton rout;
    private JButton stop;
    private JComboBox box;
    private JTextField text;

    private manager.Vehicle veh;
    private manager.Stops st;
    private manager.Route rt;
    private Types type;

    public User(Types type, manager.Vehicle veh, manager.Stops st, manager.Route rt) {
        frame = new JFrame();
        frame = new JFrame();
        frame.setSize(800, 600);
        frame.getContentPane().setLayout(null);

        this.veh = veh;
        this.st = st;
        this.rt = rt;
        this.type = type;

        routs = new JButton();
        routs.setText("Show all routs");
        routs.setBounds(50,50,200,50);
        routs.addActionListener(new RoutsListener());
        frame.add(routs);

        stops = new JButton();
        stops.setText("Show all stops");
        stops.setBounds(50,150,200,50);
        stops.addActionListener(new StopsListener());
        frame.add(stops);

        rout = new JButton();
        rout.setText("Show rout information");
        rout.setBounds(50,250,200,50);
        rout.addActionListener(new RoutListener());
        frame.add(rout);

        stop = new JButton();
        stop.setText("Show stop information");
        stop.setBounds(350,250,200,50);
        stop.addActionListener(new StopListener());
        frame.add(stop);

        box = new JComboBox();
        box.setBounds(50,350,525,50);
        box.setEditable(true);
        frame.add(box);

        text = new JTextField();
        text.setBounds(350,50,200,50);
        frame.add(text);

        frame.setVisible(true);
    }

    public class RoutsListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            int i = 0;
            box.removeAllItems();
            for (i = 0; i<rt.get_all().size(); i++){
                if (veh.get(rt.get_all().get(i).get_number()).get_type() == type) {
                    box.addItem(String.valueOf(rt.get_all().get(i).get_number()));
                }
            }
        }
    }

    public class StopsListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            int i = 0;
            box.removeAllItems();
            for (i = 0; i<st.get_all().size(); i++){
                box.addItem(st.get_all().get(i).get_name());
            }
        }
    }

    public class RoutListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            int i = 0;
            box.removeAllItems();
            String string = text.getText();
            for (i = 0; i<rt.get(Integer.valueOf(string)).get_route().size(); i++){
                box.addItem(rt.get(Integer.valueOf(string)).get_route().get(i).get_name());
            }

        }
    }

    public class StopListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            int i = 0;
            int j = 0;
            int k = 0;
            box.removeAllItems();
            String string = text.getText();
            for (i = 0; i<rt.get_all().size(); i++){
                j = 0;
                for (k = 0; k<rt.get_all().get(i).get_route().size(); k++){
                    if (rt.get_all().get(i).get_route().get(k).get_name().equals(string)){
                        j++;
                        break;
                    }
                }
                if (j!=0) {
                    box.addItem(String.valueOf(rt.get_all().get(i).get_number()));
                }
            }
        }
    }

}