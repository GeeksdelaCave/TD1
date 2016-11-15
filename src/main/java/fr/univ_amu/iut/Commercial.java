package fr.univ_amu.iut;

import java.time.LocalDate;

/**
 * @brief Classe Commercial, étendue d'Employe
 * @author Tristan Dietz
 * @class Commercial
 * @file Commercial.java
 */

public class Commercial extends Employe
{
    /**
     * Données membres
     */
    private double tauxCommission;
    private double chiffreAffaires;

    /**
     * Constructeur de la classe Commercial
     * @param numero Identifiant unique pour chaque Commercial
     * @param nom Nom du commercial
     * @param prenom Prénom du commercial
     * @param echelon Échelon du commercial
     * @param dateDeNaissance Date de naissance du commercial
     * @param dateDEmbauche Date d'embauche du commercial
     * @param base Base de paye du commercial
     * @param nbHeures Nombre d'heures du commercial
     */
    public Commercial(int numero, String nom, String prenom, int echelon, LocalDate dateDeNaissance,
                      LocalDate dateDEmbauche, double base, double nbHeures) {
        super(numero, nom, prenom, echelon, dateDeNaissance, dateDEmbauche, base, nbHeures);
    }

    /**
     * Définit le taux de commission du commercial
     * @param tauxCommission
     */
    public void setTauxCommission(double tauxCommission) {
        this.tauxCommission = tauxCommission;
    }

    /**
     * Définit le chiffre d'affaires du commercial
     * @param chiffreAffaires
     */
    public void setChiffreAffaires(double chiffreAffaires) {
        this.chiffreAffaires = chiffreAffaires;
    }

    /**
     * Accesseur du salaire brut
     * @return Retourne le salaire brut
     */
    public double getSalaireBrut(){return base+chiffreAffaires*tauxCommission;}
}
