import java.util.ArrayList;
import java.util.List;
import data.Contacto;
import data.ContactoData;
/**
 * Principal
 */
public class Principal {
    public static void main(String[] args) {
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

        contactoData.list();
        //for(Contacto d:contactoData.list() ){
        //    System.out.println(d.getId() + "\t"+d.getNombre()); 
        //}
        
    }
}