
package mall_supervision_system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.ResultSet;

/**
 *
 * @author VAISHNAVI FARKANDE
 */
public class Login extends JFrame implements ActionListener{
    JButton b1,b2;
    JTextField t1,t2;
    Login()
    {
    
        
        JPanel p1 = new JPanel();
        p1.setBounds(300,0,300,300);
        p1.setBackground(Color.white);
        add(p1);
        
       
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("mall_supervision_system/icon/admin.png"));
        Image i2= i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        
        JLabel l1 =new JLabel(i3);
        l1.setBounds(0, 0, 250, 250);
        p1.add(l1);
        
        JLabel title = new JLabel("ADMIN LOGIN");
        title.setBounds(60,20,200,50);
        title.setForeground(Color.white);
        setBackground(Color.orange);
        title.setFont(new Font("Times New Roman" ,Font.BOLD, 25));
        add(title);
       
        JLabel username = new JLabel ("Username");
        username.setBounds(20,20,100,150);
        username.setForeground(Color.white);
        username.setFont(new Font("Times New Roman", Font.BOLD,15));
        add(username);
        
        JLabel password = new JLabel ("Password");
        password.setBounds(20,20,150,250);
        password.setForeground(Color.white);
        password.setFont(new Font("Times New Roman", Font.BOLD,15));
        add(password);
        
        t1 = new JTextField ("");
        t1.setBounds(130,80,150,30);
        t1.setForeground(Color.BLACK);
        t1.setFont(new Font("Times New Roman", Font.PLAIN,15));
        add(t1);
        
         t2 = new JTextField ("");
        t2.setBounds(130,130,150,30);
        t2.setForeground(Color.BLACK);
        t2.setFont(new Font("Times New Roman", Font.PLAIN,15));
        add(t2);
        
         b1 = new JButton ("Login");
        b1.setBounds(40,190,100,30);
        b1.setForeground(Color.black);
        b1.setBackground(Color.cyan);
        b1.setFont(new Font("Times New Roman", Font.BOLD,15));
        b1.addActionListener(this);
        add(b1);
        
         b2 = new JButton ("Cancel");
        b2.setBounds(150,190,100,30);
        b2.setForeground(Color.black);
        b2.setBackground(Color.red);
        b2.setFont(new Font("Times New Roman", Font.BOLD,15));
        b2.addActionListener(this);
        add(b2);
        
        
        setBounds(400, 200, 600, 300);
        getContentPane().setBackground(Color.black);
        setLayout(null);
        setVisible(true);
     
    }
    
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b1)
        {
            try
            {
                String username = t1.getText();
                String password= t2.getText();
                conn c1 =  new conn();
                
                String query = "select *from admin where username='"+username+"' and password='"+password+"'";
                ResultSet rt=c1.s.executeQuery(query);
                if(rt.next())
                {
                    JOptionPane.showMessageDialog(null,"Login Successfully!!");
                    this.setVisible(false);
                    new DashBoard();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Invalid username or password");
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
            else if (ae.getSource()==b2)
                    {
                    this.setVisible(false);
         
        }
    }
    
    public static void main(String[] args) {
        new Login();
    }
    
}
