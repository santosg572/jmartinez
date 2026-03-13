import javax.swing.*;
import java.awt.*;

public class SwingColorExample {

   public static void main(String[] args) {

       JFrame frame = new JFrame("Swing Background Color Example");
       frame.setSize(400, 300);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       JPanel panel = new JPanel();
       panel.setBackground(Color.LIGHT_GRAY);

       JLabel label = new JLabel("Welcome to Java Swing");
       label.setOpaque(true);
       label.setBackground(Color.YELLOW);
       label.setForeground(Color.BLACK);

       panel.add(label);
       frame.add(panel);

       frame.setVisible(true);
   }
}


