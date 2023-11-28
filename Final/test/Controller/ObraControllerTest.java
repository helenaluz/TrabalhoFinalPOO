/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Controller;

import java.util.ArrayList;
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
public class ObraControllerTest {
    
 
    /**
     * Test of AdicionarObra method, of class ObraController.
     */
    @Test
    public void testAdicionarObra() {
        System.out.println("AdicionarObra");
        String titulo = "";
        String ano = "";
        String categoria = "";
        ObraController instance = new ObraController();
        instance.AdicionarObra(titulo, ano, categoria);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RemoverObra method, of class ObraController.
     */
    @Test
    public void testRemoverObra() {
        System.out.println("RemoverObra");
        String titulo = "";
        ObraController instance = new ObraController();
        instance.RemoverObra(titulo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of VerObraPorTitulo method, of class ObraController.
     */
    @Test
    public void testVerObraPorTitulo() {
        System.out.println("VerObraPorTitulo");
        String titulo = "";
        ObraController instance = new ObraController();
        Obra expResult = null;
        Obra result = instance.VerObraPorTitulo(titulo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of PegarTodasObras method, of class ObraController.
     */
    @Test
    public void testPegarTodasObras() {
        System.out.println("PegarTodasObras");
        ObraController instance = new ObraController();
        ArrayList<Obra> expResult = null;
        ArrayList<Obra> result = instance.PegarTodasObras();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
