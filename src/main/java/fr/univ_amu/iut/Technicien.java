package fr.univ_amu.iut;

import java.time.LocalDate;

public class Technicien extends Employe
{
    /**
     * Données membres
     */
    private double tauxCommissionUnite;
    private double nbUnitesProduites;

    /**
     * Constructeur de la classe Technicien
     * @param numero Identifiant unique pour chaque Technicien
     * @param nom Nom du technicien
     * @param prenom Prénom du technicien
     * @param echelon Échelon du technicien
     * @param dateDeNaissance Date de naissance du technicien
     * @param dateDEmbauche Date d'embauche du technicien
     * @param base Base de paye du technicien
     * @param nbHeures Nombre d'heures du technicien
     */
    public Technicien(int numero, String nom, String prenom, int echelon, LocalDate dateDeNaissance,
                      LocalDate dateDEmbauche, double base, double nbHeures) {
        super(numero, nom, prenom, echelon, dateDeNaissance, dateDEmbauche, base, nbHeures);
    }

    /**
     * Accesseur du salaire brut
     * @return Retourne le salaire brut
     */
    public double getSalaireBrut(){return super.getSalaireBrut()+nbUnitesProduites*tauxCommissionUnite;}
}
