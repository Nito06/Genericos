package genericos;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author diegu
 */
public abstract class MaterialDigital {
     public String titulo;
       public String autor;
       public int añoPublication;
       
       public  MaterialDigital (String titulo, String autor, int año){
       this.titulo = titulo;
       this.autor = autor;
       this.añoPublication = año;
       
       }
       
       public abstract void ShowInfo();
}
