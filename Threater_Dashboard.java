/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mall_supervision_system;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 *
 * @author VAISHNAVI FARKANDE
 */
public class Threater_Dashboard extends JFrame implements ActionListener{
    JButton b1,b2,b3,b4,b5,b6,b7;
   public Threater_Dashboard()
    {
        JLabel l1 = new JLabel("SELECT YOUR CHOICE");
        l1.setBounds(40,40,400,60);
        l1.setFont(new Font("Times New Roman", Font.BOLD, 25));
        l1.setForeground(Color.BLACK);
        add(l1);
        
        b4 = new JButton ("BOOK NEW TICKETS");
        b4.setBounds(80,140,200,40);
        b4.setBackground(Color.LIGHT_GRAY);
        b4.setForeground(Color.BLACK);
        b4.addActionListener(this);
        add(b4);
        
        b5 = new JButton ("MY TICKETS");
        b5.setBounds(80,200,200,40);
        b5.setBackground(Color.LIGHT_GRAY);
        b5.setForeground(Color.BLACK);
        b5.addActionListener(this);
        add(b5);
        
        b6 = new JButton ("CANCEL TICKET");
        b6.setBounds(80,260,200,40);
        b6.setBackground(Color.LIGHT_GRAY);
        b6.setForeground(Color.BLACK);
        b6.addActionListener(this);
        add(b6);
   
        getContentPane().setBackground(Color.ORANGE);
        setBounds(300,95,400,550);
        
        setLayout(null);
        setVisible(true);
        
        
    }
    
   public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource()==b4)
        {
            new Book_Ticket();
        }
        else if(ae.getSource()==b5)
        {

        }
        else if(ae.getSource()==b6)
        {
           this.setVisible(false);
        }
       
        
    
    }
    public static void main(String[] args) {
        new Threater_Dashboard();
    }
}
