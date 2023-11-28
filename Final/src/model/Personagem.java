/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author duda2
 */
public class Personagem  extends Termo implements Serializable {    
    private ArrayList<String> atores = new ArrayList<String>();
    private String feitos; 
    private String caracteristicas; 

    public Personagem(String nome, String descricao, Obra obra, String caracteristicas, String ator, String feitos){
        setCaracteristicas(caracteristicas);
        setAtores(ator);
        setFeitos(feitos);
        setNome(nome);
        AddObra(obra);
        setDescricao(descricao);
    }

    public Personagem() {
         }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        if (caracteristicas == null || caracteristicas.isEmpty()) {
            throw new IllegalArgumentException("A caracteristica não pode estar vazia");
        }   
        this.caracteristicas = caracteristicas;
    }

    public ArrayList<String> getAtores() {        
        return atores;
    }

    public void setAtores(String atores) {
      if (atores == null || atores.isEmpty()) {
            throw new IllegalArgumentException("Os ator não pode está vazio");
        }   
        this.atores.add(atores);
    }

    public String getFeitos() {
        return feitos;
    }

    public void setFeitos(String feitos) {        
        if (feitos == null || feitos.isBlank()) {
            throw new IllegalArgumentException("Os feitos podem estar vazio");
        }      
        this.feitos = feitos;
    }
    
    
    
}
