import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MultipleButtons implements ActionListener {
    private JButton buttonOne, buttonTwo, buttonThree;
    private JLabel label;

    public MultipleButtons() {
        JFrame frame = new JFrame("Multiple Buttons Example");
        frame.setLayout(new FlowLayout());

        buttonOne = new JButton("One");
        buttonTwo = new JButton("Two");
        buttonThree = new JButton("Three");
        label = new JLabel("Click a button");

        // Register the current class as the action listener for all buttons
        buttonOne.addActionListener(this);
        buttonTwo.addActionListener(this);
        buttonThree.addActionListener(this);

        frame.add(buttonOne);
        frame.add(buttonTwo);
        frame.add(buttonThree);
        frame.add(label);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonOne) {
//            label.setText("Button One clicked!");
            System.out.printf("Boton1");
        } else if (e.getSource() == buttonTwo) {
            label.setText("Button Two clicked!");
        } else if (e.getSource() == buttonThree) {
            label.setText("Button Three clicked!");
        }
    }

    public static void main(String[] args) {
        new MultipleButtons();
    }
}

