package hotel.management.system;

import javax.swing.*;
import java.awt.*;


public class Reception extends JFrame
{
    Reception()
    {

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JButton newCustomer = new JButton ("Add Guests");
        newCustomer.setBounds(10,30,200,30);
        newCustomer.setBackground(Color.BLACK);
        newCustomer.setForeground(Color.WHITE);
        add(newCustomer);

        JButton rooms = new JButton ("Rooms");
        rooms.setBounds(10,70,200,30);
        rooms.setBackground(Color.BLACK);
        rooms.setForeground(Color.WHITE);
        add(rooms);

        JButton department = new JButton ("Departments");
        department.setBounds(10,110,200,30);
        department.setBackground(Color.BLACK);
        department.setForeground(Color.WHITE);
        add(department);

        JButton allEmployee = new JButton ("All Employees");
        allEmployee.setBounds(10,150,200,30);
        allEmployee.setBackground(Color.BLACK);
        allEmployee.setForeground(Color.WHITE);
        add(allEmployee);

        JButton customers = new JButton ("Customer Info");
        customers.setBounds(10,190,200,30);
        customers.setBackground(Color.BLACK);
        customers.setForeground(Color.WHITE);
        add(customers);

        JButton managerInfo = new JButton ("Manager Info");
        managerInfo.setBounds(10,230,200,30);
        managerInfo.setBackground(Color.BLACK);
        managerInfo.setForeground(Color.WHITE);
        add(managerInfo);

        JButton checkout = new JButton ("Checkout");
        checkout.setBounds(10,270,200,30);
        checkout.setBackground(Color.BLACK);
        checkout.setForeground(Color.WHITE);
        add(checkout);

        JButton update = new JButton ("Pending Status");
        update.setBounds(10,310,200,30);
        update.setBackground(Color.BLACK);
        update.setForeground(Color.WHITE);
        add(update);

        JButton roomStatus = new JButton ("Update Room Status");
        roomStatus.setBounds(10,350,200,30);
        roomStatus.setBackground(Color.BLACK);
        roomStatus.setForeground(Color.WHITE);
        add(roomStatus);

        JButton pickup = new JButton ("Pickup Service");
        pickup.setBounds(10,390,200,30);
        pickup.setBackground(Color.BLACK);
        pickup.setForeground(Color.WHITE);
        add(pickup);

        JButton searchRoom = new JButton ("Search Room");
        searchRoom.setBounds(10,430,200,30);
        searchRoom.setBackground(Color.BLACK);
        searchRoom.setForeground(Color.WHITE);
        add(searchRoom);

        JButton logout = new JButton ("Logout");
        logout.setBounds(10,470,200,30);
        logout.setBackground(Color.BLACK);
        logout.setForeground(Color.WHITE);
        add(logout);

        ImageIcon i1 = new ImageIcon (ClassLoader.getSystemResource("Icons/recepbg.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(250,30,500,470);
        add(image);

        setBounds(350,100,800,570);
        setVisible(true);

    }

    public static void main(String[] args)
    {
        new Reception();
    }

}
