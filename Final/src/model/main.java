/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;


import Controller.LocalController;
import Controller.ObraController;
import Controller.PersonagemController;
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
        PersonagemController personagem = new PersonagemController();
        personagem.Adicionarpersonagem("ola", "sdf", oi.get(1), "sedrf", "dtgh", "ewf");
        personagem.Removerpersonagem("pito");
        ArrayList<Personagem> ola = personagem.PegarTodospersonagens();
        for(int i =0; i < ola.size(); i++){
            System.out.println(ola.get(i).getNome());
        }
      
    }
    
    
}
