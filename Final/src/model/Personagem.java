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
public class Personagem  extends Termo{    
    private ArrayList<String> caracteristicas = new ArrayList<String>();
    private ArrayList<String> atores = new ArrayList<String>();
    private String feitos; 

    public ArrayList<String> getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(ArrayList<String> caracteristicas) {
        if (caracteristicas == null || caracteristicas.isEmpty()) {
            throw new IllegalArgumentException("A caracteristica não pode estar vazia");
        }   
        this.caracteristicas = caracteristicas;
    }

    public ArrayList<String> getAtores() {
        return atores;
    }

    public void setAtores(ArrayList<String> atores) {
      if (atores == null || atores.isEmpty()) {
            throw new IllegalArgumentException("Os ator não pode está vazio");
        }   
        this.atores = atores;
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
