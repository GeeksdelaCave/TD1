package fr.univ_amu.iut;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertTrue;

/**
 * @author Tristan Dietz
 */

public class TestEmployeOrdinaire {

    @Test
    public void testSalaireBrut() {
        Employe emp = new EmployeOrdinaire(8753, "Cordary", "Sucre", 7654, LocalDate.now(), LocalDate.now(), 63.0, 24.0);

        assertTrue (emp.getSalaireBrut() == 766912.0);

    }
}
