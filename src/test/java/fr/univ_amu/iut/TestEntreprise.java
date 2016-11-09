package fr.univ_amu.iut;


import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.assertTrue;

/**
 * @author Tristan Dietz
 */

public class TestEntreprise {

    @Test
    public void testEmbaucher() {
        Employe emp = new Employe(12, "Colomb", "Jean Patrick", LocalDate.of(1999, Month.DECEMBER, 7));

        Entreprise test = new Entreprise("maBoiteInfo");

        test.embaucher(emp);

        assertTrue (test.contains(emp));
    }

    @Test
    public void testLicencier() {
        Employe emp = new Employe(12, "Colomb", "Jean Patrick", LocalDate.of(1999, Month.DECEMBER, 7));

        Entreprise test = new Entreprise("maBoiteInfo");

        test.embaucher(emp);
        test.licencier(emp);

        assertTrue (!test.contains(emp));
    }

}
