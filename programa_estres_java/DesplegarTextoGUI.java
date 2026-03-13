import java.awt.Font;
import java.awt.Dimension;
import javax.swing.*;
import java.awt.*;

public class DesplegarTextoGUI {
    public static void main(String[] args) {
        // 1. Crear el marco (Ventana)

        Font myFont = new Font("Serif", Font.BOLD, 16);

        JFrame frame = new JFrame("Visualizador de Párrafo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Toolkit toolkit = Toolkit.getDefaultToolkit();

        // Get the screen size
        Dimension screenSize = toolkit.getScreenSize();

        frame.setSize(screenSize.width, screenSize.height);
        frame.setLayout(null);

        // 2. El párrafo de texto
        String parrafo = "Este es un ejemplo de un párrafo de texto largo \n" +
                         "desplegado en una interfaz gráfica de usuario (GUI) \n" +
                         "utilizando Java Swing. El componente JTextArea permite \n" +
                         "mostrar múltiples líneas de texto y se puede configurar \n" +
                         "para que sea editable o no.";

        // 3. Crear JTextArea para el texto

        JTextArea textArea = new JTextArea(parrafo);
        textArea.setFont(myFont); 

        textArea.setLineWrap(true); // Ajustar líneas automáticamente
        textArea.setWrapStyleWord(true); // Ajustar por palabras
        textArea.setEditable(false); // Hacerlo no editable
        textArea.setForeground(Color.WHITE); // Color de fondo         
        textArea.setBackground(Color.BLACK); // Color de fondo

        // 4. Agregar un panel con scroll (barra de desplazamiento)

        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(50, 50, 600, 200);        
        // 5. Añadir el componente al marco
        frame.add(scrollPane, BorderLayout.CENTER);

        // 6. Hacer la ventana visible
        frame.setVisible(true);
    }
}


