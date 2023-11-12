/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author duda2
 */
public class Termo {

 
    private String nome;
    private String descricao;
    private ArrayList<Obra> obras = new ArrayList<Obra>();

    public Termo(String nome, String descricao,  Obra obra) {
        try{
            setNome(nome);
            setDescricao(descricao);
            AddObra(obra);
        }
        catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }
       
    public Termo(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("O nome não pode estar vazio");
        }
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao == null || descricao.isBlank()) {
            throw new IllegalArgumentException("A descricao não pode estar vazia");
        }
        this.descricao = descricao;
    }
    
    public void AddObra(Obra obra){
        if (obras.stream().anyMatch(x -> x.getTitulo().equals(obra.getTitulo()))) throw new IllegalArgumentException("Obra com nome "+obra.getTitulo()+" já adicionada!");
        obras.add(obra);
    };
    
    public ArrayList<Obra> getObras(){
        return obras;
    }
}
