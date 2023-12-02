
package mall_supervision_system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.border.Border;
/**
 *
 * @author VAISHNAVI FARKANDE
 */
public class tickets extends JFrame implements ActionListener{
    
    JLabel l1;
    JButton bt1,bt2;
    JTextField t1,t2,t3;
    tickets()
    {
        setBounds(0,0,1600,850);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("mall_supervision_system/icon/Gadar.jpeg"));
        Image i3 = i1.getImage().getScaledInstance(1600, 900, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        
        
        JLabel image = new JLabel(i2);
        image.setBounds(0,0,1330,800);
        add(image);
        
         JLabel title = new JLabel("THREATER BOOKING");
         title.setFont(new Font("Times new roman",Font.BOLD,60));
        title.setBounds(320,40,800,80);
        
        title.setForeground(Color.blue);
       
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
    
    public void actoinPerformed(ActionEvent ae)
    {
         /*String username = t1.getText();
         String password = t2.getText();
         String l3 = t2.getText();
         if(ae.getSource()==bt1)
         {
             try
             {
                 conn c1 = new conn();
                 String sql = "Select *from admin where username ='"+username+"' and password='"+password+"'";
                 ResultSet rt=c1.s.executeQuery(sql);
                 if(rt.next()){
                     JOptionPane.showMessageDialog(null,"Login Successfully!!");
                     new stock_mgt();
                 }
                 else
                 {
                  JOptionPane.showMessageDialog(null,"Invalid Username or Password!!");   
                 }
        }
             catch(Exception e)
             {
                 e.printStackTrace();
             }
         }
         else if (ae.getSource()==bt2)
         {
             this.setVisible(false);
             new DashBoard();
         }*/
}    
    
    
    public static void main(String[] args) {
        new tickets();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
