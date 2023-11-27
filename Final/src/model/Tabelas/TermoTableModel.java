/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Tabelas;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Termo;

/**
 *
 * @author Samsung
 */
public class TermoTableModel extends AbstractTableModel{
    private ArrayList<Termo> termos;
    private String colunas[] = {"Nome", "Descrição","Obra"};
    
     public TermoTableModel(ArrayList<Termo> termos) {
        this.termos = termos;
    }
     
    @Override
    public int getRowCount() {
        return this.termos.size();
    }

    @Override
    public int getColumnCount() {
       return this.colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       Termo termo = termos.get(rowIndex);
       switch(columnIndex){
           case 0: return termo.getNome();
           case 1: return termo.getDescricao();
           case 2: return termo.getObras();
           default: return null;
       }
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }
    
}
