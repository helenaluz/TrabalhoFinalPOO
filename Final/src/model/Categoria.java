/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * 
 *
 * @author duda2 
 */
public enum Categoria  {        
   ROMANCE("ROMANCE"),
   TERROR("TERROR"),
   ACAO("AÇÃO"),
   SUSPENSE("SUSPENSE"),
   COMEDIA("COMÉDIA"), 
   INFANTIL("INFANTIL"),
   ACADEMICO("ACADEMICO");
    
    public String Categoria; 

    private Categoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getCategoria() {
        return Categoria;
    }
    
   
}
