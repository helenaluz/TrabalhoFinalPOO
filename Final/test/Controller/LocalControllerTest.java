/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Controller;

import java.util.ArrayList;
import model.Local;
import model.Obra;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Dell
 */
public class LocalControllerTest {
    
    /**
     * Test of Removerlocal method, of class LocalController.
     */
    @Test
    public void testRemoverlocal() {
        System.out.println("Removerlocal");
        String nome = "";
        LocalController instance = new LocalController();
        instance.Removerlocal(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of VerlocaisPorNome method, of class LocalController.
     */
    @Test
    public void testVerlocaisPorNome() {
        System.out.println("VerlocaisPorNome");
        String nome = "";
        LocalController instance = new LocalController();
        Local expResult = null;
        Local result = instance.VerlocaisPorNome(nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of PegarTodoslocais method, of class LocalController.
     */
    @Test
    public void testPegarTodoslocais() {
        System.out.println("PegarTodoslocais");
        LocalController instance = new LocalController();
        ArrayList<Local> expResult = null;
        ArrayList<Local> result = instance.PegarTodoslocais();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AdicionarLocal method, of class LocalController.
     */
    @Test
    public void testAdicionarLocal() {
        System.out.println("AdicionarLocal");
        String nome = "";
        String descricao = "";
        Obra obra = null;
        String descricaoHistorica = "";
        LocalController instance = new LocalController();
        instance.AdicionarLocal(nome, descricao, obra, descricaoHistorica);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
