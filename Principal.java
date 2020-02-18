import java.util.ArrayList;
import java.util.List;
import data.Contacto;
/**
 * Principal
 */
public class Principal {
    public static void main(String[] args) {
        List<Contacto> listaContactos= new ArrayList<Contacto>();

        Contacto c = new Contacto();
        c.setId(1);
        c.setNombre("Juan Perez");
        c.setCelular("99999");
        listaContactos.add(c);

        Contacto c2 = new Contacto();
        c2.setId(2);
        c2.setNombre("Maria");
        c2.setCelular("88888");
        listaContactos.add(c2);

        for(Contacto d:listaContactos){
            System.out.println(d.getId() + "\t"+d.getNombre()); 
        }
    }
}