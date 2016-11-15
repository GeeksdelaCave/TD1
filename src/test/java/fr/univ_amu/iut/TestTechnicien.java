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
        Technicien emp = new Technicien(1239, "Mars", "Bruno", 1245, LocalDate.now(), LocalDate.now(), 5.0, 36);

        assertTrue (emp.getSalaireBrut() == 180.0);
    }

}
