import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BorderLayout Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // JFrame uses BorderLayout by default for its content pane, 
        // so explicitly setting it is optional but good practice.
        // frame.setLayout(new BorderLayout()); 
        
        frame.add(new JButton("North Button"), BorderLayout.NORTH);
        frame.add(new JButton("South Button"), BorderLayout.SOUTH);
        frame.add(new JButton("East Button"), BorderLayout.EAST);
        frame.add(new JButton("West Button"), BorderLayout.WEST);
        frame.add(new JButton("Center Button"), BorderLayout.CENTER);

        frame.pack(); // Sizes the frame so that all its contents are at or above their preferred sizes
        frame.setVisible(true);
    }
}


