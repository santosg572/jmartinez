import javax.swing.*;
import java.awt.*;
import java.awt.Dimension;

public class DesplegarTextoGUI {
    public static void main(String[] args) {
        // 1. Crear el marco (Ventana)
        JFrame frame = new JFrame("Visualizador de Párrafo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) screenSize.getWidth();
        int height = (int) screenSize.getHeight();
        frame.setSize(width, height);
        frame.setLayout(new BorderLayout());

        // 2. El párrafo de texto
        String parrafo = "Este es un ejemplo de un párrafo de texto largo \n" +
                         "desplegado en una interfaz gráfica de usuario (GUI) \n" +
                         "utilizando Java Swing. El componente JTextArea permite \n" +
                         "mostrar múltiples líneas de texto y se puede configurar \n" +
                         "para que sea editable o no.";

        // 3. Crear JTextArea para el texto
//        JTextArea textArea = new JTextArea(5, 50);
        JTextArea textArea = new JTextArea(parrafo);
        textArea.setLineWrap(true); // Ajustar líneas automáticamente
        textArea.setWrapStyleWord(true); // Ajustar por palabras
        textArea.setEditable(false); // Hacerlo no editable
        textArea.setBackground(Color.LIGHT_GRAY); // Color de fondo
//        textArea.append(parrafo);
        // 4. Agregar un panel con scroll (barra de desplazamiento)
//        JScrollPane scrollPane = new JScrollPane(textArea);
//        JScrollPane scrollPane = new JScrollPane(textArea);      

          JPanel panel = new JPanel();
          panel.setBackground(Color.RED);
          panel.setBounds(100, 50, 150, 300);
//          panel.setSize(300, 400);
          panel.add(textArea); 
        // 5. Añadir el componente al marco
//        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(panel);
        // 6. Hacer la ventana visible
        frame.setVisible(true);
    }
}


