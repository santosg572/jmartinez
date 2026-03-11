import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EjemploDosBotones {
    public static void main(String[] args) {
        // Crear el marco (ventana)
        JFrame frame = new JFrame("Ejemplo de Botones");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new FlowLayout());

        // Crear componentes
        JLabel etiqueta = new JLabel("Presiona un botón");
        JButton boton1 = new JButton("Botón 1");
        JButton boton2 = new JButton("Botón 2");

        // Añadir funcionalidad a los botones (ActionListener)
        boton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                etiqueta.setText("¡Botón 1 presionado!");
            }
        });

        boton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                etiqueta.setText("¡Botón 2 presionado!");
            }
        });

        // Agregar componentes al marco
        frame.add(etiqueta);
        frame.add(boton1);
        frame.add(boton2);

        // Hacer visible la ventana
        frame.setVisible(true);
    }
}

