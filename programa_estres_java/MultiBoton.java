import javax.swing.*;
import java.awt.event.*;
import java.awt.FlowLayout;

public class MultiBoton extends JFrame implements ActionListener {
    JButton boton1, boton2;

    public MultiBoton() {
        setLayout(new FlowLayout());
        boton1 = new JButton("Botón A");
        boton2 = new JButton("Botón B");

        // Añadir el mismo listener (esta clase) a ambos botones
        boton1.addActionListener(this);
        boton2.addActionListener(this);

        add(boton1);
        add(boton2);
        setSize(200, 100);
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
        new MultiBoton();
    }
}
