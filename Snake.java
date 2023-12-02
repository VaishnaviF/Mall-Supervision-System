
package mall_supervision_system;
import javax.swing.*;

public class Snake extends JFrame {
   
    Snake() {
        super("Snake Game");
        add(new Board());
        pack();
       
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public static void main(String[] args) {
        new Snake().setVisible(true);
    }
}
