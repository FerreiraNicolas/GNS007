/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.gns;

/**
 *
 * @author etudiant
 */
public class Joueur {


    private String nom;
    private String mdp;
    private String genre;
    private boolean cgu;
    
    public Joueur(String nom, String mdp, String genre, boolean cgu) {
        this.nom = nom;
        this.mdp = mdp;
        this.genre = genre;
        this.cgu = cgu;
    }

    public Joueur(String nom, String mdp, boolean cgu) {
        this.nom = nom;
        this.mdp = mdp;
        this.cgu = cgu;
    }

    public Joueur(String genre) {
        this.genre = genre;
    }

    public Joueur(boolean cgu) {
        this.cgu = cgu;
    }

    public Joueur(String nom, String mdp) {
        this.nom = nom;
        this.mdp = mdp;
    }

    @Override
    public String toString() {
        return "Joueur{" + "nom=" + nom + ", mdp=" + mdp + ", genre=" + genre + ", cgu=" + cgu + '}';
    }
    
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isCgu() {
        return cgu;
    }

    public void setCgu(boolean cgu) {
        this.cgu = cgu;
    }

    
}

