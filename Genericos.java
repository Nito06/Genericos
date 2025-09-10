package genericos;

/** @author diegu*/
public class Genericos {

    public static void main(String[] args) {
        System.out.println("me queda unX100to");
        Inventario<MaterialDigital> inventario = new Inventario<>();
        Revista rev = new Revista("Forbes", "Alguien", 2025, "Alfonso");
        Libro libro = new Libro("La guia del ligue", "Werever Hombre de negocios", 2015);
       inventario.Agregar(rev);
        inventario.Agregar(libro);
      
    }
    
}
