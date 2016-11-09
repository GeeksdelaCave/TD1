package fr.univ_amu.iut;

import java.time.LocalDate;

/**
 * @author Tristan Dietz
 */

public class Employe {

    private int numEmp;
    private String nomEmp;
    private String prenomEmp;
    private int echelonEmp;
    private LocalDate dateNaissEmp;
    private LocalDate dateEmbEmp;
    private double base;
    private double nbHeures;
    public Employe(int numEmp, String nomEmp, String prenomEmp, LocalDate dateNaissEmp) {
        this.numEmp = numEmp;
        this.nomEmp = nomEmp;
        this.prenomEmp = prenomEmp;
        this.dateNaissEmp = dateNaissEmp;
    }

    public int getEchelonEmp() {
        return echelonEmp;
    }

    public void setEchelonEmp(int echelonEmp) {
        this.echelonEmp = echelonEmp;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setDateEmbEmp(LocalDate dateEmbEmp) {
        this.dateEmbEmp = dateEmbEmp;
    }

    public void setNbHeures(double nbHeures) {
        this.nbHeures = nbHeures;
    }

    public double getSalaireBrut() {
        return base * nbHeures;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "numEmp=" + numEmp +
                ", nomEmp='" + nomEmp + '\'' +
                ", prenomEmp='" + prenomEmp + '\'' +
                ", echelonEmp=" + echelonEmp +
                ", dateNaissEmp=" + dateNaissEmp +
                ", dateEmbEmp=" + dateEmbEmp +
                ", base=" + base +
                ", nbHeures=" + nbHeures +
                '}';
    }

    public double getSalaireNet() {
        return getSalaireBrut() * 80 / 100;
    }
}
