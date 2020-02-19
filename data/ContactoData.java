package data;

import java.util.ArrayList;
import java.util.List;

/**
 * ContactoData DAO está el CRUD
 */
public class ContactoData {
    List<Contacto> listaContactos= new ArrayList<Contacto>();

    public List<Contacto> list() {
        return listaContactos;
    }
    public void create(Contacto d) {
        listaContactos.add(d);
        //System.out.println(d.getNombre()+" is created!");
    }
    public void delete(Contacto d) {
        listaContactos.remove(d);
    }
    

}