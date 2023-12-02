
package mall_supervision_system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

/**
 *
 * @author VAISHNAVI FARKANDE
 */
public class del_emp extends JFrame implements ActionListener{
    JTextField t1,t2,t3,t4;
    JButton b1,b2;
    del_emp()
    {
     JLabel l1= new JLabel("Delete Employee");
     l1.setBounds(80,0,300,60);
     l1.setFont(new Font("Times New Roman", Font.BOLD,25));
     l1.setForeground(Color.orange);
     
     add(l1);
     
     JLabel l2= new JLabel("Emp Code");
     l2.setBounds(30,60,100,60);
     l2.setFont(new Font("Times New Roman", Font.BOLD,15));
     l2.setForeground(Color.pink);
     
     add(l2);
     
     JLabel l3= new JLabel("Name");
     l3.setBounds(30,110,100,60);
     l3.setFont(new Font("Times New Roman", Font.BOLD,15));
     l3.setForeground(Color.pink);
     
     add(l3);
     
     JLabel l4= new JLabel("Department");
     l4.setBounds(30,160,100,60);
     l4.setFont(new Font("Times New Roman", Font.BOLD,15));
     l4.setForeground(Color.pink);
     
     add(l4);
     
     JLabel l5= new JLabel("Salary");
     l5.setBounds(30,210,100,60);
     l5.setFont(new Font("Times New Roman", Font.BOLD,15));
     l5.setForeground(Color.pink);
     
     add(l5);
     
     t1 = new JTextField ("");
     t1.setBounds(140,80,100,30);
     try
     {
         conn c = new conn();
         ResultSet rs = c.s.executeQuery("select *from employee");
         while(rs.next())
         {
             t1.setText(rs.getString("code"));
         }
     }
         catch(Exception e)
                 {
                 e.printStackTrace();
                 }
     
     add(t1);
     
      t2 = new JTextField ("");
     t2.setBounds(140,130,200,30);
     add(t2);
     
      t3 = new JTextField ("");
     t3.setBounds(140,180,200,30);
     add(t3);
     
     t4 = new JTextField ("");
     t4.setBounds(140,230,200,30);
     add(t4);
     
     getContentPane().setBackground(Color.DARK_GRAY);
     
     
     b1= new JButton ("DELETE");
        b1.setBounds(170,290,100,40);
        b1.setBackground(Color.yellow);
        b1.setForeground(Color.BLACK);
        b1.addActionListener(this);
        add(b1);
        
                b2= new JButton ("FIND");
        b2.setBounds(250,80,90,30);
        b2.setBackground(Color.yellow);
        b2.setForeground(Color.BLACK);
        b2.addActionListener(this);
        add(b2);
     
     setBounds(400,200,400,400);
    
     setLayout(null);
     setVisible(true);
    }
     public void actionPerformed(ActionEvent ae)
    {
     if (ae.getSource()==b1)
        {
         try
         {
             String code= t1.getText();
             String name= t2.getText();
             String dept= t3.getText();
             String salary= t4.getText();
             conn c1= new conn();
             String sql="delete from employee where code='"+t1.getText()+"'";
             c1.s.executeUpdate(sql);
             JOptionPane.showMessageDialog(null,"Record Deleted Successfully!!");
         }
         catch(Exception e)
         {
             e.printStackTrace();
         }
              
        }
        else if (ae.getSource()==b2)
                {
                try {
                String code= t1.getText();
             String name= t2.getText();
             String dept= t3.getText();
             String salary= t4.getText();
             conn c1= new conn();
             String sql="select name,department,salary from employee where code='"+t1.getText()+"'";
             
                ResultSet rt = c1.s.executeQuery(sql);
                if(rt.next())
                {
                t2.setText(rt.getString("name"));
                t3.setText(rt.getString("department"));
                t4.setText(rt.getString("salary"));
                }
                else
                {
                
                }
                }
                catch(Exception e)
                {
                e.printStackTrace();
                }
                }
    }
    
    public static void main(String[] args) {
        new del_emp();
    }
    
}
