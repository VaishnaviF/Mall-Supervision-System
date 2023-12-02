
package mall_supervision_system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.Border;

/**
 *
 * @author VAISHNAVI FARKANDE
 */
public class Restaurant extends JFrame implements ActionListener{
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20;
    JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,t21,t22,t23,t24,t25,t26,t27,t28,t29,t30,t31,t32,t33,t34,t35,t36,t37,t38,t39,t40,t41,t42,t43,t44;
    JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,c21,c22,c23,c24,c25,c26,c27,c28,c29,c30,c31,c32,c33,c34,c35,c36,c37,c38,c39,c40,c41;
    JTextArea ta1;
    Restaurant()
    {
        JPanel p1 = new JPanel();
        p1.setBounds(10,10,1260,70);
        p1.setBackground(Color.magenta);
        add(p1);
        
        
        JLabel l1 = new JLabel("RESTAURANT SECTION");
        l1.setBounds(100,10,500,100);
        l1.setFont(new Font("Times New Roman",Font.BOLD,40));
        l1.setForeground(Color.YELLOW);
        p1.add(l1);
        
        JPanel p2 = new JPanel();
        p2.setBounds(860,85,405,550);
        p2.setBackground(Color.magenta);
        p2.setLayout(null);
        add(p2);
        
        JPanel p3 = new JPanel();
        p3.setBounds(10,85,840,550);
        p3.setBackground(Color.magenta);
        p3.setLayout(null);
        add(p3);
        
        JPanel p4=new JPanel();
        p4.setBounds(5,5,830,470);
        p4.setLayout(null);
        p3.add(p4);   
        
        JPanel p5=new JPanel();
        p5.setBounds(5,5,260,455);
        Border tb=BorderFactory.createTitledBorder("FOOD");
        p5.setBackground(Color.MAGENTA);
        p5.setBorder(tb);
        p5.setLayout(null);
        p4.add(p5); 
        
        JPanel p6=new JPanel();
        p6.setBounds(280,5,260,455);
        Border tb1=BorderFactory.createTitledBorder("CAKE");
        p6.setBackground(Color.MAGENTA);
        p6.setBorder(tb1);
         p6.setLayout(null);
        p4.add(p6);  
        
        JPanel p7=new JPanel();
        p7.setBounds(555,5,265,455);
        Border tb2=BorderFactory.createTitledBorder("DRINK");
        p7.setBackground(Color.MAGENTA);
        p7.setBorder(tb2);
         p7.setLayout(null);
        p4.add(p7);  
        
         ta1= new JTextArea("");
        ta1.setBounds(5,220,395,250);
        p2.add(ta1);
        
        
         t1 = new JTextField("");
        t1.setBounds(5,5,395,45);
        p2.add(t1);
         
        b1 = new JButton("1");
        b1.setBounds(5,50,100,40);
        b1.addActionListener(this);
        p2.add(b1);
        
         b2 = new JButton("2");
        b2.setBounds(101,50,100,40);
        b2.addActionListener(this);
        p2.add(b2);
        
         b3 = new JButton("3");
        b3.setBounds(201,50,100,40);
        b3.addActionListener(this);
        p2.add(b3);
        
         b4 = new JButton("+");
        b4.setBounds(301,50,100,40);
        b4.addActionListener(this);
        p2.add(b4);
        
         b5 = new JButton("4");
        b5.setBounds(5,90,100,40);
        b5.addActionListener(this);
        p2.add(b5);
        
         b6 = new JButton("5");
        b6.setBounds(101,90,100,40);
        b6.addActionListener(this);
        p2.add(b6);
        
         b7 = new JButton("6");
        b7.setBounds(201,90,100,40);
        b7.addActionListener(this);
        p2.add(b7);
        
         b8 = new JButton("-");
        b8.setBounds(301,90,100,40);
        b8.addActionListener(this);
        p2.add(b8);
        
         b9 = new JButton("7");
        b9.setBounds(5,130,100,40);
        b9.addActionListener(this);
        p2.add(b9);
        
         b10 = new JButton("8");
        b10.setBounds(101,130,100,40);
        b10.addActionListener(this);
        p2.add(b10);
        
         b11 = new JButton("9");
        b11.setBounds(201,130,100,40);
        b11.addActionListener(this);
        p2.add(b11);
        
         b12 = new JButton("*");
        b12.setBounds(301,130,100,40);
        b12.addActionListener(this);
        p2.add(b12);
        
         b13= new JButton("0");
        b13.setBounds(5,170,100,40);
        b13.addActionListener(this);
        p2.add(b13);
        
         b14 = new JButton("ANS");
        b14.setBounds(101,170,100,40);
        b14.addActionListener(new ActionListener()
        {
          public void actionPerformed(ActionEvent ae)
          {
              String expression=t1.getText();
              String[] parts=expression.split("\\+");
              String[] parts1=expression.split("\\-");
              String[] parts2=expression.split("\\*");
              String[] parts3=expression.split("\\/");
              
              if(parts.length==2)
              {
                  double op1=Double.parseDouble(parts[0]);
                  double op2=Double.parseDouble(parts[1]);
                  double result=op1+op2;
                  t1.setText(String.valueOf(result));
              }
              
              else if(parts1.length==2)
              {
                  double op1=Double.parseDouble(parts1[0]);
                  double op2=Double.parseDouble(parts1[1]);
                  double result=op1-op2;
                  t1.setText(String.valueOf(result));
              }
              
              else if(parts2.length==2)
              {
                  double op1=Double.parseDouble(parts2[0]);
                  double op2=Double.parseDouble(parts2[1]);
                  double result=op1*op2;
                  t1.setText(String.valueOf(result));
              }
              
            else if(parts3.length==2)
              {
                  double op1=Double.parseDouble(parts3[0]);
                  double op2=Double.parseDouble(parts3[1]);
                  double result=op1/op2;
                  t1.setText(String.valueOf(result));
              }
              
          }
        });
        
        p2.add(b14);
        
         b15 = new JButton("CLR");
        b15.setBounds(201,170,100,40);
        b15.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                t1.setText("");
            }
        });
          
        p2.add(b15);
        
         b16= new JButton("/");
        b16.setBounds(301,170,100,40);
        b16.addActionListener(this);
        p2.add(b16);
        
        
        b17= new JButton("Total");
        b17.setBounds(5,480,100,50);
        b17.addActionListener(this);
        
        p2.add(b17);
        
        b18= new JButton("Reciept");
        b18.setBounds(101,480,100,50);
        b18.addActionListener(new ActionListener()
                {
                    public void actionPerformed(ActionEvent ae)
                    {
                        try {
                            ta1.print();
                            
                        } catch(java.awt.print.PrinterException e)
                                {
                            System.err.println(e);
                        }
                    }
                });
        
        p2.add(b18);
        
        b19= new JButton("Save");
        b19.setBounds(201,480,100,50);
        b19.addActionListener(this);
        p2.add(b19);
        
        b20= new JButton("Reset");
        b20.setBounds(301,480,100,50);
        b20.addActionListener(this);
        p2.add(b20);
         
         
        
     
       
        JLabel l3=new JLabel("Cost of Food");
        l3.setBounds(10,480,200,30);
        l3.setFont(new Font("Tahome",Font.BOLD,15));
        p3.add(l3);
       
        t37=new JTextField("");
        t37.setBounds(150,480,200,20);
        p3.add(t37);
       
        JLabel l4=new JLabel("Cost of cake");
        l4.setBounds(10,500,200,30);
        l4.setFont(new Font("Tahome",Font.BOLD,15));
        p3.add(l4);
       
         t38=new JTextField("");
        t38.setBounds(150,505,200,20);
        p3.add(t38);
       
        JLabel l5=new JLabel("Cost of drink");
        l5.setBounds(10,520,200,30);
        l5.setFont(new Font("Tahome",Font.BOLD,15));
        p3.add(l5);
      
        
          t39=new JTextField("");
        t39.setBounds(150,530,200,20);
        p3.add(t39);
       
        c1=new JCheckBox("Tawa Pulaw");
        c1.setBounds(10,20,120,20);
        c1.setFont(new Font("Tahoma",Font.PLAIN,15));
        c1.setBackground(Color.MAGENTA);
        p5.add(c1);
       
        t2=new JTextField("");
        t2.setBounds(130,20,120,30);
        p5.add(t2);
       
        c2=new JCheckBox("Pav Bhaji");
        c2.setBounds(10,60,120,20);
        c2.setFont(new Font("Tahoma",Font.PLAIN,15));
        c2.setBackground(Color.MAGENTA);
        p5.add(c2);
       
        t3=new JTextField("");
        t3.setBounds(130,60,120,30);
        p5.add(t3);
       
        c3=new JCheckBox("Chole Bhature");
        c3.setBounds(10,100,120,20);
        c3.setFont(new Font("Tahoma",Font.PLAIN,15));
        c3.setBackground(Color.MAGENTA);
        p5.add(c3);
       
        t4=new JTextField("");
        t4.setBounds(130,100,120,30);
        p5.add(t4);
       
        c4=new JCheckBox("Manchurian");
        c4.setBounds(10,140,120,20);
        c4.setFont(new Font("Tahoma",Font.PLAIN,15));
        c4.setBackground(Color.MAGENTA);
        p5.add(c4);
       
        t5=new JTextField("");
        t5.setBounds(130,140,120,30);
        p5.add(t5);
       
        c5=new JCheckBox("Cheese Pizza");
        c5.setBounds(10,180,120,20);
        c5.setFont(new Font("Tahoma",Font.PLAIN,15));
        c5.setBackground(Color.MAGENTA);
        p5.add(c5);
       
        t6=new JTextField("");
        t6.setBounds(130,180,120,30);
        p5.add(t6);
       
        c6=new JCheckBox("Burger");
        c6.setBounds(10,220,120,20);
        c6.setFont(new Font("Tahoma",Font.PLAIN,15));
        c6.setBackground(Color.MAGENTA);
        p5.add(c6);
       
        t7=new JTextField("");
        t7.setBounds(130,220,120,30);
        p5.add(t7);
       
        c7=new JCheckBox("Noodles");
        c7.setBounds(10,260,120,20);
        c7.setFont(new Font("Tahoma",Font.PLAIN,15));
        c7.setBackground(Color.MAGENTA);
        p5.add(c7);
       
        t8=new JTextField("");
        t8.setBounds(130,260,120,30);
        p5.add(t8);
       
        c8=new JCheckBox("Idli");
        c8.setBounds(10,300,120,20);
        c8.setFont(new Font("Tahoma",Font.PLAIN,15));
        c8.setBackground(Color.MAGENTA);
        p5.add(c8);
       
        t9=new JTextField("");
        t9.setBounds(130,300,120,30);
        p5.add(t9);
       
        c9=new JCheckBox("Masala Dosa");
        c9.setBounds(10,340,120,20);
        c9.setFont(new Font("Tahoma",Font.PLAIN,15));
        c9.setBackground(Color.MAGENTA);
        p5.add(c9);
       
        t10=new JTextField("");
        t10.setBounds(130,340,120,30);
        p5.add(t10);
       
        c10=new JCheckBox("Dhapatha");
        c10.setBounds(10,380,120,20);
        c10.setFont(new Font("Tahoma",Font.PLAIN,15));
        c10.setBackground(Color.MAGENTA);
        p5.add(c10);
       
        t11=new JTextField("");
        t11.setBounds(130,380,120,30);
        p5.add(t11);
       
        c11=new JCheckBox("Paratha");
        c11.setBounds(10,420,120,20);
        c11.setFont(new Font("Tahoma",Font.PLAIN,15));
        c11.setBackground(Color.MAGENTA);
        p5.add(c11);
       
        t12=new JTextField("");
        t12.setBounds(130,420,120,30);
        p5.add(t12);
       
        c12=new JCheckBox("Misal Pav");
        c12.setBounds(10,460,120,20);
        c12.setFont(new Font("Tahoma",Font.PLAIN,15));
        c12.setBackground(Color.MAGENTA);
        p5.add(c12);
       
        t13=new JTextField("");
        t13.setBounds(130,460,120,30);
        p5.add(t13);
       
       
       
        //cakes
        c13=new JCheckBox("Black Forest");
        c13.setBounds(10,20,120,20);
        c13.setFont(new Font("Tahoma",Font.PLAIN,15));
        c13.setBackground(Color.MAGENTA);
        p6.add(c13);
       
        t14=new JTextField("");
        t14.setBounds(130,20,120,30);
        p6.add(t14);
       
        c14=new JCheckBox("Red Velvet");
        c14.setBounds(10,60,120,20);
        c14.setFont(new Font("Tahoma",Font.PLAIN,15));
        c14.setBackground(Color.MAGENTA);
        p6.add(c14);
       
        t15=new JTextField("");
        t15.setBounds(130,60,120,30);
        p6.add(t15);
       
        c15=new JCheckBox("Pound");
        c15.setBounds(10,100,120,20);
        c15.setFont(new Font("Tahoma",Font.PLAIN,15));
        c15.setBackground(Color.MAGENTA);
        p6.add(c15);
       
        t16=new JTextField("");
        t16.setBounds(130,100,120,30);
        p6.add(t16);
       
        c16=new JCheckBox("Vanilla");
        c16.setBounds(10,140,120,20);
        c16.setFont(new Font("Tahoma",Font.PLAIN,15));
        c16.setBackground(Color.MAGENTA);
        p6.add(c16);
       
        t17=new JTextField("");
        t17.setBounds(130,140,120,30);
        p6.add(t17);
       
        c17=new JCheckBox("Chocalate");
        c17.setBounds(10,180,120,20);
        c17.setFont(new Font("Tahoma",Font.PLAIN,15));
        c17.setBackground(Color.MAGENTA);
        p6.add(c17);
       
        t18=new JTextField("");
        t18.setBounds(130,180,120,30);
        p6.add(t18);
       
        c18=new JCheckBox("Rainbow");
        c18.setBounds(10,220,120,20);
        c18.setFont(new Font("Tahoma",Font.PLAIN,15));
        c18.setBackground(Color.MAGENTA);
        p6.add(c18);
       
        t19=new JTextField("");
        t19.setBounds(130,220,120,30);
        p6.add(t19);
       
        c19=new JCheckBox("Lemon");
        c19.setBounds(10,260,120,20);
        c19.setFont(new Font("Tahoma",Font.PLAIN,15));
        c19.setBackground(Color.MAGENTA);
        p6.add(c19);
       
        t20=new JTextField("");
        t20.setBounds(130,260,120,30);
        p6.add(t20);
       
        c20=new JCheckBox("Strawberry");
        c20.setBounds(10,300,120,20);
        c20.setFont(new Font("Tahoma",Font.PLAIN,15));
        c20.setBackground(Color.MAGENTA);
        p6.add(c20);
       
        t21=new JTextField("");
        t21.setBounds(130,300,120,30);
        p6.add(t21);
       
        c21=new JCheckBox("Funfetti");
        c21.setBounds(10,340,120,20);
        c21.setFont(new Font("Tahoma",Font.PLAIN,15));
        c21.setBackground(Color.MAGENTA);
        p6.add(c21);
       
        t22=new JTextField("");
        t22.setBounds(130,340,120,30);
        p6.add(t22);
       
        c22=new JCheckBox("Pineapple");
        c22.setBounds(10,380,120,20);
        c22.setFont(new Font("Tahoma",Font.PLAIN,15));
        c22.setBackground(Color.MAGENTA);
        p6.add(c22);
       
        t23=new JTextField("");
        t23.setBounds(130,380,120,30);
        p6.add(t23);
       
        c23=new JCheckBox("Paratha");
        c23.setBounds(10,420,120,20);
        c23.setFont(new Font("Tahoma",Font.PLAIN,15));
        c23.setBackground(Color.MAGENTA);
        p6.add(c23);
       
        t24=new JTextField("");
        t24.setBounds(130,420,120,30);
        p6.add(t24);
       
        c24=new JCheckBox("Misal Pav");
        c24.setBounds(10,460,120,20);
        c24.setFont(new Font("Tahoma",Font.PLAIN,15));
        c24.setBackground(Color.MAGENTA);
        p6.add(c24);
       
        t25=new JTextField("");
        t25.setBounds(130,460,120,30);
        p6.add(t25);
       
       
        //drinks
       
        c25=new JCheckBox("Cold Coffe");
        c25.setBounds(10,20,120,20);
        c25.setFont(new Font("Tahoma",Font.PLAIN,15));
        c25.setBackground(Color.MAGENTA);
        p7.add(c25);
       
        t26=new JTextField("");
        t26.setBounds(130,20,120,30);
        p7.add(t26);
       
        c26=new JCheckBox("Thick Coffee");
        c26.setBounds(10,60,120,20);
        c26.setFont(new Font("Tahoma",Font.PLAIN,15));
        c26.setBackground(Color.MAGENTA);
        p7.add(c26);
       
        t27=new JTextField("");
        t27.setBounds(130,60,120,30);
        p7.add(t27);
       
        c27=new JCheckBox("Hot Coffee");
        c27.setBounds(10,100,120,20);
        c27.setFont(new Font("Tahoma",Font.PLAIN,15));
        c27.setBackground(Color.MAGENTA);
        p7.add(c27);
       
        t28=new JTextField("");
        t28.setBounds(130,100,120,30);
        p7.add(t28);
       
        c28=new JCheckBox("Tea");
        c28.setBounds(10,140,120,20);
        c28.setFont(new Font("Tahoma",Font.PLAIN,15));
        c28.setBackground(Color.MAGENTA);
        p7.add(c28);
       
        t29=new JTextField("");
        t29.setBounds(130,140,120,30);
        p7.add(t29);
       
        c29=new JCheckBox("Choco shake");
        c29.setBounds(10,180,120,20);
        c29.setFont(new Font("Tahoma",Font.PLAIN,15));
        c29.setBackground(Color.MAGENTA);
        p7.add(c29);
       
        t30=new JTextField("");
        t30.setBounds(130,180,120,30);
        p7.add(t30);
       
        c30=new JCheckBox("Mango Juice");
        c30.setBounds(10,220,120,20);
        c30.setFont(new Font("Tahoma",Font.PLAIN,15));
        c30.setBackground(Color.MAGENTA);
        p7.add(c30);
       
        t31=new JTextField("");
        t31.setBounds(130,220,120,30);
        p7.add(t31);
       
        c31=new JCheckBox("Orange Juice");
        c31.setBounds(10,260,120,20);
        c31.setFont(new Font("Tahoma",Font.PLAIN,15));
        c31.setBackground(Color.MAGENTA);
        p7.add(c31);
       
        t32=new JTextField("");
        t32.setBounds(130,260,120,30);
        p7.add(t32);
       
        c32=new JCheckBox("Amla Juice");
        c32.setBounds(10,300,120,20);
        c32.setFont(new Font("Tahoma",Font.PLAIN,15));
        c32.setBackground(Color.MAGENTA);
        p7.add(c32);
       
        t33=new JTextField("");
        t33.setBounds(130,300,120,30);
        p7.add(t33);
       
        c33=new JCheckBox("Chochlate Milk");
        c33.setBounds(10,340,120,20);
        c33.setFont(new Font("Tahoma",Font.PLAIN,15));
        c33.setBackground(Color.MAGENTA);
        p7.add(c33);
       
        t34=new JTextField("");
        t34.setBounds(130,340,120,30);
        p7.add(t34);
       
        c34=new JCheckBox("Pineapple Juice");
        c34.setBounds(10,380,120,20);
        c34.setFont(new Font("Tahoma",Font.PLAIN,15));
        c34.setBackground(Color.MAGENTA);
        p7.add(c34);
       
        t35=new JTextField("");
        t35.setBounds(130,380,120,30);
        p7.add(t35);
       
        c35=new JCheckBox("Apple Juice");
        c35.setBounds(10,420,120,20);
        c35.setFont(new Font("Tahoma",Font.PLAIN,15));
        c35.setBackground(Color.MAGENTA);
        p7.add(c35);
       
        t36=new JTextField("");
        t36.setBounds(130,420,120,30);
        p7.add(t36);
       
        c37=new JCheckBox("Chikoo Juice");
        c37.setBounds(10,460,120,20);
        c37.setFont(new Font("Tahoma",Font.PLAIN,15));
        c37.setBackground(Color.MAGENTA);
        p7.add(c37);
       
        t25=new JTextField("");
        t25.setBounds(130,460,120,30);
        p7.add(t25);
      
        setBounds(0,0,1700,1000);
        setLayout(null);
        setVisible(true);
    }
     public void actionPerformed(ActionEvent ae)
     {
         String buttonText=((JButton) ae.getSource()).getText();
         t1.setText(t1.getText()+buttonText);
         
     }
     
    public static void main(String[] args) {
        new Restaurant();
    }
   
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
      
    

