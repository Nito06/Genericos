package genericos;


public class Revista extends MaterialDigital {
    
    public String Fotografo;
    
    public Revista(String titulo, String autor, int año, String fotografo){
super(titulo, autor, año);
   this.Fotografo = fotografo;

}
    @Override
    public void ShowInfo(){
        System.out.println("Titulo: " + this.titulo + "Autor: " + this.autor + "Año: " + this.añoPublication);
    
    
    }
    
}
