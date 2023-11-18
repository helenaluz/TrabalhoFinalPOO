/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author duda2
 */
public class Local extends Termo implements Serializable {

    private String descricaoHistoria;

    public Local(String nome, String descricao, Obra obra, String descricaoHistorica){
        super(nome, descricao, obra);
        setDescricaoHistoria(descricaoHistorica);
    }
    
    public String getDescricaoHistoria() {
        return descricaoHistoria;
    }

    public void setDescricaoHistoria(String descricaoHistoria) {
        if (descricaoHistoria == null || descricaoHistoria.isEmpty()) {
            throw new IllegalArgumentException("A descrição histórica não pode estar vazia");
        }

        this.descricaoHistoria = descricaoHistoria;
    }

}
