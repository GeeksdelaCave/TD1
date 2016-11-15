package fr.univ_amu.iut;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * @brief Interface Employe
 * @author Tristan Dietz
 * @class Employe
 * @file Employe.java
 */

public abstract class Employe implements Serializable
{
    /**
     * Données membres
     */
    protected int numero;
    protected String nom;
    protected String prenom;
    protected int echelon;
    protected LocalDate dateDeNaissance;
    protected LocalDate dateDEmbauche;
    protected double base;
    protected double nbHeures;
    protected double bonus;

    /**
     * Constructeur de l'interfae Employe
     * @param numero Identifiant unique pour chaque Employe
     * @param nom Nom de l'employé
     * @param prenom Prénom de l'employé
     * @param echelon Échelon de l'employé
     * @param dateDeNaissance Date de naissance de l'employé
     * @param dateDEmbauche Date d'embauche de l'employé
     * @param base Base de paye de l'employé
     * @param nbHeures Nombre d'heures de l'employé
     */
    public Employe(int numero, String nom, String prenom, int echelon, LocalDate dateDeNaissance, LocalDate dateDEmbauche, double base, double nbHeures) {
        this.numero = numero;
        this.nom = nom;
        this.prenom = prenom;
        this.echelon= echelon;
        this.dateDeNaissance = dateDeNaissance;
        this.dateDEmbauche = dateDEmbauche;
        this.base = base;
        this.nbHeures = nbHeures;
    }

    /**
     * Accesseur du salaire brut
     * @return Retourne le salaire brut
     */
    public double getSalaireBrut(){return base*nbHeures;}

    /**
     * Accesseur du salaire net
     * @return Retourne le salaire net
     */
    public double getSalaireNet(){return getSalaireBrut()*0.8;}

    @Override
    public String toString() {
        return "Employe [numero=" + numero + ", nom=" + nom + ", prenom=" + prenom + ", echelon=" + echelon
                + ", dateDeNaissance=" + dateDeNaissance + ", dateDEmbauche=" + dateDEmbauche + ", base=" + base
                + ", nbHeures=" + nbHeures + ", bonus=" + bonus + "]";
    }

    /**
     * Accesseur de l'ancienneté
     * @return Retourne l'ancienneté
     */
    public Long getAnciennete() {
        return ChronoUnit.MONTHS.between(dateDEmbauche, LocalDate.now());
    }

    /**
     * Définit le bonus de l'employé
     * @param bonus
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

}
