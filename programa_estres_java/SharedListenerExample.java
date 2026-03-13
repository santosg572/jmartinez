import javax.swing.*;
import java.awt.event.*;

public class SharedListenerExample implements ActionListener {
    JButton buttonYes, buttonNo;

    public SharedListenerExample() {
        JFrame frame = new JFrame("Shared Listener");
        buttonYes = new JButton("Yes");
        buttonNo = new JButton("No");

        buttonYes.addActionListener(this); // 'this' refers to the SharedListenerExample instance
        buttonNo.addActionListener(this);

        frame.add(buttonYes);
        frame.add(buttonNo);
//        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonYes) {
            System.out.println("Yes button pressed!");
        } else if (e.getSource() == buttonNo) {
            System.out.println("No button pressed!");
        }
    }

    public static void main(String[] args) {
        new SharedListenerExample();
    }
}


