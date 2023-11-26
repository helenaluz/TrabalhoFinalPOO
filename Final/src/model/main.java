/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;


import Controller.ObraController;
import Controller.TermoController;
import java.util.ArrayList;
import View.Telas_Iniciais;

/**
 *
 * @author Samsung
 */
public class main {

  
    
    public static void main(String[] args) {
       // Telas_Iniciais inicial = new Telas_Iniciais(); 
       // inicial.setVisible(true);
        ObraController obra = new ObraController();
      ArrayList<Obra> oi = obra.PegarTodasObras();
      
        TermoController termo = new TermoController();
        termo.AdicionarTermo("retuyyuk", "bla", oi.get(0));
        Termo excluir = termo.VerTermosPorNome("Bla");
        termo.RemoverTermo(excluir);
        ArrayList<Termo> termos = termo.PegarTodosTermos();
        
        for(int i = 0; i < termos.size(); i++){
            System.out.println(termos.get(i).getNome());
        }
    }
    
    
}
