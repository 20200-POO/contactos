package data;

import java.util.ArrayList;
import java.util.List;

/**
 * ContactoData DAO está el CRUD
 */
public class ContactoData {
    List<Contacto> listaContactos = new ArrayList<Contacto>();

    public List<Contacto> list() {
        return listaContactos;
    }

    public void create(Contacto d) {
        listaContactos.add(d);
        // System.out.println(d.getNombre()+" is created!");
    }

    public void delete(Contacto d) {
        listaContactos.remove(d);
    }

    public void delete(int id) {
        boolean existe= false;
        for (Contacto d : listaContactos) {
            System.out.println("Deleted:"+d.getId() + "\t" + d.getNombre());
            if (id == d.getId()) {
                try {
                    listaContactos.remove(d);
                    //listaContactos.update();

                } catch (java.util.ConcurrentModificationException e2) {
                    
                    System.out.println("Contacto si exist e2="+e2);
                }
                
                
                existe= true;
            }
        }
        if(!existe) {
            System.out.println("Contacto no existe");
        }
    }

}