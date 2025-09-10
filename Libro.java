package genericos;


public class Libro extends MaterialDigital {
    
    public Libro(String titulo, String autor, int año){
    
    super(titulo, autor, año);    
    }
    @Override
    public void ShowInfo(){
        System.out.println("Titulo: " +this.titulo + "Autor: " + this.autor + "Año: " + this.añoPublication);
    }
    
}
