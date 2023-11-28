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
       Telas_Iniciais inicial = new Telas_Iniciais(); 
       inicial.setVisible(true);
       PersonagemController personagem = new PersonagemController(); 
       ObraController obras = new ObraController(); 
     
       
    }
    
    
}
