package data;

import java.util.ArrayList;
import java.util.List;

/**
 * ContactoData DAO está el CRUD
 */
public class ContactoData {
    List<Contacto> listaContactos= new ArrayList<Contacto>();

    public void list() {
        System.out.println("Lista de contactos");
        for(Contacto d:listaContactos ){
            System.out.println(d.getId() + "\t"+d.getNombre()); 
        }
    }
    public void create(Contacto d) {
        listaContactos.add(d);
        System.out.println(d.getNombre()+" is created!");
    }
    

}