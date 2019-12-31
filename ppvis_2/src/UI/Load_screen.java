package UI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import data.Types;
import Injector.Injector;

public class Load_screen {
    private Injector injector;

    private JFrame frame;
    private JButton autorization;
    private JButton choose_type;

    private ButtonGroup group;
    private JRadioButton button1;
    private JRadioButton button2;
    private JRadioButton button3;
    private JRadioButton button4;

    private JTextField login;
    private JTextField password;

    public Load_screen(Injector injector) {
        this.injector = injector;
        frame = new JFrame();
        frame.setSize(800, 600);
        frame.getContentPane().setLayout(null);

        group = new ButtonGroup();

        login = new JTextField();
        login.setBounds(50,50,200,50);
        frame.add(login);

        password = new JTextField();
        password.setBounds(50,120,200,50);
        frame.add(password);

        autorization = new JButton();
        autorization.setText("Autorization");
        autorization.setBounds(50,200,200,50);
        autorization.addActionListener(new AutorizationListener());
        frame.add(autorization);

        button1 = new JRadioButton();
        button1.setText("Bus");
        button1.setSelected(true);
        button1.setBounds(300,50,150,50);
        frame.add(button1);

        button2 = new JRadioButton();
        button2.setText("Tram");
        button2.setBounds(300,120,150,50);
        frame.add(button2);

        button3 = new JRadioButton();
        button3.setText("Trolley_bus");
        button3.setBounds(300,190,150,50);
        frame.add(button3);

        button4 = new JRadioButton();
        button4.setText("Subway");
        button4.setBounds(300,260,150,50);
        frame.add(button4);

        group.add(button1);
        group.add(button2);
        group.add(button3);
        group.add(button4);

        choose_type = new JButton();
        choose_type.setText("choose type");
        choose_type.setBounds(500,200,200,50);
        choose_type.addActionListener(new TypeListener());
        frame.add(choose_type);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void autoriazton(String l, String p) {
        injector.autorisation(l, p);
    }

    public void choose_type(Types t) {
        injector.choose_type(t);
    }

    public class AutorizationListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            String lg = login.getText();
            String pass = password.getText();
            autoriazton(lg, pass);
        }
    }

    public class TypeListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            Types type = Types.BUS;
            if (button1.isSelected()){
                type = Types.BUS;
            }
            if (button2.isSelected()){
                type = Types.TRAM;
            }
            if (button3.isSelected()){
                type = Types.TROLLEY_BUS;
            }
            if (button4.isSelected()){
                type = Types.SUBWAY;
            }
            choose_type(type);
        }
    }
}
