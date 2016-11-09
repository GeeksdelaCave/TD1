package fr.univ_amu.iut;

import java.time.LocalDate;

/**
 * @author Tristan Dietz
 */

public class EmployeOrdinaire extends Employe {

    public EmployeOrdinaire(int numEmp, String nomEmp, String prenomEmp, LocalDate dateNaissEmp) {
        super(numEmp, nomEmp, prenomEmp, dateNaissEmp);
    }

    @Override
    public double getSalaireBrut() {
        return super.getSalaireBrut() + getEchelonEmp() * 100;
    }

}
