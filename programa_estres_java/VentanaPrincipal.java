import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaPrincipal extends JFrame {
    public VentanaPrincipal() {
        setTitle("Ventana Principal");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JButton boton = new JButton("Abrir Segunda Ventana");
        
        // Acción del botón
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Crear y mostrar la segunda ventana
                SegundaVentana v2 = new SegundaVentana();
                v2.setVisible(true);
            }
        });
        
        add(boton);
        setLocationRelativeTo(null); // Centrar
    }

    public static void main(String[] args) {
        new VentanaPrincipal().setVisible(true);
    }
}

// Clase de la segunda ventana
class SegundaVentana extends JFrame {
    public SegundaVentana() {
        setTitle("Segunda Ventana");
        setSize(250, 150);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Cierra solo esta
        setLocationRelativeTo(null);
    }
}



