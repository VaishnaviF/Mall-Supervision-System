package mall_supervision_system;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;

/**
 *
 * @author VAISHNAVI FARKANDE
 */
public class Threater extends JFrame implements ActionListener {
    JLabel l1,title;
    JButton cancel,bt1,bt2;
    JTextField t1,t2;
 
    Threater()
    {
        
        setBounds(0,0,1900,1200);
        //setUndecorated(true);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("mall_supervision_system/icon/threater1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1400, 950, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0, 0, 1400, 1000);
        add(image);
        
        JLabel title= new JLabel ("THREATER BOOKING");
        title.setBounds(450,10,1000,70);
        title.setBackground(Color.YELLOW);
        title.setFont(new Font("Times new roman",Font.BOLD, 40));
        title.setForeground(Color.cyan);
        add(title);
        
        JPanel p1=new JPanel();
        p1.setBounds(450,170,400,450);
        p1.setBackground(Color.ORANGE);
        p1.setLayout(null);
        image.add(p1);
        
        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("mall_supervision_system/icon/admin.png"));
        Image i12 = i11.getImage().getScaledInstance(130, 130, Image.SCALE_DEFAULT);
        ImageIcon i13 = new ImageIcon(i12);
        
        
        JLabel image1 = new JLabel(i13);
        image1.setBounds(120,0,170,180);
        p1.add(image1);
        
        
        JLabel username = new JLabel("USERNAME");
        username.setBounds(40,190,100,60);
        username.setFont(new Font("Times New Roman", Font.BOLD,16));
        username.setForeground(Color.black);
        p1.add(username);
        
        
        t1=new JTextField("");
        t1.setBounds(170,200,200,35);
        Border b1;
        p1.add(t1);
        
         JLabel password = new JLabel("PASSWORD");
        password.setBounds(40,250,100,60);
        password.setFont(new Font("Times New Roman", Font.BOLD,16));
        password.setForeground(Color.black);
        p1.add(password);
        
        
        t2=new JTextField("");
        t2.setBounds(170,260,200,35);
        Border b2;
        p1.add(t2);
        
        
        
        bt1 = new JButton ("Login");
        bt1.setBounds(150,330,100,35);
        bt1.setForeground(Color.black);
        bt1.setBackground(Color.yellow);
        bt1.setFont(new Font("Times New Roman", Font.BOLD,15));
        bt1.addActionListener(this);
        p1.add(bt1);
        
         bt2 = new JButton ("Cancel");
        bt2.setBounds(270,330,100,35);
        bt2.setForeground(Color.black);
        bt2.setBackground(Color.red);
        bt2.setFont(new Font("Times New Roman", Font.BOLD,15));
        bt2.addActionListener(this);
        p1.add(bt2);

        
        setVisible(true);
        setLayout(null);
        
        
    }
 
    public void actionPerformed(ActionEvent ae)
    {
        
       
         if(ae.getSource()==bt1)
         {
             try
             {
                 String username = t1.getText();
                 String password = t2.getText();
                 conn c1 = new conn();
                 String sql = "Select *from admin where username ='"+username+"' and password='"+password+"'";
                 ResultSet rt=c1.s.executeQuery(sql);
                 if(rt.next()){
                     JOptionPane.showMessageDialog(null,"Login Successfully!!");
                     this.setVisible(false);
                     new Threater_Dashboard();
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

            
         }
}    

   
    public static void main(String[] args) {
       
        new Threater();
        
    }
    
}
