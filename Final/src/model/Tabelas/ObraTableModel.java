/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Tabelas;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.Obra;
import model.Termo;

/**
 *
 * @author Samsung
 */
public class ObraTableModel extends AbstractTableModel{
    private ArrayList<Obra> obras;
    private String[] colunas = {"Título", "Ano Lançamento", "Categoria"};
    
    public ObraTableModel(ArrayList<Obra> obras){
        this.obras = obras;
    }
    
    @Override
    public int getRowCount() {
        return this.obras.size();
    }

    @Override
    public int getColumnCount() {
        return this.colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
      Obra obra = obras.get(rowIndex);
      
      switch(columnIndex){
          case 0: return obra.getTitulo();
          case 1: return obra.getAnoLancamento();
          case 2: return obra.getCategoria();
          default: return null;
      }
    }
    
   @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }
}
