package fr.univ_amu.iut;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Tristan Dietz
 */
public class Entreprise {

    private String nomEnt;
    private List<Employe> listEmp;

    public Entreprise(String nomEnt) {
        this.nomEnt = nomEnt;
        this.listEmp = new ArrayList<Employe>();
    }

    public void setNomEnt(String nomEnt) {
        this.nomEnt = nomEnt;
    }

    public void embaucher(Employe emp) {
        listEmp.add(emp);
    }

    public void licencier(Employe emp) {
        listEmp.remove(emp);
    }

    public boolean contains (Employe emp) {
        return listEmp.contains(emp);
    }

    @Override
    public String toString() {
        return "Entreprise{" +
                "nomEnt='" + nomEnt + '\'' +
                ", listEmp=" + listEmp +
                '}';
    }
}
