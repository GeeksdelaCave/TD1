package fr.univ_amu.iut;

import java.time.LocalDate;

public class Vendeur extends Commercial
{
    /**
     * Constructeur de la classe Vendeur
     * @param numero Identifiant unique pour chaque Vendeur
     * @param nom Nom du vendeur
     * @param prenom Prénom du vendeur
     * @param echelon Échelon du vendeur
     * @param dateDeNaissance Date de naissance du vendeur
     * @param dateDEmbauche Date d'embauche du vendeur
     * @param base Base de paye du vendeur
     * @param nbHeures Nombre d'heures du vendeur
     */
    public Vendeur(int numero, String nom, String prenom, int echelon, LocalDate dateDeNaissance,
                   LocalDate dateDEmbauche, double base, double nbHeures) {
        super(numero, nom, prenom, echelon, dateDeNaissance, dateDEmbauche, base, nbHeures);
        // TODO Auto-generated constructor stub
    }
}
