import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjemploVentana {
    public static void main(String[] args) {
        // 1. Crear la ventana (JFrame)
        JFrame frame = new JFrame("Mi Aplicación");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new FlowLayout()); // Layout simple para organizar componentes

        // 2. Crear el texto (JLabel)
        JLabel etiqueta = new JLabel("Hola, presiona el botón:");
        
        // 3. Crear el botón (JButton)
        JButton boton = new JButton("Presioname");

        // 4. Agregar acción al botón (ActionListener)
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiqueta.setText("¡Botón presionado!");
            }
        });

        // 5. Agregar componentes a la ventana
        frame.add(etiqueta);
        frame.add(boton);

        // 6. Mostrar la ventana
        frame.setLocationRelativeTo(null); // Centrar en pantalla
        frame.setVisible(true);
    }
}


