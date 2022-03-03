/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package job;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author khali
 */
@ManagedBean
@RequestScoped
public class Employee {
    private String nom,prenom,grade,groupe;
    private int age;
    private double salaire;
    private double taxe,nette;
   static List<Employee> listemp=new ArrayList<Employee>();

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getTaxe() {
        return taxe;
    }

    public void setTaxe(double taxe) {
        this.taxe = taxe;
    }

    public double getNette() {
        return nette;
    }

    public void setNette(double nette) {
        this.nette = nette;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGroupe() {
        return groupe;
    }

    public void setGroupe(String groupe) {
        this.groupe = groupe;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public List<Employee> getListemp() {
        return listemp;
    }
    
    public void calculer()
    {
        taxe=0;
    if(this.salaire<2500)
    {
    this.taxe=this.salaire* 0.12;
    }
    else if(this.salaire<=4000)
    {
    this.taxe=this.salaire* 0.15;
    
    }
    else
        this.taxe=this.salaire*0.19;
    
        this.nette=salaire-taxe;

    }
    
    public String add()
    {
        this.calculer();
        
    listemp.add(this);
    
       return "index.xhtml?faces-redirect=true";

    }
    
    
    
}
