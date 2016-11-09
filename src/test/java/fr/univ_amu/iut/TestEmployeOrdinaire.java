package fr.univ_amu.iut;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.assertTrue;

/**
 * @author Tristan Dietz
 */

public class TestEmployeOrdinaire {

    @Test
    public void testSalaireBrut() {
        Employe emp = new EmployeOrdinaire(12, "Nom", "Prenom", LocalDate.of(1997, Month.JUNE, 7));
        emp.setEchelonEmp(0);
        emp.setBase(2);
        emp.setNbHeures(40);

        assertTrue (emp.getSalaireBrut() == 80.0);

    }
}
