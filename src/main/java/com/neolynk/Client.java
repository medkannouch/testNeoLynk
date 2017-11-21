package com.neolynk;



import java.util.ArrayList;

public class Client {



    public Client() {
    }

    public Client(String nom, String prenom, String adresse, String telephone, String age) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.telephone = telephone;
        this.age = age;
    }
    private int id;
    private String nom;
    private String prenom;
    private String adresse;
    private String telephone;
    private String age;
    private ArrayList<CompteBancaire> comptesBancaire = new ArrayList<>();
    private double montantTotal;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public ArrayList<CompteBancaire> getComptesBancaire() {
        return comptesBancaire;
    }

    public void setComptesBancaire(ArrayList<CompteBancaire> comptesBancaire) {
        this.comptesBancaire = comptesBancaire;
    }

    public void verserArgent(double montant, CompteBancaire compte) {
        compte.setSolde(compte.getSolde() + montant);
    }

    public void retirerArgent(double montant, CompteBancaire compte) {
        if (montant > compte.getSolde()) {
            System.out.println("Fonds insuffisants");
        } else {
            compte.setSolde(compte.getSolde() - montant);
        }

    }

    public double getSoldeClient() {
        this.comptesBancaire.forEach((CompteBancaire compte) -> this.montantTotal += compte.getSolde());
        return this.montantTotal;
    }

    public void ajouterCompteBancaire(CompteBancaire compte){
        this.getComptesBancaire().add(compte);
    }
}
