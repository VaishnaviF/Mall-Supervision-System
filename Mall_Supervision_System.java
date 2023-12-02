package mall_supervision_system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author VAISHNAVI FARKANDE
 */
public class Mall_Supervision_System extends JFrame implements ActionListener {

    JButton next, cancel;

    public Mall_Supervision_System() {

        setBounds(0, 0, 1900, 1200);
        //setUndecorated(true);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("mall_supervision_system/icon/home1.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1400, 950, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l1 = new JLabel(i3);
        l1.setBounds(0, 0, 1400, 950);
        add(l1);

        JLabel title = new JLabel("MALL SUPERVISION SYSTEM");
        title.setBounds(390, 50, 1000, 70);
        title.setBackground(Color.YELLOW);
        title.setFont(new Font("Times new roman", Font.BOLD, 40));
        title.setForeground(Color.cyan);

        l1.add(title);

        next = new JButton("NEXT");
        next.setBounds(1050, 550, 90, 50);
        next.setBackground(Color.YELLOW);
        next.setForeground(Color.black);
        next.addActionListener(this);
        l1.add(next);

        cancel = new JButton("CANCEL");
        cancel.setBounds(1150, 550, 90, 50);
        cancel.setBackground(Color.YELLOW);
        cancel.setForeground(Color.black);
        cancel.addActionListener(this);
        l1.add(cancel);

       
        setVisible(true);
         setLayout(null);
        

        int i;
        int x = 1;
        for (i = 2; i <= 1050; i += 10, x += 7) {
            setLocation(870 - ((i + x) / 2), 500 - (i / 2));
            setSize(i + x, i);
            try {
                Thread.sleep(10);

            } catch (Exception e) {

            }
            
        }

    }

    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == next) {
            new Login();
            // this.setVisible(false);

        } else if (ae.getSource() == cancel) {
            this.setVisible(false);
        }
    }

    public static void main(String[] args) {

        new Mall_Supervision_System();

    }

}
