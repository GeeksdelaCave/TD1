package fr.univ_amu.iut;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertTrue;

/**
 * @author Tristan Dietz
 */

public class TestCommercial {

    @Test
    public void testSalaireBrut() {

        Commercial com = new Commercial(124567, "Valjean", "Jean", LocalDate.now());
        com.setBase(3);
        com.setChiffreAffaires(2);
        com.setTauxCommission(4);

        assertTrue (com.getSalaireBrut() == 11);
    }
}
