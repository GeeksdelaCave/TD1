package fr.univ_amu.iut;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertTrue;

/**
 * @author Tristan Dietz
 */
public class TestTechnicien {

    @Test
    public void testSalaireBrut() {
        Technicien emp = new Technicien(1789, "Lepen", "Jean-Marie", LocalDate.now());
        emp.setBase(2);
        emp.setNbHeures(35);
        emp.setNbUnitesProduites(5);
        emp.setTauxCommissionUnite(1.3);

        assertTrue (emp.getSalaireBrut() == 76.5);
    }

}
