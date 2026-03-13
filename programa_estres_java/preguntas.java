import java.awt.Font;
import java.awt.Dimension;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class preguntas implements ActionListener {
    static JButton b1;
    public static void main(String[] args) {
        // 1. Crear el marco (Ventana)

        Font myFont = new Font("Arial", Font.BOLD, 20);
//Serif

        JFrame frame = new JFrame("Visualizador de Párrafo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.BLACK);

        Toolkit toolkit = Toolkit.getDefaultToolkit();

        // Get the screen size
        Dimension screenSize = toolkit.getScreenSize();

        frame.setSize(screenSize.width, screenSize.height);
        frame.setLayout(null);

        int i1 = screenSize.width/2;;
        int j1 = screenSize.height/2;

        // 2. El párrafo de texto

        // 3. Crear JTextArea para el texto


        int sx = 1000;
        int sy = 200;
        JPanel panel = new JPanel();
        panel.setBackground(Color.BLACK);
        panel.setLayout(null); 

        // 3. Crear el JLabel

        int x1 = 20;
        int y1 = 100;
        int dx = 90;

        b1 = new JButton("Yes");
        b1.addActionListener(this); 
        b1.setFont(new Font("Serif", Font.BOLD, 18));
        b1.setForeground(Color.WHITE);
        b1.setBounds(x1, y1, dx, 30);         
        panel.add(b1);
        x1 = x1+dx;

        JTextField text_nombre = new JTextField(20); // Create a text field with 20 columns
        text_nombre.setBounds(x1, y1, 165, 30);
        panel.add(text_nombre);

        x1 = x1+165;
        JLabel apePat = new JLabel("Apellido Paterno:");
        apePat.setFont(new Font("Serif", Font.BOLD, 18));
        apePat.setForeground(Color.WHITE);
        apePat.setBounds(x1, y1, 180, 30);
        panel.add(apePat);

        x1 = x1 + 180;
        JTextField text_apePat = new JTextField(20); // Create a text field with 20 columns
        text_apePat.setBounds(x1, y1, 165, 30);
        panel.add(text_apePat);

        x1 = x1+165;
        JLabel apeMat = new JLabel("Apellido Materno:");
        apeMat.setFont(new Font("Serif", Font.BOLD, 18));
        apeMat.setForeground(Color.WHITE);
        apeMat.setBounds(x1, y1, 180, 30);
        panel.add(apeMat);

        x1 = x1 + 180;
        JTextField text_apeMat = new JTextField(20); // Create a text field with 20 columns
        text_apeMat.setBounds(x1, y1, 165, 30);
        panel.add(text_apeMat);

        x1 = 20;
        y1 = 150;

        JLabel edad = new JLabel("Edad (años):");
        edad.setFont(new Font("Serif", Font.BOLD, 18));
        edad.setForeground(Color.WHITE);
        edad.setBounds(x1, y1, 130, 30);
        panel.add(edad);

        x1 = x1 + 130;

        JTextField text_edad = new JTextField(20); // Create a text field with 20 columns
        text_edad.setBounds(x1, y1, 50, 30);
        panel.add(text_edad);

        x1 = x1 + 60;

        JLabel sexo = new JLabel("Sexo M o F:");
        sexo.setFont(new Font("Serif", Font.BOLD, 18));
        sexo.setForeground(Color.WHITE);
        sexo.setBounds(x1, y1, 120, 30);
        panel.add(sexo);

        x1 = x1 + 120;
        
        JTextField text_sexo = new JTextField(20); // Create a text field with 20 columns
        text_sexo.setBounds(x1, y1, 50, 30);
        panel.add(text_sexo);


        panel.setSize(screenSize.width, screenSize.height);
        panel.setBounds(i1-sx/2, j1-sy/2, sx, sy);        
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        JButton boton1=new JButton("Finalizar");
        boton1.setFont(new Font("Serif", Font.BOLD, 20));
        boton1.setBounds(i1-100, j1+100,120,30);
      // Añadir funcionalidad a los botones (ActionListener)
        boton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//                etiqueta.setText("¡Botón 1 presionado!");
        String input = text_nombre.getText();

        System.out.println(input);        

            }
        });

        // 5. Añadir el componente al marco
        frame.add(panel);
        frame.add(boton1);
        // 6. Hacer la ventana visible
        frame.setVisible(true);
    }

   @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            System.out.println("Yes button pressed!");
//        } else if (e.getSource() == buttonNo) {
//            System.out.println("No button pressed!");
        }
    }

}


