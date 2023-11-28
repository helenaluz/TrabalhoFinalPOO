/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Tabelas;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Local;
import model.Personagem;

/**
 *
 * @author Samsung
 */
public class PersonagemTableModel extends AbstractTableModel{
    private ArrayList<Personagem> personagens;
    private String colunas[] = {"Nome", "Descrição","Obra", "Características", "Ator","Feitos"};
    
     public PersonagemTableModel(ArrayList<Personagem>  personagens) {
        this.personagens = personagens;
    }
     
    @Override
    public int getRowCount() {
        return this.personagens.size();
    }

    @Override
    public int getColumnCount() {
       return this.colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       Personagem personagem = personagens.get(rowIndex);
       switch(columnIndex){
           case 0: return personagem.getNome();
           case 1: return personagem.getDescricao();
           case 2: return return termo.getObras().get(0).getTitulo();
           case 3: return personagem.getCaracteristicas();
           case 4: return personagem.getAtores();
           case 5: return personagem.getFeitos();
           default: return null;
       }
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }
}
