import data.Contacto;

/**
 * Principal
 */
public class Principal {

    public static void main(String[] args) {
        System.out.println("Hola Java");
        Contacto c = new Contacto();
        c.setId(1);
        c.setNombre("Juan Perez");
        c.setCelular("99999");
        System.out.println(c.getId()+" "+c.getNombre());

        Contacto c2 = new Contacto();
        c2.setId(2);
        c2.setNombre("Maria");
        c2.setCelular("88888");
        System.out.println(c2.getId()+" "+c2.getNombre());

    }
}