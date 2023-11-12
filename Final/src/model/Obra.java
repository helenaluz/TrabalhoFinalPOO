/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author duda2
 */
public class Obra {

    private String titulo;
    private int anoLancamento;
    private Categoria categoria;

    public Obra(String titulo, int anoLancamento, Categoria categoria) {
        setAnoLancamento(anoLancamento);
        setTitulo(titulo);
        setCategoria(categoria);
    }
    public Obra(){}
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if(titulo == null || titulo.isEmpty()) throw new IllegalArgumentException("O Titulo não pode ser vazio!");
        this.titulo = titulo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        if(anoLancamento == 0 )throw new IllegalArgumentException("O ano de lançamento não pode ser vazio!");
        this.anoLancamento = anoLancamento;
    }
    
    public void setCategoria(Categoria categoria){
        this.categoria = categoria;
    }
    
    public String getCategoria(){
        return categoria.name();
    }

}
