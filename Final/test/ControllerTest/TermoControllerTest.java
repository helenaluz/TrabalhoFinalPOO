/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ControllerTest;

import Controller.ObraController;
import Controller.TermoController;
import model.Obra;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Samsung
 */
public class TermoControllerTest {
    
    public TermoControllerTest() {
    }

    /**
     * Test of AdicionarTermo method, of class TermoController.
     */
    @Test
    public void testAdicionarTermo() {
         ObraController obraController = new ObraController();
         obraController.AdicionarObra("dd", 2023, "Livro");
         TermoController termoController = new TermoController();
         
         String nome = "rr";
         String descricao = "Mais brilhando";
         Obra obra = obraController.VerObraPorTitulo("rr");
         
         termoController.AdicionarTermo(nome, descricao, obra);
         
         assertTrue("Termo should be added to the list of termos",
                termoController.termos.stream().anyMatch(x -> x.getNome().equals(nome)));
    }

    /**
     * Test of RemoverTermo method, of class TermoController.
     */
    @Test
    public void testRemoverTermo() {
    }

    /**
     * Test of VerTermosPorNome method, of class TermoController.
     */
    @Test
    public void testVerTermosPorNome() {
    }

    /**
     * Test of PegarTodosTermos method, of class TermoController.
     */
    @Test
    public void testPegarTodosTermos() {
    }

    /**
     * Test of AdicionarPersonagem method, of class TermoController.
     */
    @Test
    public void testAdicionarPersonagem() {
    }

    /**
     * Test of AdicionarLocal method, of class TermoController.
     */
    @Test
    public void testAdicionarLocal() {
    }
    
}
