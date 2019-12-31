package UI;
import data.Types;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Administrator {
    private JFrame frame;
    private JButton routs;
    private JButton stops;
    private JButton rout;
    private JButton stop;
    private JTextField text1;
    private JTextField text2;
    private JTextField text3;

    private manager.Vehicle veh;
    private manager.Stops st;
    private manager.Route rt;

    public Administrator(manager.Vehicle veh, manager.Stops st, manager.Route rt){
        frame = new JFrame();
        frame.setSize(800, 600);
        frame.getContentPane().setLayout(null);

        this.veh = veh;
        this.st = st;
        this.rt = rt;

        routs = new JButton();
        routs.setText("New rout");
        routs.setBounds(50,50,200,50);
        routs.addActionListener(new RoutsListener());
        frame.add(routs);

        stops = new JButton();
        stops.setText("New stop");
        stops.setBounds(50,150,200,50);
        stops.addActionListener(new StopsListener());
        frame.add(stops);

        rout = new JButton();
        rout.setText("New veh");
        rout.setBounds(50,250,200,50);
        rout.addActionListener(new VehListener());
        frame.add(rout);

        stop = new JButton();
        stop.setText("Add rout stop");
        stop.setBounds(50,350,200,50);
        stop.addActionListener(new StopListener());
        frame.add(stop);

        text1 = new JTextField();
        text1.setBounds(350,50,200,50);
        frame.add(text1);

        text2 = new JTextField();
        text2.setBounds(350,150,200,50);
        frame.add(text2);

        text3 = new JTextField();
        text3.setBounds(350,250,200,50);
        frame.add(text3);




        frame.setVisible(true);
    }

    public class RoutsListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            String string = text1.getText();
                model.Route r = new model.Route(Integer.valueOf(string));
                rt.add(r);
        }
    }

    public class StopsListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            String string = text1.getText();
            model.Stops s = new model.Stops(string);
            st.add(s);
        }
    }

    public class VehListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            String string1 = text1.getText();
            String string2 = text2.getText();
            String string3 = text3.getText();
        /*    if (string1.equals("BUS")) {
                type = Types.TRAM;
            }
            if (string1.equals("TRAM")) {
                type = Types.TRAM;
            }
            if (string1.equals("SUBWAY")) {
                type = Types.SUBWAY;
            }
            if (string1.equals("TROLLEY_BUS")) {
                type = Types.TROLLEY_BUS;
            }*/
            model.Vehicle v = new model.Vehicle(Types.valueOf(string1), Integer.valueOf(string2),
                    Integer.valueOf(string3));
            veh.add(v);
        }
    }

    public class StopListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            String string1 = text1.getText();
            String string2 = text2.getText();
            rt.get(Integer.valueOf(string1)).add_stop(st.get(string2));
        }
    }

}
