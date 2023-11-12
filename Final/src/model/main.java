/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Samsung
 */
public class main {

    private ArrayList<Termo> termos = new ArrayList<Termo>();
    private ArrayList<Obra> obras =  new ArrayList<Obra>();
    
    public static void main(String[] args) {
        
        
     
    }
    
    public void AdicionarTermo(String nome, String descricao, Obra obra) {
       Termo termo = new Termo(nome, descricao, obra);
       if (this.termos.stream().anyMatch(x -> x.getNome().equals(termo.getNome()))) throw new IllegalArgumentException("Termo com o mesmo nome já existe na coleção!");
       if(!this.obras.stream().anyMatch(x -> x.getTitulo().equals(obra.getTitulo()))) throw new IllegalArgumentException("Obra não existe na coleção!");
       this.termos.add(termo);
    }
    
    public void RemoverTermo(Termo termo){
        if(!this.termos.stream().anyMatch(x -> x == termo)) throw new IllegalArgumentException("Termo não existe na coleção");
        this.termos.remove(termo);
    }
    
    public Termo VerTermosPorNome(String nome){
        return this.termos.stream().filter(x -> x.getNome().equals(nome)).findFirst().orElseThrow(() -> new IllegalArgumentException("Termo com nome: "+nome+" não encontrado!"));
    }
    
    public ArrayList<Termo> PegarTodosTermos(){
        if(this.termos == null || this.termos.size() == 0) throw new IllegalArgumentException("Não há termos cadastradas no sistema!");
        return this.termos;
    }
    
    public void AdicionarObra(String titulo, int ano, Categoria categoria){
        Obra obra = new Obra(titulo, ano, categoria);
        if(this.obras.stream().anyMatch(x -> x.getTitulo().equals(titulo))) throw new IllegalArgumentException("Obra com o mesmo titulo já existe na coleção!");
        this.obras.add(obra);
    }
    
    public void RemoverObra(Obra obra){
        if(!this.obras.stream().anyMatch(x -> x == obra)) throw new IllegalArgumentException("Obra não existe na coleção!");
        this.obras.remove(obra);
    }
    
    public Obra VerObraPorTitulo(String titulo){
        return this.obras.stream().filter(x -> x.getTitulo().equals(titulo)).findFirst().orElseThrow(() -> new IllegalArgumentException("Obra com titulo: "+titulo+" não encontrado!"));
    }
    
    public ArrayList<Obra> PegarTodasObras(){
        if(this.obras == null || this.obras.size() == 0) throw new IllegalArgumentException("Não há obras cadastradas no sistema!");
        return this.obras;
    }
    
    public void AdicionarPersonagem(String nome, String descricao, Obra obra, String caracteristicas, String ator, String feitos){
        Personagem personagem = new Personagem(nome, descricao, obra, caracteristicas, ator, feitos);
        if(this.termos.stream().anyMatch(x -> x.getNome().equals(nome)))  throw new IllegalArgumentException("Personagem com o mesmo nome já existe na coleção!");
        this.termos.add(personagem);
    }
    
    public void AdicionarLocal(String nome, String descricao, Obra obra, String descricaoHistorica){
        Local local = new Local(nome, descricao, obra, descricaoHistorica);
        if(this.termos.stream().anyMatch(x -> x.getNome().equals(nome))) throw new IllegalArgumentException("Local com o mesmo nome já existe na coleção!");
        this.termos.add(local);
    }
}
