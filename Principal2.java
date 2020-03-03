import java.awt.*;
import javax.swing.*;

import data.Contacto;
import data.ContactoData;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Principal2 extends JFrame {
    int id = 0;
    ContactoData contactoData = new ContactoData();
    List<Contacto> miLista;
    String[][] matrizInfo = new String[0][2];;
    String[] columnNames = { "Id", "Nombre" };
    JTable jTableContactos ;
    JScrollPane spContactos;

    public Principal2() {
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
        panelContacto.setLayout(new BoxLayout(panelContacto, BoxLayout.Y_AXIS));
        JLabel lblNombre = new JLabel("Ingrese Contacto:");
        JTextField txtNombre = new JTextField();
        JButton b = new JButton("Add");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // txtNombre.setText("Welcome to Javatpoint.");
                System.out.println("txtNombre=" + txtNombre.getText());
                id++;
                Contacto d = new Contacto();
                d.setId(id);
                d.setNombre(txtNombre.getText());
                contactoData.create(d);

                miLista = contactoData.list();
                System.out.println(miLista);
                matrizInfo = new String[miLista.size()][2];
                for (int i = 0; i < miLista.size(); i++) {
                    matrizInfo[i][0] = miLista.get(i).getId() + "";
                    matrizInfo[i][1] = miLista.get(i).getNombre() + "";
                }
                jTableContactos = new JTable(matrizInfo, columnNames);
                spContactos.setViewportView(jTableContactos);

            }
        });
        jTableContactos = new JTable(matrizInfo, columnNames);
        spContactos = new JScrollPane();
        spContactos.setViewportView(jTableContactos);

        panelContacto.add(lblNombre);
        panelContacto.add(txtNombre);
        panelContacto.add(b);
        panelContacto.add(spContactos);







        JPanel panelProducto = new JPanel();
        panelProducto.setLayout(new BoxLayout(panelProducto, BoxLayout.Y_AXIS));
        JLabel lblPNombre = new JLabel("Ingrese Producto:");


        panelProducto.add(lblPNombre);



        ///actions
        m11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.out.println("Ir a contactos");
                JOptionPane.showMessageDialog(null, panelContacto, "Contactos", JOptionPane.PLAIN_MESSAGE);
            }
        });
        m12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.out.println("Ir a productos");
                JOptionPane.showMessageDialog(null, panelProducto, "Productos", JOptionPane.PLAIN_MESSAGE);
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