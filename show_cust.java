package mall_supervision_system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author VAISHNAVI FARKANDE
 */
public class show_cust extends JFrame implements ActionListener{
    JButton b1,b2;
    JTable table;
    show_cust()
    {
        
        
               
        table = new JTable();
        table.setBounds(0,40,500,350);
        table.setBackground(Color.pink);
        setLayout(null);
        add(table);
        
        JLabel l1= new JLabel("ID");
        l1.setBounds(30,10,200,15);
        l1.setForeground(Color.magenta);
        add(l1);
        
        JLabel l2= new JLabel("Name");
        l2.setBounds(140,10,200,15);
        l2.setForeground(Color.magenta);
        add(l2);
        
        JLabel l3= new JLabel("Phone No");
        l3.setBounds(250,10,200,15);
        l3.setForeground(Color.magenta);
        add(l3);
        
        JLabel l4= new JLabel("Email");
        l4.setBounds(400,10,200,15);
        l4.setForeground(Color.magenta);
        add(l4);
        
        
        
        b1 = new JButton("Load Data");
        b1.setBounds(180,410,100,30);
        b1.addActionListener(this);
        add(b1);
        
        setBounds(400,150,500,500);
        setLayout(null);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource()==b1)
        {
            try{
            
                conn c1= new conn();
                String query = "Select * from customer";
                ResultSet rt = c1.s.executeQuery(query);
                table.setModel(DbUtils.resultSetToTableModel(rt));
            }
            catch(Exception e)
                    {
                       e.printStackTrace();
                    }
            
        }
    }
    
    public static void main(String[] args) {
        new show_cust();
    }
    
}
