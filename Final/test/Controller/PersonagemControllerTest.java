/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Controller;

import java.util.ArrayList;
import model.Obra;
import model.Personagem;
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
public class PersonagemControllerTest {
    
  
    /**
     * Test of Removerpersonagem method, of class PersonagemController.
     */
    @Test
    public void testRemoverpersonagem() {
        System.out.println("Removerpersonagem");
        String nome = "";
        PersonagemController instance = new PersonagemController();
        instance.Removerpersonagem(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of VerpersonagensPorNome method, of class PersonagemController.
     */
    @Test
    public void testVerpersonagensPorNome() {
        System.out.println("VerpersonagensPorNome");
        String nome = "";
        PersonagemController instance = new PersonagemController();
        Personagem expResult = null;
        Personagem result = instance.VerpersonagensPorNome(nome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of PegarTodospersonagens method, of class PersonagemController.
     */
    @Test
    public void testPegarTodospersonagens() {
        System.out.println("PegarTodospersonagens");
        PersonagemController instance = new PersonagemController();
        ArrayList<Personagem> expResult = null;
        ArrayList<Personagem> result = instance.PegarTodospersonagens();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Adicionarpersonagem method, of class PersonagemController.
     */
    @Test
    public void testAdicionarpersonagem() {
        System.out.println("Adicionarpersonagem");
        String nome = "";
        String descricao = "";
        Obra obra = null;
        String caracteristicas = "";
        String ator = "";
        String feitos = "";
        PersonagemController instance = new PersonagemController();
        instance.Adicionarpersonagem(nome, descricao, obra, caracteristicas, ator, feitos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
