import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal2 extends JFrame {
    public Principal2(){
        //JFrame frame = new JFrame("Chat Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);

        // Creando MenuBar y agregando items
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("CRUD");
        JMenu m2 = new JMenu("AYUDA");
        mb.add(m1);
        mb.add(m2);

        JMenuItem m11 = new JMenuItem("Contactos");
        JMenuItem m12 = new JMenuItem("Productos");
        JMenuItem m19 = new JMenuItem("Salir");

        JPanel panelContacto = new JPanel(); 
        JPanel panelProducto = new JPanel(); 

        JLabel lblNombre = new JLabel("Ingrese Nombre:");
        JTextField txtNombre = new JTextField();
        panelContacto.add(lblNombre);
        panelContacto.add(txtNombre);
        m11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.out.println("Ir a contactos");
                remove(panelProducto);
                add(BorderLayout.CENTER, panelContacto);
                revalidate();
                repaint();
          }
        });

        JLabel lblPNombre = new JLabel("Ingrese Producto:");
        panelProducto.add(lblPNombre);
        m11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.out.println("Ir a productos");
            
                remove(panelContacto);
                add(BorderLayout.CENTER, panelProducto);
                revalidate();
                repaint();
          }
        });


        m19.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
          }
        });

        m1.add(m11);
        m1.add(m12);
        m1.add(m19);

        // Creando el panel en la parte inferior y agregando componentes
        JPanel panel = new JPanel(); 
        JLabel label = new JLabel("2020 POO");
        panel.add(label);


        // Agregar componentes al marco.
        add(BorderLayout.NORTH, mb);
        add(BorderLayout.SOUTH, panel);
    }
    public static void main(String args[]) {
        // Creando el Marco
        Principal2 ex = new Principal2();
        ex.setVisible(true);
        
    }
}