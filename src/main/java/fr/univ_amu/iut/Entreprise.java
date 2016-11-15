package fr.univ_amu.iut;

import java.io.Serializable;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class Entreprise implements Serializable
{
    /**
     *
     */
    private static final long serialVersionUID = -7035848791540274752L;
    private String nom;
    private List<Employe> listeEmployes = new LinkedList<Employe>();
    private int bonusTotal = 0;

    public void embaucher(Employe employe){listeEmployes.add(employe);}
    public void licencier(Employe employe){listeEmployes.remove(employe);}

    @Override
    public String toString() {
        return "Entreprise [nom=" + nom + ", listeEmploye=" + listeEmployes + "]";
    }

    public void setNom(String nom) {this.nom = nom;}
    public List<Employe> getListeEmployes() {
        return listeEmployes;
    }
    public void setBonusTotal(int i) {
        bonusTotal = i;

    }
    public void distribuerBonus() {
        PriorityQueue<Employe> queue = new PriorityQueue<Employe>(new Comparator<Employe>()
        {
            public int compare(Employe o1, Employe o2)
            {
                return o1.getAnciennete().compareTo(o2.getAnciennete());
            }
        });
        queue.addAll(listeEmployes);
        double bonusRestant = bonusTotal;

        while(!queue.isEmpty())
        {
            if(bonusRestant>0)
            {
                if(queue.peek().getAnciennete()*10 < bonusRestant)
                {
                    bonusRestant -= queue.peek().getAnciennete()*10;
                    queue.remove().setBonus(queue.peek().getAnciennete()*10);
                }
                else
                {
                    queue.remove().setBonus(bonusRestant);
                    bonusRestant = 0;
                }
            }
        }
    }

    public boolean contains(Employe emp) {
        return listeEmployes.contains(emp);
    }
}
