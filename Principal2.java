import java.awt.*;
import javax.swing.*;

import data.Contacto;
import data.ContactoData;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class Principal2 extends JFrame {
    /**
     * Descripción de la clase
     */
    private static final long serialVersionUID = 1L;
    // CRUD Contacto
    int contactoId = 0;
    ContactoData contactoData = new ContactoData();
    String[][] contactoMatriz = new String[0][2];;
    String[] contactoColumns = { "Id", "Nombre" };
    JTable contactoTable = new JTable(contactoMatriz, contactoColumns);
    JScrollPane contactoSP = new JScrollPane();
    // CRUD Contacto End

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

        // CRUD Contacto
        JPanel contactoPanel = new JPanel();
        contactoPanel.setLayout(new BoxLayout(contactoPanel, BoxLayout.Y_AXIS));
        JLabel contactoLblNombre = new JLabel("Ingrese Contacto:");
        JTextField contactoTxtNombre = new JTextField();
        JButton contactoBtnAdd = new JButton("Add");
        contactoBtnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                contactoId++;
                Contacto d = new Contacto();
                d.setId(contactoId);
                d.setNombre(contactoTxtNombre.getText());
                contactoData.create(d);

                List<Contacto> miLista = contactoData.list();
                contactoMatriz = new String[miLista.size()][2];
                for (int i = 0; i < miLista.size(); i++) {
                    contactoMatriz[i][0] = miLista.get(i).getId() + "";
                    contactoMatriz[i][1] = miLista.get(i).getNombre() + "";
                }
                contactoTable = new JTable(contactoMatriz, contactoColumns);// f5 table
                contactoSP.setViewportView(contactoTable);// f5 table

            }
        });

        contactoSP.setViewportView(contactoTable);
        contactoPanel.add(contactoLblNombre);
        contactoPanel.add(contactoTxtNombre);
        contactoPanel.add(contactoBtnAdd);
        contactoPanel.add(contactoSP);
        // CRUD Contacto End

        // CRUD Producto
        JPanel productoPanel = new JPanel();
        productoPanel.setLayout(new BoxLayout(productoPanel, BoxLayout.Y_AXIS));
        JLabel productoLblNombre = new JLabel("Ingrese Producto:");

        productoPanel.add(productoLblNombre);
        // CRUD Producto End

        // Actions del JFrame
        m11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.out.println("Ir a contactos");
                JOptionPane.showMessageDialog(null, contactoPanel, "Contactos", JOptionPane.PLAIN_MESSAGE);
            }
        });
        m12.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.out.println("Ir a productos");
                JOptionPane.showMessageDialog(null, productoPanel, "Productos", JOptionPane.PLAIN_MESSAGE);
            }
        });
        m19.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });
        // Actions del JFrame End

        m1.add(m11);
        m1.add(m12);
        m1.add(m19);

        // Creando el panel en la parte inferior y agregando componentes
        JPanel footPanel = new JPanel();
        JLabel footLblCopy = new JLabel("c(2020) POO");
        footPanel.add(footLblCopy);

        // Agregar componentes al marco.
        add(BorderLayout.NORTH, mb);
        add(BorderLayout.SOUTH, footPanel);

    }

    public static void main(String args[]) {
        // Creando el Marco
        Principal2 ex = new Principal2();
        ex.setVisible(true);

    }

}