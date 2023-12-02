
package mall_supervision_system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
/**
 *
 * @author VAISHNAVI FARKANDE
 */
public class Book_Ticket extends JFrame implements ActionListener{
    JButton b1,b2,b3,b4,b5,b6;
    Book_Ticket()
    {
        JPanel p1=new JPanel();
        p1.setBounds(0,0,420,350);
        p1.setBackground(Color.red);
        p1.setLayout(null);
        add(p1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("mall_supervision_system/icon/Gadar.jpeg"));
        Image i3 = i1.getImage().getScaledInstance(420, 400, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel image = new JLabel(i2);
        image.setBounds(0,0,420,350);
        p1.add(image);
        
        
        b1=new JButton("Book Now");
        b1.setBounds(300,300,100,40);
        b1.setBackground(Color.orange);
        b1.addActionListener(this);
        image.add(b1);
        
       JPanel p2=new JPanel();
        p2.setBounds(420,0,420,350);
        p2.setBackground(Color.red);
        p2.setLayout(null);
        add(p2);
        
        ImageIcon i11 = new ImageIcon(ClassLoader.getSystemResource("mall_supervision_system/icon/sita.jpg"));
        Image i13 = i11.getImage().getScaledInstance(420, 400, Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i13);
        JLabel image1 = new JLabel(i12);
        image1.setBounds(0,0,420,350);
        p2.add(image1);
        
        
        b2=new JButton("Book Now");
        b2.setBounds(300,300,100,40);
        b2.setBackground(Color.orange);
        b2.addActionListener(this);
        image1.add(b2);
       
        
        JPanel p3=new JPanel();
        p3.setBounds(840,0,420,350);
        p3.setBackground(Color.red);
        p3.setLayout(null);
        add(p3);
        
        ImageIcon i21 = new ImageIcon(ClassLoader.getSystemResource("mall_supervision_system/icon/student.jpg"));
        Image i23 = i21.getImage().getScaledInstance(420, 350, Image.SCALE_DEFAULT);
        ImageIcon i22 = new ImageIcon(i23);
        JLabel image2 = new JLabel(i22);
        image2.setBounds(0,0,420,350);
        p3.add(image2);
        
        
        b3=new JButton("Book Now");
        b3.setBounds(300,300,100,40);
        b3.setBackground(Color.orange);
        b3.addActionListener(this);
        image2.add(b3);
        
    
        JPanel p4=new JPanel();
        p4.setBounds(0,350,420,350);
        p4.setBackground(Color.red);
        p4.setLayout(null);
        add(p4);
        
        ImageIcon i31 = new ImageIcon(ClassLoader.getSystemResource("mall_supervision_system/icon/pushpa.jpg"));
        Image i33 = i31.getImage().getScaledInstance(420, 350, Image.SCALE_DEFAULT);
        ImageIcon i32 = new ImageIcon(i33);
        JLabel image3 = new JLabel(i32);
        image3.setBounds(0,0,420,350);
        p4.add(image3);
        
        
        b4=new JButton("Book Now");
        b4.setBounds(300,240,100,40);
        b4.setBackground(Color.orange);
        b4.addActionListener(this);
        image3.add(b4);
        
        JPanel p5=new JPanel();
        p5.setBounds(420,350,420,350);
        p5.setBackground(Color.red);
        p5.setLayout(null);
        add(p5);
        
        ImageIcon i41 = new ImageIcon(ClassLoader.getSystemResource("mall_supervision_system/icon/housefull.jpg"));
        Image i43 = i41.getImage().getScaledInstance(420, 350, Image.SCALE_DEFAULT);
        ImageIcon i42 = new ImageIcon(i43);
        JLabel image4 = new JLabel(i42);
        image4.setBounds(0,0,420,350);
        p5.add(image4);
        
        
        b5=new JButton("Book Now");
        b5.setBounds(300,240,100,40);
        b5.setBackground(Color.orange);
        b5.addActionListener(this);
        image4.add(b5);
                
        JPanel p6=new JPanel();
        p6.setBounds(840,350,420,350);
        p6.setBackground(Color.red);
        p6.setLayout(null);
        add(p6);
        
        ImageIcon i51 = new ImageIcon(ClassLoader.getSystemResource("mall_supervision_system/icon/omg.jpg"));
        Image i53 = i51.getImage().getScaledInstance(420, 350, Image.SCALE_DEFAULT);
        ImageIcon i52 = new ImageIcon(i53);
        JLabel image5 = new JLabel(i52);
        image5.setBounds(0,0,420,350);
        p6.add(image5);
        
        
        b6=new JButton("Book Now");
        b6.setBounds(300,240,100,40);
        b6.setBackground(Color.orange);
        b6.addActionListener(this);
        image5.add(b6);
        
        setBounds(0,0,1600,850);
        setLayout(null);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            this.setVisible(false);
            new tickets();
        }
        else if(e.getSource()==b2)
        {
            this.setVisible(false);
            new tickets1();
        }
        else if(e.getSource()==b3)
        {
            this.setVisible(false);
            new tickets2();
        }
        else if(e.getSource()==b4)
        {
            this.setVisible(false);
            new tickets3();
        }
        else if(e.getSource()==b5)
        {
            this.setVisible(false);
            new tickets4();
        }
        else if(e.getSource()==b6)
        {
            this.setVisible(false);
            new tickets5();
        }
      
    }
    
    public static void main(String[] args) {
        new Book_Ticket();
    }
}
