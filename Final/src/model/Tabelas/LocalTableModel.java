/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Tabelas;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Local;

/**
 *
 * @author Samsung
 */
public class LocalTableModel extends AbstractTableModel {
    private ArrayList<Local> locais;
    private String colunas[] = {"Nome", "Descrição","Obra", "Descrição Histórica"};
    
     public LocalTableModel(ArrayList<Local> locais) {
        this.locais = locais;
    }
     
    @Override
    public int getRowCount() {
        return this.locais.size();
    }

    @Override
    public int getColumnCount() {
       return this.colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       Local local = locais.get(rowIndex);
       switch(columnIndex){
           case 0: return local.getNome();
           case 1: return local.getDescricao();
           case 2: return local.getObras();
           case 3: return local.getDescricao();
           default: return null;
       }
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }
}
