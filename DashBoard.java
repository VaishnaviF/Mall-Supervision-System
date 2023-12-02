/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mall_supervision_system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author VAISHNAVI FARKANDE
 */
public class DashBoard extends JFrame implements ActionListener{
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    DashBoard()
    {

        JPanel p1 = new JPanel();
        p1.setBounds(250,0,1400,1300);
        p1.setBackground(Color.cyan);
        p1.setLayout(null);
        add(p1);
        
         ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("mall_supervision_system/icon/dashboard.jpg"));
         Image i2 = i1.getImage().getScaledInstance(1400, 950, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel l1=new JLabel(i3);
        l1.setBounds(0,0,1400,950);
        p1.add(l1);
        
        b1=new JButton("Employee Section");
        b1.setBounds(0,50,250,60);
        b1.setBackground(Color.MAGENTA);
        b1.addActionListener(this);
        add(b1);
        
        /*b2=new JButton("Grocery Billing");
        b2.setBounds(0,65,250,60);
        b2.setBackground(Color.MAGENTA);
        b2.addActionListener(this);
        add(b2);*/
        
        b3=new JButton("Customer Section");
        b3.setBounds(0,130,250,60);
        b3.setBackground(Color.MAGENTA);
        b3.addActionListener(this);
        add(b3);
        
        b4=new JButton("Threater Booking");
        b4.setBounds(0,195,250,60);
        b4.setBackground(Color.MAGENTA);
        b4.addActionListener(this);
        add(b4);
        
        b5=new JButton("Restaurant");
        b5.setBounds(0,260,250,60);
        b5.setBackground(Color.MAGENTA);
        b5.addActionListener(this);
        add(b5);
        
        b6=new JButton("Gaming Section");
        b6.setBounds(0,325,250,60);
        b6.setBackground(Color.MAGENTA);
        b6.addActionListener(this);
        add(b6);
        
        b7=new JButton("Stock Management");
        b7.setBounds(0,420,250,60);
        b7.setBackground(Color.MAGENTA);
        b7.addActionListener(this);
        add(b7);
        
       /* b8=new JButton("UPI Payment");
        b8.setBounds(0,455,250,60);
        b8.setBackground(Color.MAGENTA);
        b8.addActionListener(this);
        add(b8);*/
        
        b9=new JButton("Log Out");
        b9.setBounds(0,520,250,60);
        b9.setBackground(Color.MAGENTA);
        b9.addActionListener(this);
        add(b9);
        
        b10=new JButton("Exit");
        b10.setBounds(0,585,250,60);
        b10.setBackground(Color.MAGENTA);
        b10.addActionListener(this);
        add(b10);
        
        
        setBounds(0,0,1300,1000);
        setLayout(null);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
            new emp_main();
        }
        else if(ae.getSource()==b2)
        {
          
           
        }
        else if(ae.getSource()==b3)
        {
            new cust_main();
           
        }
        else if(ae.getSource()==b4)
        {
            new Threater();
           
        }
        else if(ae.getSource()==b5)
        {
            new Restaurant();
            
        }
        else if(ae.getSource()==b6)
        {
            new gaming();
            
        }
        else if(ae.getSource()==b7)
        {
            new stock_login();
            
        }
        else if(ae.getSource()==b8)
        {
          
            
        }
        else if(ae.getSource()==b9)
        {
            new Login();
            this.setVisible(false);
        }
        else if(ae.getSource()==b10){
            this.setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new DashBoard();
    }
    
}
