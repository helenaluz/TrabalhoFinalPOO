/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Controller;

import java.util.ArrayList;
import model.Obra;
import model.Termo;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Samsung
 */
public class TermoControllerTest {
     private TermoController termoController;
    private ObraController obraController;
    private Obra obraTeste;

    @Before
    public void setUp() {
        termoController = new TermoController();
        obraController = new ObraController();
        obraController.AdicionarObra("Teste2", "Ano", "Categoria");
        obraTeste = obraController.VerObraPorTitulo("Teste2");
    }

    
   

    @Test
    public void testAdicionarTermo() {
        int tamanhoAntes = TermoController.termos.size();  // Access static list
        termoController.AdicionarTermo("Teste", "Descricao", obraTeste);
        int tamanhoDepois = TermoController.termos.size();  // Access static list
        System.out.println("Size before: " + tamanhoAntes);
        System.out.println("Size after: " + tamanhoDepois);
        assertTrue("Adding a termo should increase the size by 1", tamanhoDepois > tamanhoAntes);
    }

    @Test
    public void testRemoverTermo() {
        termoController.AdicionarTermo("Teste", "Descricao", obraTeste);
        int tamanhoAntes = termoController.termos.size();
        termoController.RemoverTermo("Teste");
        int tamanhoDepois = termoController.termos.size();
        assertEquals("Removing a termo should decrease the size by 1", tamanhoAntes - 1, tamanhoDepois);
    }

    @Test
    public void testVerTermosPorNome() {
        termoController.AdicionarTermo("Teste", "Descricao", obraTeste);
        Termo termo = termoController.VerTermosPorNome("Teste");
        assertNotNull("Termo should not be null", termo);
        assertEquals("Termo name should be 'Teste'", "Teste", termo.getNome());
    }
}
