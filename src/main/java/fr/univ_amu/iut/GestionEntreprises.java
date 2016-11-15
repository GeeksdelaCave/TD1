package fr.univ_amu.iut;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.Month;

public class GestionEntreprises
{
    public static void main(String[] args)
    {
        // ------- Ecriture
        ObjectOutputStream sortie = null;
        try
        {
            Entreprise maBoiteInfo = new Entreprise();
            maBoiteInfo.setNom("Ma boite info");
            Commercial balzac = new Commercial(1,
                    "Balzac", "Honoré",
                    1,
                    LocalDate.of(1950, Month.OCTOBER, 24),
                    LocalDate.of(1986, Month.NOVEMBER, 18),
                    12,135);
            balzac.setTauxCommission(0.8);
            balzac.setChiffreAffaires(3000);
            maBoiteInfo.embaucher(balzac);
            maBoiteInfo.embaucher(new Technicien(2,
                    "Isaac", "Newton",
                    1,
                    LocalDate.of(1945, Month.OCTOBER, 4),
                    LocalDate.of(1998, Month.NOVEMBER, 8),
                    12,135));
            maBoiteInfo.embaucher(new EmployeOrdinaire(3,
                    "Bob", "Dylan",
                    1,
                    LocalDate.of(1969, Month.OCTOBER, 2),
                    LocalDate.of(1995, Month.NOVEMBER, 1),
                    12,135));

            maBoiteInfo.setBonusTotal(5000);
            maBoiteInfo.distribuerBonus();

            for(Employe e : maBoiteInfo.getListeEmployes())
            {
                System.out.println(e);
                System.out.println("Salaire brut : " + (int)e.getSalaireBrut() + "; Salaire net : " + (int)e.getSalaireNet());
            }

            sortie = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("save.sav")));
            sortie.writeObject(maBoiteInfo);
            sortie.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        // ------- Lecture
        ObjectInputStream entree = null;
        try {
            entree = new ObjectInputStream(new BufferedInputStream(new FileInputStream("save.sav")));
            Entreprise maBoiteInfo = (Entreprise)entree.readObject();

            System.out.println(maBoiteInfo);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}