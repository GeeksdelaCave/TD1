package fr.univ_amu.iut;

import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author Tristan Dietz
 */

public class TestEmploye {

    @Test
    public void testSalaireBrut() {
        Employe Emp = new Employe(1, "Bob", "Bobby", LocalDate.of(2016, Month.NOVEMBER, 9));
        Emp.setBase(12.0);
        Emp.setDateEmbEmp(LocalDate.of(2016, Month.NOVEMBER, 9));
        Emp.setEchelonEmp(3);
        Emp.setNbHeures(35.0);

        assertTrue (Emp.getSalaireBrut() == 420.0);
    }

    @Test
    public void testSalaireNet() {
        Employe Emp = new Employe(1, "Bob", "Bobby", LocalDate.of(2016, Month.NOVEMBER, 9));
        Emp.setBase(12.0);
        Emp.setDateEmbEmp(LocalDate.of(2016, Month.NOVEMBER, 9));
        Emp.setEchelonEmp(3);
        Emp.setNbHeures(35.0);

        assertTrue (Emp.getSalaireNet() == 336.0);
    }
}
