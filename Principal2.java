// Un simple programa Swing

// Los programas Swing deben importar java.swing.
import java.util.List;

import javax.swing.*;

import data.Contacto;
import data.ContactoData;

public class Principal2 {

    Principal2() {
        
        // Crea un nuevo contenedor JFrame.
        JFrame jfrm = new JFrame("Una simple aplicación Swing");
        // Se le da al cuadro un tamaño inicial.
        jfrm.setSize(600, 800);
        // Termine el programa cuando el usuario cierre la aplicación.
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crea una etiqueta basada en texto.
        JLabel jLabel = new JLabel("Programación GUI con Swing.");
        // Agregue la etiqueta al panel de contenido (content pane).
        // jfrm.add(jLabel);
        ContactoData contactoData= new ContactoData();
        
        Contacto c = new Contacto();
        c.setId(1);
        c.setNombre("Juan Perez");
        c.setCelular("99999");
        contactoData.create(c);

        Contacto c2 = new Contacto();
        c2.setId(2);
        c2.setNombre("Maria");
        c2.setCelular("88888");
        contactoData.create(c2);

        //Object[][] rowData = { { 1, 2 }, { 3, 4 } };
        
        List<Contacto> miLista=contactoData.list();

        String matrizInfo[][]=new String[miLista.size()][2];
         
        for (int i = 0; i < miLista.size(); i++) {
         matrizInfo[i][0]=miLista.get(i).getId()+"";
         matrizInfo[i][1]=miLista.get(i).getNombre()+"";
        }

        String[] columnNames = { "col1", "col2" };
        JTable jTable = new JTable(matrizInfo, columnNames);
        jfrm.add(jTable);

        // Visualiza el marco.
        jfrm.setVisible(true);
    }
    

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Principal2();
            }
        });
    }
}