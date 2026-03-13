import javax.swing.*;
import java.awt.*;

public class EjemploScrollPane extends JFrame {

    public EjemploScrollPane() {
        setTitle("Ejemplo JScrollPane Posicionado");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // 1. IMPORTANTE: setLayout(null) para posicionamiento absoluto
        setLayout(null);
        
        // 2. Crear un componente grande para el ejemplo
        JTextArea textArea = new JTextArea(20, 30);
        textArea.setText("Escribe mucho texto aquí...\n".repeat(30));
        
        // 3. Crear el JScrollPane y añadir el componente
        JScrollPane scrollPane = new JScrollPane(textArea);
        
        // 4. Posicionar el scroll pane (x, y, ancho, alto)
        // Por ejemplo, posicionado en 50, 50 con tamaño 300x200
        scrollPane.setBounds(50, 50, 300, 200);
        
        // 5. Añadir el JScrollPane al JFrame
        add(scrollPane);
        
        setVisible(true);
    }

    public static void main(String[] args) {
        new EjemploScrollPane();
    }
}


