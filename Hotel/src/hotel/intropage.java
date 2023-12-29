package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.*;

public class intropage extends JFrame implements ActionListener
{

    intropage()
    {
        setSize(1051,662);
        setLocation(100,100);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/bg1.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,1051,662);
        add(image);

        JLabel text = new JLabel("HOTEL MANAGEMENT SYSTEM");
        text.setBounds(20,10,1000,80);
        text.setForeground(Color.WHITE);
        text.setFont(new Font("Bradley Hand ITC", Font.BOLD,45));
        image.add(text);

        JButton next = new JButton("Next");
        next.setBounds(850,550,120,40);
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.addActionListener(this);
        next.setFont(new Font("Arabic", Font.BOLD,15));
        image.add(next);


        setVisible(true);



    }
    public void actionPerformed(ActionEvent ae)
    {
        setVisible(false);
        new login();
    }

    public static void main(String[] args)
    {

       new intropage();
    }
}
