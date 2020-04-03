package uvsq21603110;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.time.LocalDate;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void testInitperso(){
        Personnel personnel = new Personnel.Builder("Test", "Test", "Testeur").build();
        assertEquals("Test", personnel.getNom());
        assertEquals("Test", personnel.getPrenom());
        assertEquals("Testeur", personnel.getFonction());
    }

    @Test
    public void testAddtel(){
        String Tel = "0130333909";
        Personnel personnel = new Personnel.Builder("Test", "Test", "Testeur").addTel(Tel).build();
        assertEquals(personnel.getTel().get(0), Tel);
    }

    @Test
    public void testAddnaissance(){
        LocalDate naissance = LocalDate.now();
        Personnel personnel = new Personnel.Builder("Test", "Test", "Testeur").addNaissance(naissance).build();
        assertEquals(personnel.getNaissance(), naissance);
    }

    @Test
    public void testInitGroupe(){
        Groupe g = new Groupe();
        Personnel p = new Personnel.Builder("Test", "Test", "Testeur").build();
        g.add2Groupe(p);
        assertTrue(g != null);
    }

    @Test
    public void testADDGroupe(){
        Groupe g = new Groupe();
        Personnel p = new Personnel.Builder("Test", "Test", "Testeur").build();
        g.add2Groupe(p);
        assertEquals(g.getListGroup().size() , 1);
    }
}
