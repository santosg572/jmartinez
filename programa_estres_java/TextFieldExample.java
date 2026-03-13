import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldExample implements ActionListener {
    private static JTextField userText;
    private static JLabel statusLabel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Java JTextField Example");
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);
        
        frame.setVisible(true); // Make the frame visible
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null); // Use null layout for manual positioning

        JLabel userLabel = new JLabel("User:");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        userText = new JTextField(20); // Create a text field with 20 columns
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        JButton loginButton = new JButton("Submit");
        loginButton.setBounds(100, 80, 80, 25);
        loginButton.addActionListener(new TextFieldExample()); // Add action listener
        panel.add(loginButton);

        statusLabel = new JLabel("");
        statusLabel.setBounds(10, 50, 250, 25);
        panel.add(statusLabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Get the text from the field when the button is clicked
        String input = userText.getText();
        statusLabel.setText("Input received: " + input); // Set the status label text
    }
}

