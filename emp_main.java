
package mall_supervision_system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author VAISHNAVI FARKANDE
 */
public class emp_main extends JFrame implements ActionListener{
    JButton b1,b2,b3,b4,b5,b6,b7;
    emp_main()
    {
        JLabel l1 = new JLabel("EMPLOYEE SECTION");
        l1.setBounds(30,40,400,60);
        l1.setFont(new Font("Times New Roman", Font.BOLD, 30));
        l1.setForeground(Color.BLACK);
        add(l1);
        
        b1 = new JButton ("Show all records");
        b1.setBounds(80,140,200,40);
        b1.setBackground(Color.LIGHT_GRAY);
        b1.setForeground(Color.BLACK);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton ("Add Record");
        b2.setBounds(80,200,200,40);
        b2.setBackground(Color.LIGHT_GRAY);
        b2.setForeground(Color.BLACK);
        b2.addActionListener(this);
        add(b2);
        
         b3 = new JButton ("Search Record");
        b3.setBounds(80,260,200,40);
        b3.setBackground(Color.LIGHT_GRAY);
        b3.setForeground(Color.BLACK);
         b3.addActionListener(this);
        add(b3);
        
         b4 = new JButton ("Update Record");
        b4.setBounds(80,320,200,40);
        b4.setBackground(Color.LIGHT_GRAY);
        b4.setForeground(Color.BLACK);
        b4.addActionListener(this);
        add(b4);
        
         b5 = new JButton ("Delete Record");
        b5.setBounds(80,380,200,40);
        b5.setBackground(Color.LIGHT_GRAY);
        b5.setForeground(Color.BLACK);
         b5.addActionListener(this);
        add(b5);
        
         b6 = new JButton ("Quit");
        b6.setBounds(80,440,200,40);
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
        if (ae.getSource()==b1)
        {
            new show_emp();
        }
        else if(ae.getSource()==b2)
        {
            new add_emp();
        }
        else if(ae.getSource()==b3)
        {
            new search_emp();
        }
        else if(ae.getSource()==b4)
        {
            new update_emp();
        }
        else if(ae.getSource()==b5)
        {
            new del_emp();
        }
        else if(ae.getSource()==b6)
        {
            setVisible(false);
        }
        
    
    }
    public static void main(String[] args) {
        new emp_main();
    }
}
