/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author duda2
 */
public class Local extends Termo {

    private String descricaoHistoria;

    public String getDescricaoHistoria() {
        return descricaoHistoria;
    }

    public void setDescricaoHistoria(String descricaoHistoria) {
        if (descricaoHistoria == null || descricaoHistoria.isEmpty()) {
            throw new IllegalArgumentException("A caracteristica não pode estar vazia");
        }

        this.descricaoHistoria = descricaoHistoria;
    }

}
