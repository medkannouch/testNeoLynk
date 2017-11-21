package com.neolynk;


import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import java.util.Random;

public class CompteBancaire {

    private BigInteger numeroCompte;
    private double solde;
    private Date dateCreation;


    public CompteBancaire() {

        this.dateCreation = new Date();
        this.numeroCompte = new BigInteger(5, new Random());
    }

    public BigInteger getNumeroCompte() {
        return numeroCompte;
    }

    public void setNumeroCompte(BigInteger numeroCompte) {
        this.numeroCompte = numeroCompte;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

}
