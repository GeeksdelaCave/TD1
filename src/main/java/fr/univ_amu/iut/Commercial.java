package fr.univ_amu.iut;

import java.time.LocalDate;

/**
 * @author Tristan Dietz
 */

public class Commercial extends Employe {

    private double chiffreAffaires, tauxCommission;

    public Commercial (int numEmp, String nomEmp, String prenomEmp, LocalDate dateNaissEmp) {
        super(numEmp, nomEmp, prenomEmp, dateNaissEmp);

    }

    public void setChiffreAffaires(double chiffreAffaires) {
        this.chiffreAffaires = chiffreAffaires;
    }

    public void setTauxCommission(double tauxCommission) {
        this.tauxCommission = tauxCommission;
    }

    public double getSalaireBrut() {
        return getBase() + chiffreAffaires * tauxCommission;
    }

}
