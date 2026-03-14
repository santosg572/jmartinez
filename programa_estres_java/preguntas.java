import java.awt.Toolkit;
import java.awt.Dimension;
import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;

public class preguntas extends JFrame implements ActionListener {
    JButton boton1, boton2;

    public preguntas() {
        System.out.println("paso0");
        setLayout(null);
        boton1 = new JButton();
        ImageIcon icono = new ImageIcon(getClass().getResource("preg1.png"));
        boton1.setIcon(icono);
        boton2 = new JButton("Botón B");

        System.out.println("paso1");


        // Añadir el mismo listener (esta clase) a ambos botones
        boton1.addActionListener(this);
        boton2.addActionListener(this);

        add(boton1);
        add(boton2);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
      
        int  ancho = (int) screenSize.getWidth();
        int  alto = (int) screenSize.getHeight();
        
        System.out.println("Ancho: " + ancho);
        System.out.println("Alto: " + alto);

        setSize(ancho, alto);

        int i1 = ancho/2;
        int j1 = alto/2;
        int dx = 200;
        i1 = i1 - dx/2;

        boton1.setBounds(i1, j1, dx, 80);
        i1 = i1+dx;
        boton2.setBounds(i1, j1, dx, 40);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Identificar la fuente del evento
        if (e.getSource() == boton1) {
            System.out.println("Se presionó el Botón A");
        } else if (e.getSource() == boton2) {
            System.out.println("Se presionó el Botón B");
        }
    }

    public static void main(String[] args) {
        new preguntas();
    }
}
