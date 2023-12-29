package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class dashboard extends JFrame implements ActionListener {

    dashboard()
    {
        setBounds(0,0,1366,786);

        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/bg2.png"));
        Image i2 = i1.getImage().getScaledInstance(1366,786,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,1366,786);
        add(image);

        JLabel text = new JLabel("THE ELEPHANT ROUTE WELCOMES YOU ");
        text.setBounds(300,50,1000,50);
        text.setFont(new Font("Bradley Hand ITC",Font.BOLD, 45));
        text.setForeground(Color.WHITE);
        image.add(text);

        JMenuBar mb = new JMenuBar();
        mb.setBounds(0,0,1366,35);
        image.add(mb);

        JMenu hotel = new JMenu("HOTEL CHECK-IN");
        hotel.setForeground(Color.RED);
        mb.add(hotel);

        JMenuItem reception = new JMenuItem("RECEPTION");
        reception.addActionListener(this);
        hotel.add(reception);

        JMenu admin = new JMenu("ADMIN");
        admin.setForeground(Color.BLUE);
        mb.add(admin);

        JMenuItem addemployee = new JMenuItem("ADD EMPLOYEE");
        addemployee.addActionListener(this);
        admin.add(addemployee);

        JMenuItem addrooms = new JMenuItem("ADD ROOMS");
        addrooms.addActionListener(this);
        admin.add(addrooms);

        JMenuItem adddriver = new JMenuItem("ADD DRIVER");
        adddriver.addActionListener(this);
        admin.add(adddriver);


        setVisible(true);
    }

    public void actionPerformed (ActionEvent ae)
    {
        if (ae.getActionCommand().equals("ADD EMPLOYEE"))
        {
            new AddEmployee();
        } else if (ae.getActionCommand().equals("ADD ROOMS"))
        {
            new AddRooms();
        } else if (ae.getActionCommand().equals("ADD DRIVER"))
        {
            new AddDriver();
        } else if (ae.getActionCommand().equals("RECEPTION"))
        {
            new Reception();
        }
    }

    public static void main(String[] args)
    {
       new dashboard();
    }
}
