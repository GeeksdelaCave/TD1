package fr.univ_amu.iut;

import java.time.LocalDate;

/**
 * @author Tristan Dietz
 */

public class Technicien extends Employe {

    private int nbUnitesProduites;
    private double tauxCommissionUnite;

    public Technicien (int numEmp, String nomEmp, String prenomEmp, LocalDate dateNaissEmp) {
        super(numEmp, nomEmp, prenomEmp, dateNaissEmp);
    }

    public void setNbUnitesProduites(int nbUnitesProduites) {
        this.nbUnitesProduites = nbUnitesProduites;
    }

    public void setTauxCommissionUnite(double tauxCommissionUnite) {
        this.tauxCommissionUnite = tauxCommissionUnite;
    }

    @Override
    public double getSalaireBrut() {
        return super.getSalaireBrut() + nbUnitesProduites * tauxCommissionUnite;

    }

}
