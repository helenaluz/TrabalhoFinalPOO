/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import model.Local;
import model.Obra;
import model.Personagem;
import model.Termo;

/**
 *
 * @author Samsung
 */
public class TermoController {

    public TermoController() {
        carregarObrasDoArquivo();
    }
    
    ArrayList<Termo> termos = new ArrayList<>();
    ObraController obraController = new ObraController();
    
     public void AdicionarTermo(String nome, String descricao, Obra obra) {
       try{
           Termo termo = new Termo(nome, descricao, obra);
            if (this.termos.stream().anyMatch(x -> x.getNome().equals(termo.getNome()))) throw new IllegalArgumentException("Termo com o mesmo nome já existe na coleção!");
            if(!obraController.obras.stream().anyMatch(x -> x.getTitulo().equals(obra.getTitulo()))) throw new IllegalArgumentException("Obra não existe na coleção!");
            this.termos.add(termo);
            atualizarArquivo();
       }
       catch(IllegalArgumentException e){
            System.err.println(e.getMessage());
        }
    }
    
    public void RemoverTermo(Termo termo){
        try{
            if(!this.termos.stream().anyMatch(x -> x == termo)) throw new IllegalArgumentException("Termo não existe na coleção");
            this.termos.remove(termo);
            atualizarArquivo();
        }
        catch(IllegalArgumentException e){
            System.err.println(e.getMessage());
        }
    }
    
    public Termo VerTermosPorNome(String nome){
        
        try{
             return this.termos.stream().filter(x -> x.getNome().equals(nome)).findFirst().orElseThrow(() -> new IllegalArgumentException("Termo com nome: "+nome+" não encontrado!"));
        }
        catch(IllegalArgumentException e){
            System.err.println(e.getMessage());
        }
        return null;
    }
    
    public ArrayList<Termo> PegarTodosTermos(){
        try{
            if(this.termos == null || this.termos.size() == 0) throw new IllegalArgumentException("Não há termos cadastradas no sistema!");
            return this.termos;
        }
        catch(IllegalArgumentException e){
            System.err.println(e.getMessage());
        }
        return null;
    }
    
     public void AdicionarPersonagem(String nome, String descricao, Obra obra, String caracteristicas, String ator, String feitos){
        try{
            Personagem personagem = new Personagem(nome, descricao, obra, caracteristicas, ator, feitos);
            if(this.termos.stream().anyMatch(x -> x.getNome().equals(nome)))  throw new IllegalArgumentException("Personagem com o mesmo nome já existe na coleção!");
            this.termos.add(personagem);
            atualizarArquivo();
        }
        catch(IllegalArgumentException e){
            System.err.println(e.getMessage());
        }
    }
    
    public void AdicionarLocal(String nome, String descricao, Obra obra, String descricaoHistorica){
        try{
            Local local = new Local(nome, descricao, obra, descricaoHistorica);
            if(this.termos.stream().anyMatch(x -> x.getNome().equals(nome))) throw new IllegalArgumentException("Local com o mesmo nome já existe na coleção!");
            this.termos.add(local);
            atualizarArquivo();
        }
        catch(IllegalArgumentException e){
            System.err.println(e.getMessage());
        }
    }
    
    private void carregarObrasDoArquivo() {
    termos.clear();
    try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("temos.dat"))) {
        while (true) {
            try {
                Termo termo = (Termo) inputStream.readObject();
                termos.add(termo);
            } catch (EOFException e) {
                System.err.println(e.getMessage());
                break;
            }
        }
    } catch (FileNotFoundException e) {
        System.err.println(e.getMessage());
    } catch (IOException | ClassNotFoundException e) {
        System.err.println(e.getMessage());
    }
    
    
}
    private void atualizarArquivo() {
    try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("temos.dat"))) {
        for (Termo termoExistente: this.termos) {
            outputStream.writeObject(termoExistente);
        }
    } catch (Exception e) {
        System.err.println(e.getMessage());
    }
}
}
