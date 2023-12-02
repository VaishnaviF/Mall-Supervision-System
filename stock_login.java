
package mall_supervision_system;
/**
 *
 * @author VAISHNAVI FARKANDE
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;


public class stock_login extends JFrame implements ActionListener{
    JTextField t1,t2;
    JButton bt1,bt2;
    stock_login()
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
        p2.setBounds(380,200,500,400);
        p2.setBackground(Color.cyan);
        Border b1 =  new LineBorder(Color.BLACK,2,true);
        p2.setBorder(b1);
        p2.setLayout(null);
        add(p2);
        
         JPanel p3 = new JPanel();
        p3.setBounds(200,10,100,100);
        p3.setBackground(Color.cyan);
        Border b2 =  new LineBorder(Color.BLACK,2,true);
        p3.setBorder(b2);
        p3.setLayout(null);
        p2.add(p3);
        
        ImageIcon i1 = new  ImageIcon(ClassLoader.getSystemResource("mall_supervision_system/icon/admin.png"));
        Image i2=i1.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new  ImageIcon(i2);
        
        
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,100,100);
        p3.add(image);
        
        
        JLabel l2 = new JLabel("USERNAME");
        l2.setBounds(50,130,100,60);
        l2.setFont(new Font("Times New Roman", Font.BOLD,16));
        l2.setForeground(Color.black);
        p2.add(l2);
        
        
        t1=new JTextField("");
        t1.setBounds(220,150,250,35);
        t1.setBorder(b1);
        p2.add(t1);
        
         JLabel l3 = new JLabel("PASSWORD");
        l3.setBounds(50,200,100,60);
        l3.setFont(new Font("Times New Roman", Font.BOLD,16));
        l3.setForeground(Color.black);
        p2.add(l3);
        
        
        t2=new JTextField("");
        t2.setBounds(220,210,250,35);
        t2.setBorder(b2);
        p2.add(t2);
        
        
        
        bt1 = new JButton ("Login");
        bt1.setBounds(150,280,100,35);
        bt1.setForeground(Color.black);
        bt1.setBackground(Color.orange);
        bt1.setFont(new Font("Times New Roman", Font.BOLD,15));
        bt1.addActionListener(this);
        p2.add(bt1);
        
         bt2 = new JButton ("Cancel");
        bt2.setBounds(280,280,100,35);
        bt2.setForeground(Color.black);
        bt2.setBackground(Color.red);
        bt2.setFont(new Font("Times New Roman", Font.BOLD,15));
        bt2.addActionListener(this);
        p2.add(bt2);

        getContentPane().setBackground(Color.DARK_GRAY);
        setBounds(0,0,1500,1000);
        setLayout(null);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        String username = t1.getText();
         String password = t2.getText();
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
         }
}    
             
                 
    public static void main(String[] args) {
        new stock_login();
    }
}
