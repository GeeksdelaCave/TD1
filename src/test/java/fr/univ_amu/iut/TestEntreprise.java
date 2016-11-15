package fr.univ_amu.iut;


import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertTrue;

/**
 * @author Tristan Dietz
 */

public class TestEntreprise {

    @Test
    public void testEmbaucher() {
        Employe emp = new EmployeOrdinaire(267, "YHTgfgfs", "EBTRehyht", 76, LocalDate.now(), LocalDate.now(), 75.0, 8.0);

        Entreprise test = new Entreprise();

        test.embaucher(emp);

        assertTrue (test.contains(emp));
    }

    @Test
    public void testLicencier() {
        Employe emp = new EmployeOrdinaire(8965, "Pernaud", "Jean Patrick", 64, LocalDate.now(), LocalDate.now(), 4.7, 8.0);

        Entreprise test = new Entreprise();

        test.embaucher(emp);
        test.licencier(emp);

        assertTrue (!test.contains(emp));
    }

}
