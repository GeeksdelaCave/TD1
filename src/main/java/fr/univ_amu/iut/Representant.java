package fr.univ_amu.iut;

import java.time.LocalDate;

/**
 * @brief Classe Representant, étendue d'Employe
 * @author Tristan Dietz
 * @class Representant
 * @file Representant.java
 */

public class Representant extends Commercial
{
    /**
     * Constructeur de la classe Representant
     * @param numero Identifiant unique pour chaque Representant
     * @param nom Nom du représentant
     * @param prenom Prénom du représentant
     * @param echelon Échelon du représentant
     * @param dateDeNaissance Date de naissance du représentant
     * @param dateDEmbauche Date d'embauche du représentant
     * @param base Base de paye du représentant
     * @param nbHeures Nombre d'heures du représentant
     */
    public Representant(int numero, String nom, String prenom, int echelon, LocalDate dateDeNaissance,
                        LocalDate dateDEmbauche, double base, double nbHeures) {
        super(numero, nom, prenom, echelon, dateDeNaissance, dateDEmbauche, base, nbHeures);
    }

    /**
     * Accesseur du salaire brut
     * @return Retourne le salaire brut
     */
    public double getSalaireBrut()
    {
        return new EmployeOrdinaire(0, "", "", 0, null, null, base, nbHeures).getSalaireBrut();
    }
}
