/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mall_supervision_system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author VAISHNAVI FARKANDE
 */
public class tickets5 extends JFrame implements ActionListener{
    
    JLabel l1;
    JButton bt1,bt2;
    JTextField t1,t2,t3;
    tickets5()
    {
        setBounds(0,0,1600,850);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("mall_supervision_system/icon/omg.jpg"));
        Image i3 = i1.getImage().getScaledInstance(1600, 900, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        
        
        JLabel image = new JLabel(i2);
        image.setBounds(0,0,1330,800);
        add(image);
        
         JLabel title = new JLabel("THREATER BOOKING");
         title.setFont(new Font("Times new roman",Font.BOLD,60));
        title.setBounds(330,40,800,80);
        title.setForeground(Color.white);
       
        image.add(title);
       
        JPanel p1=new JPanel();
        p1.setBounds(450,170,400,450);
        p1.setBackground(Color.ORANGE);
        p1.setLayout(null);
        image.add(p1);
        
        
        
        JLabel username = new JLabel("Full Name:");
        username.setBounds(50,30,90,40);
        username.setForeground(Color.BLUE);
        username.setFont(new Font("Times New Roman", Font.BOLD,16));
        p1.add(username);
        
        t1=new JTextField("");
        t1.setBounds(140,40,200,35);
        Border b1;
        p1.add(t1);
        
         JLabel password = new JLabel("Total Seats:");
        password.setBounds(50,100,90,40);
        password.setFont(new Font("Times New Roman", Font.BOLD,16));
        password.setForeground(Color.BLUE);
        p1.add(password);
        
        
        t2=new JTextField("");
        t2.setBounds(140,100,200,35);
        Border b2;
        p1.add(t2);
        
        
        JLabel l3 = new JLabel("Price:");
        l3.setBounds(50,150,90,40);
        l3.setFont(new Font("Times New Roman", Font.BOLD,16));
        l3.setForeground(Color.BLUE);
        p1.add(l3);
        
        t3=new JTextField("");
        t3.setBounds(140,155,200,35);
        Border b3;
        p1.add(t3);
        
        
        bt1 = new JButton ("Login");
        bt1.setBounds(90,300,90,35);
        bt1.setForeground(Color.black);
        bt1.setBackground(Color.yellow);
        bt1.setFont(new Font("Times New Roman", Font.BOLD,15));
        bt1.addActionListener(this);
        p1.add(bt1);
        
         bt2 = new JButton ("Cancel");
        bt2.setBounds(220,300,90,35);
        bt2.setForeground(Color.black);
        bt2.setBackground(Color.red);
        bt2.setFont(new Font("Times New Roman", Font.BOLD,15));
        bt2.addActionListener(this);
        p1.add(bt2);

    
        
        setLayout(null);
        setVisible(true);


    }
    
    public void actoinPerformed(ActionEvent e)
    {
        
    }
    
    public static void main(String[] args) {
        new tickets5();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
