package fr.univ_amu.iut;

import java.time.LocalDate;

/**
 * @brief Classe EmployeOrdinaire, étendue d'Employe
 * @author Tristan Dietz
 * @class EmployeOrdinaire
 * @file EmployeOrdinaire.java
 */

public class EmployeOrdinaire extends Employe
{
    /**
     * Constructeur de la classe EmployeOrdinaire
     * @param numero Identifiant unique pour chaque EmployeOrdinaire
     * @param nom Nom de l'employé ordinaire
     * @param prenom Prénom de l'employé ordinaire
     * @param echelon Échelon de l'employé ordinaire
     * @param dateDeNaissance Date de naissance de l'employé ordinaire
     * @param dateDEmbauche Date d'embauche de l'employé ordinaire
     * @param base Base de paye de l'employé ordinaire
     * @param nbHeures Nombre d'heures de l'employé ordinaire
     */
    public EmployeOrdinaire(int numero, String nom, String prenom, int echelon, LocalDate dateDeNaissance,
                            LocalDate dateDEmbauche, double base, double nbHeures) {
        super(numero, nom, prenom, echelon, dateDeNaissance, dateDEmbauche, base, nbHeures);
    }

    /**
     * Accesseur du salaire brut
     * @return Retourne le salaire brut
     */
    public double getSalaireBrut(){return super.getSalaireBrut()+echelon*100;}
}
