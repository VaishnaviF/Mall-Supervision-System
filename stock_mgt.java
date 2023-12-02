
package mall_supervision_system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author VAISHNAVI FARKANDE
 */
public class stock_mgt extends JFrame implements ActionListener {
    JTextField t1,t2,t3,t4,t5;
    JButton bt1,bt2,bt3,bt4,bt5,bt6;
    Choice c1;
    JTable table;
    stock_mgt()
    {
       
    
        JPanel p1 = new JPanel();
        p1.setBounds(0,0,1275,100);
        p1.setBackground(Color.YELLOW);
        Border b =  new LineBorder(Color.BLACK,4,true);
        p1.setBorder(b);
        p1.setLayout(null);
        add(p1);
        
        JLabel l1 = new JLabel("STOCK LOGIN");
        l1.setBounds(500,20,1000,60);
        l1.setFont(new Font("Times New Roman", Font.BOLD,40));
        l1.setForeground(Color.red);
        p1.add(l1);
        
         JPanel p2 = new JPanel();
        p2.setBounds(5,105,570,530);
        p2.setBackground(Color.cyan);
        Border b1 =  new LineBorder(Color.BLACK,4,true);
        p2.setBorder(b);
        p2.setLayout(null);
        add(p2);
        
         JPanel p3 = new JPanel();
        p3.setBounds(585,105,686,530);
        p3.setBackground(Color.cyan);
        p3.setBackground(Color.cyan);
        Border b2 =  new LineBorder(Color.BLACK,4,true);
        p3.setBorder(b);
        p3.setLayout(null);
        add(p3);
        
        
        JLabel l2 = new JLabel("MANAGE STOCK");
        l2.setBounds(135,50,600,30);
        l2.setFont(new Font("Times New Roman", Font.BOLD,26));
        l2.setForeground(Color.BLUE);
        p2.add(l2);
        
        
        
        JLabel l3 = new JLabel("ITEM ID");
        l3.setBounds(50,140,600,30);
        l3.setFont(new Font("Times New Roman", Font.BOLD,20));
        l3.setForeground(Color.black);
        p2.add(l3);
        
        JLabel l4 = new JLabel("ITEM NAME");
        l4.setBounds(50,200,600,30);
        l4.setFont(new Font("Times New Roman", Font.BOLD,20));
        l4.setForeground(Color.black);
        p2.add(l4);
        
        JLabel l5 = new JLabel("ITEM PRICE");
        l5.setBounds(50,260,600,30);
        l5.setFont(new Font("Times New Roman", Font.BOLD,20));
        l5.setForeground(Color.black);
        p2.add(l5);
        
        
        JLabel l6 = new JLabel("ITEM QTY");
        l6.setBounds(50,320,600,30);
        l6.setFont(new Font("Times New Roman", Font.BOLD,20));
        l6.setForeground(Color.black);
        p2.add(l6);
        
   
        
        JLabel l8 = new JLabel("ID");
        l8.setBounds(20,70,200,30);
        l8.setFont(new Font("Times New Roman", Font.PLAIN,15));
        l8.setForeground(Color.black);
        p3.add(l8);
        
        JLabel l9= new JLabel("NAME");
        l9.setBounds(200,70,200,30);
        l9.setFont(new Font("Times New Roman", Font.PLAIN,15));
        l9.setForeground(Color.black);
        p3.add(l9);
        
        JLabel l10 = new JLabel("PRICE");
        l10.setBounds(400,70,200,30);
        l10.setFont(new Font("Times New Roman", Font.PLAIN,15));
        l10.setForeground(Color.black);
        p3.add(l10);
        
        
        JLabel l11 = new JLabel("QTY");
        l11.setBounds(580,70,200,30);
        l11.setFont(new Font("Times New Roman", Font.PLAIN,15));
        l11.setForeground(Color.black);
        p3.add(l11);
        
        
        t1 = new JTextField("");
        t1.setBounds(200,140,200,40);
        p2.add(t1);
        
        t2 = new JTextField("");
        t2.setBounds(200,200,200,40);
        p2.add(t2);
        
        
        t3 = new JTextField("");
        t3.setBounds(200,260,200,40);
        p2.add(t3);
        
        
        t4 = new JTextField("");
        t4.setBounds(200,320,200,40);
        p2.add(t4);
        
        
        bt1 = new JButton("ADD");
        bt1.setBounds(50,400,90,40);
        bt1.addActionListener(this);
        
        bt1.setForeground(Color.BLACK);
        bt1.setBackground(Color.YELLOW);
        p2.add(bt1);
        
         bt2 = new JButton("UPDATE");
        bt2.setBounds(150,400,90,40);
        bt2.addActionListener(this);
        bt2.setForeground(Color.BLACK);
        bt2.setBackground(Color.YELLOW);
        p2.add(bt2);
        
         bt3 = new JButton("DELETE");
        bt3.setBounds(250,400,90,40);
        bt3.addActionListener(this);
        bt3.setForeground(Color.BLACK);
        bt3.setBackground(Color.YELLOW);
        p2.add(bt3);
        
         bt4 = new JButton("CLEAR");
        bt4.setBounds(350,400,90,40);
        bt4.addActionListener(this);
        bt4.setForeground(Color.BLACK);
        bt4.setBackground(Color.YELLOW);
        p2.add(bt4);
        
        JLabel  l7= new JLabel("Search By:");
        l7.setBounds(20,20,80,40);
        l7.setFont(new Font("Times New Roman", Font.PLAIN,16));
        p3.add(l7);
        
        c1= new Choice();
        c1.add("id");
        c1.add("name");
        c1.add("price");
        c1.add("qty");
        c1.setBounds(100,30,100,100);
        p3.add(c1);
        
        t5 = new JTextField("");
        t5.setBounds(220,25,150,30);
        p3.add(t5);
        
        bt5 = new JButton("SEARCH");
        bt5.setBounds(390,25,115,30);
        bt5.setFont(new Font("Times new roman",Font.BOLD,20));
        bt5.setForeground(Color.BLACK);
        bt5.addActionListener(this);
        bt5.setBackground(Color.YELLOW);
        p3.add(bt5);
        
        bt6 = new JButton("SHOW ALL");
        bt6.setBounds(520,25,142,30);
        bt6.setFont(new Font("Times new roman",Font.BOLD,20));
        bt6.setForeground(Color.BLACK);
        bt6.addActionListener(this);
        bt6.setBackground(Color.YELLOW);
        p3.add(bt6);
        
        table=new JTable();
        table.setBounds(15,100,650,400);
        p3.add(table);
        
        setBounds(0,0,1500,1000);
        setLayout(null);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        String id = t1.getText();
         String name = t2.getText();
         String price = t3.getText();
         String qty = t4.getText();
         
         
         if(ae.getSource()==bt1)
         {
             try
             {
                 conn c1 = new conn();
                 String sql = "insert into stock value('"+id+"','"+name+"','"+price+"','"+qty+"')";
                 
                 c1.s.executeUpdate(sql);
                 JOptionPane.showMessageDialog(null,"Added Successfully!!");
                 
             }
             catch(Exception e)
             {
                 e.printStackTrace();
             }
         }
         else if(ae.getSource()==bt2)
         {
             try
             {
                 conn c1 = new conn();
                 String sql = "update stock set name='"+name+"',price='"+price+"',qty='"+qty+"' where id='"+id+"'";
                 c1.s.executeUpdate(sql);
                 JOptionPane.showMessageDialog(null,"Updated Successfully!!");
                 
             }
             catch(Exception e)
             {
                 e.printStackTrace();
             }
         }
         
         else if(ae.getSource()==bt3)
         {
             try
             {
                 conn c1 = new conn();
                 String sql = "delete  from stock where id ='"+id+"'";
                 
                 c1.s.executeUpdate(sql);
                 JOptionPane.showMessageDialog(null,"Deleted Successfully!!");
                 
             }
             catch(Exception e)
             {
                 e.printStackTrace();
             }
         }
         
         else if(ae.getSource()==bt4)
         {
             
         t1.setText("");
         t2.setText("");
         t3.setText("");
         t4.setText("");
         t5.setText("");
         }
         
          else if(ae.getSource()==bt5)
         {
             try
             {
                 if(c1.getSelectedItem().contains("id"))
                 {
                     
              
                 conn c1 = new conn();
                 String sql = "select name,price,qty from stock where id='"+t1.getText()+"'";
                 ResultSet rt = c1.s.executeQuery(sql);
                 t1.setText(t5.getText());
                while(rt.next())

                {
                    t2.setText(rt.getString("name"));
                    t3.setText(rt.getString("price"));
                    t4.setText(rt.getString("qty"));
                }
                
             
         }      
         
           else if(c1.getSelectedItem().contains("name"))
           {
           
       
                 conn c1 = new conn();
                 String sql = "select id,price,qty from stock where name='"+t5.getText()+"'";
                 ResultSet rt= c1.s.executeQuery(sql);
                 t2.setText(t5.getText());
                 
                 while(rt.next())

                {
                    t1.setText(rt.getString("id"));
                    t3.setText(rt.getString("price"));
                    t4.setText(rt.getString("qty"));
                }
                
               
                
             }
         
         
         
         else if(c1.getSelectedItem().contains("price"))
           {
           
       
                 conn c1 = new conn();
                 String sql = "select id,name,qty from stock where price='"+t5.getText()+"'";
                 ResultSet rt= c1.s.executeQuery(sql);
                 t3.setText(t5.getText());
                 
                 while(rt.next())

                {
                    t1.setText(rt.getString("id"));
                    t2.setText(rt.getString("name"));
                    t4.setText(rt.getString("qty"));
                }
                
               
                
             }
         
          else if(c1.getSelectedItem().contains("qty"))
           {
           
       
                 conn c1 = new conn();
                 String sql = "select id,name,price from stock where price='"+t5.getText()+"'";
                 ResultSet rt= c1.s.executeQuery(sql);
                 t4.setText(t5.getText());
                 
                 while(rt.next())

                {
                    t1.setText(rt.getString("id"));
                    t2.setText(rt.getString("name"));
                    t4.setText(rt.getString("price"));
                }
               
             }
          }catch(Exception e)
             {
                 e.printStackTrace();
             }
         }
         
         
            
      
           else if(ae.getSource()==bt6)
         {
             try
             {
                 conn c1 = new conn();
                 String sql = "select *from stock";
                 
                 ResultSet rt=c1.s.executeQuery(sql);
                table.setModel(DbUtils.resultSetToTableModel(rt));
                
                 
             }
             catch(Exception e)
             {
                 e.printStackTrace();
             }
         }
         
         
         
             

    }
    
    public static void main(String[] args) {
        new stock_mgt();
    }
}
