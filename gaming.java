
package mall_supervision_system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
/**
 *
 * @author VAISHNAVI FARKANDE
 */
public class gaming extends JFrame implements ActionListener{
    JButton b1,b2,b3,b4,b5,b6;
    gaming()
    {
        
        JPanel p1 = new JPanel();
        p1.setBounds(0,0,1600,100);
        p1.setBackground(Color.green);
        p1.setLayout(null);
        add(p1);
        
         JLabel l1 = new JLabel("GAMING SECTION");
        l1.setBounds(450,20,1000,60);
        l1.setFont(new Font("Times New Roman", Font.BOLD,40));
        l1.setForeground(Color.red);
        p1.add(l1);
        
        JPanel p2 = new JPanel();
        p2.setBounds(0,0,650,640);
        p2.setBackground(Color.white);
        p2.setLayout(null);
        add(p2);
        
        ImageIcon i1 = new  ImageIcon(ClassLoader.getSystemResource("mall_supervision_system/icon/game1.jpg"));
        Image i2=i1.getImage().getScaledInstance(799, 650,Image.SCALE_DEFAULT);
        ImageIcon i3 = new  ImageIcon(i2);
        
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,799,650);
        p2.add(image);
        
        JPanel p3 = new JPanel();
        p3.setBounds(650,0,650,640);
        p3.setBackground(Color.white);
        p3.setLayout(null);
        add(p3);
        
        ImageIcon i11 = new  ImageIcon(ClassLoader.getSystemResource("mall_supervision_system/icon/gaming2.jpg"));
        Image i12=i11.getImage().getScaledInstance(799, 650,Image.SCALE_DEFAULT);
        ImageIcon i13 = new  ImageIcon(i12);
        
        JLabel image1 = new JLabel(i13);
        image1.setBounds(0,0,799,650);
        p3.add(image1);
        
        JLabel l2 = new JLabel("BOARD GAMES");
        l2.setBounds(200,120,400,60);
        l2.setFont(new Font("Times New Roman", Font.BOLD,30));
        l2.setForeground(Color.white);
        image.add(l2);
        
        JLabel l3 = new JLabel("VIDEO GAMES");
        l3.setBounds(220,120,400,60);
        l3.setFont(new Font("Times New Roman", Font.BOLD,30));
        l3.setForeground(Color.red);
        image1.add(l3);
        
        b1=new JButton("Snake Game");
        b1.setBounds(220,230,200,50);
        b1.addActionListener(this);
        image.add(b1);
        
        b2=new JButton("Tic Tac Toe");
        b2.setBounds(220,310,200,50);
        b2.addActionListener(this);
        image.add(b2);
        
        b3=new JButton("Puzzle");
        b3.setBounds(220,380,200,50);
        b3.addActionListener(this);
        image.add(b3);
        
        
        b4=new JButton("");
        b4.setBounds(230,230,200,50);
        b4.addActionListener(this);
        image1.add(b4);
        
        b5=new JButton("");
        b5.setBounds(230,310,200,50);
        b5.addActionListener(this);
        image1.add(b5);
        
        b6=new JButton("");
        b6.setBounds(230,380,200,50);
        b6.addActionListener(this);
        image1.add(b6);
        
        setBounds(0,0,1500,1000);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            Snake s=new Snake();
            s.setVisible(true);
            
        }
        else if(e.getSource()==b2)
       {
             
             new TicTacToe();
             //this.setVisible(false);
            
        }
        else if(e.getSource()==b3)
       {
            new Puzzle();
          
            
        }
    }
            
    public static void main(String[] args) {
        new gaming();
    }

  
    
}
