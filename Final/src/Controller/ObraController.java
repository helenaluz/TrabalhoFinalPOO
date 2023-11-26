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
import model.Obra;

/**
 * Controlador de Obra, lida com adições, consultas, deletações e arquivco
 * 
 * 
 * @author Samsung
 */
public class ObraController {

    public ObraController() {
        this.carregarObrasDoArquivo();
    }
    
    public ArrayList<Obra> obras = new ArrayList<>();

    /**
     * Adiciona um obra ao arquivo
     * 
     * @param titulo titúlo da obra
     * @param ano ano da obra
     * @param categoria categoria da obra
     */
    public void AdicionarObra(String titulo, int ano, String categoria){
        try{
            model.Obra obra = new model.Obra(titulo, ano, categoria);
            if(this.obras.stream().anyMatch(x -> x.getTitulo().equals(titulo))) throw new IllegalArgumentException("Obra com o mesmo titulo já existe na coleção!");
            this.obras.add(obra);
            try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("obras.dat"))) {
                outputStream.writeObject(obra);
            } 
            catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        catch(IllegalArgumentException e){
            System.err.println(e.getMessage());
        }
    }
    
    /**
     *
     * Remove a obra do arquivo
     * 
     * @param obra passa um tipo obra para remover essa obra expecifica
     */
    public void RemoverObra(model.Obra obra){
        try{
            if(!this.obras.stream().anyMatch(x -> x == obra)) throw new IllegalArgumentException("Obra não existe na coleção!");
            this.obras.remove(obra);
            atualizarArquivo();
        }
        catch(IllegalArgumentException e){
            System.err.println(e.getMessage());
        }
    }
    
    /**
     * Consulta das obra do arquivo pelo título
     * 
     * @param titulo String que você passa para ver tal titulo
     * @return  Obra com tal titulo
     */
    public model.Obra VerObraPorTitulo(String titulo){
       try{
           return this.obras.stream().filter(x -> x.getTitulo().equals(titulo)).findFirst().orElseThrow(() -> new IllegalArgumentException("Obra com titulo: "+titulo+" não encontrado!"));
       }
       catch(IllegalArgumentException e){
            System.err.println(e.getMessage());
        }
        return null;
    }
    
    /**
     * Retorna todas as obras do arquivo
     * @return Lista de todas as obras
     */
    public ArrayList<model.Obra> PegarTodasObras(){
        try{
            if(this.obras == null || this.obras.size() == 0) throw new IllegalArgumentException("Não há obras cadastradas no sistema!");
            return this.obras;
        }
        catch(IllegalArgumentException e){
            System.err.println(e.getMessage());
        }
        return null;
    }
    
    /**
     * Carregar obras do arquivo para uma lista
     */
    private void carregarObrasDoArquivo() {
    obras.clear();
    try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("obras.dat"))) {
        while (true) {
            try {
                Obra obra = (Obra) inputStream.readObject();
                obras.add(obra);
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
    /**
     * Atualiza o arquivo, sobre escreve o que esta no arquivo com o que esta na lista
     */
    private void atualizarArquivo() {
    try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("obras.dat"))) {
        for (Obra obraExistente : this.obras) {
            outputStream.writeObject(obraExistente);
        }
    } catch (Exception e) {
        System.err.println(e.getMessage());
    }
}
}

