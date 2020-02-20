import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal2 {
    public static void main(String args[]) {
        // Creando el Marco
        JFrame frame = new JFrame("Chat Frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // Creando MenuBar y agregando items
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("CRUD");
        JMenu m2 = new JMenu("AYUDA");
        mb.add(m1);
        mb.add(m2);

        JMenuItem m11 = new JMenuItem("Contactos");
        JMenuItem m12 = new JMenuItem("Salir");

        m11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.out.println("Ir a contactos");;
          }
        });

        m12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
          }
        });

        m1.add(m11);
        m1.add(m12);

        // Creando el panel en la parte inferior y agregando componentes
        JPanel panel = new JPanel(); 
        JLabel label = new JLabel("2020 POO");
        panel.add(label);


        // Agregar componentes al marco.
        frame.add(BorderLayout.NORTH, mb);
        frame.add(BorderLayout.SOUTH, panel);
        frame.setVisible(true);
    }
}