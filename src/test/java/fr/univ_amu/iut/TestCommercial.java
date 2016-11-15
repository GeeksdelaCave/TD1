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

        Commercial com = new Commercial(12567, "Weber", "Daniel", 5, LocalDate.now(), LocalDate.now(), 4.0, 5.06);
        com.setChiffreAffaires(2);
        com.setTauxCommission(4);

        assertTrue (com.getSalaireBrut() == 12.0);
    }
}
