package hotel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
public class login extends JFrame implements ActionListener
{
    JTextField username;
    JPasswordField password;
    JButton login,cancel;
    login()
    {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        JLabel user =new JLabel("Username");
        user.setBounds(40,20,100,30);
        add(user);

        username = new JTextField();       //jo box me enter karta hai uska nam textfield hota hai of username
        username.setBounds(150,20,150,30);
        add(username);

        JLabel pass =new JLabel("Password");
        pass.setBounds(40,70,100,30);
        add(pass);

        password = new JPasswordField();       // textfield  of password
        password.setBounds(150,70,150,30);
        add(password);

        login = new JButton("LogIn");
        login.setBounds(40,150,120,30);
        login.setBackground(Color.gray);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        cancel = new JButton("Cancel");
        cancel.setBounds(180,150,120,30);
        cancel.setBackground(Color.gray);
        cancel.setForeground(Color.WHITE);
        cancel.addActionListener(this);
        add(cancel);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/loginbg.png"));
        Image i2 = i1.getImage().getScaledInstance(500,500,Image.SCALE_DEFAULT);   //to crop the image
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,1003,604);
        add(image);

        setBounds(500,200,500,300);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==login)
        {
           String user = username.getText();
           String pass=password.getText();
           try
           {
               Conn c = new Conn();
               String query = "select * from login where username = '"+user+"' and password = '"+pass+"'";
               ResultSet rs = c.s.executeQuery(query);
               if(rs.next())
               {
                   setVisible(false);
                   new dashboard();
               }
               else
               {
                   JOptionPane.showMessageDialog(null,"Invalid Username or Password");
                   setVisible(false);
               }
           }
           catch(Exception e)
           {
               e.printStackTrace();
           }
        }
        else if(ae.getSource()==cancel)
        {
            setVisible(false);
        }
    }

    public static void main(String[] args)
    {
        new login();
    }

}
