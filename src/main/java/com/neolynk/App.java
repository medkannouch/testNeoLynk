package com.neolynk;


public class App 
{
    public static void main( String[] args ){


        //creation de la variable globale
        Bank bank = new Bank();

        //creation du client
        Client client = bank.createClient("KANNOUCH","Mohamed","10 rue de la Toue 45100 Orléans","0752131304","26");
        Client client2 = bank.createClient("KANNOUCH","Hicham","10 rue de la Toue 45100 Orléans","0752131304","25");
        //Ajouter un client a la liste des clients
        bank.addClient(client);
        bank.addClient(client2);


        //creation des comptes bancaires
        CompteBancaire compte1 = new CompteBancaire();
        CompteBancaire compte2 = new CompteBancaire();

        //ajout du solde a chaque compte
        client.verserArgent(99,compte1);
        client.verserArgent(1.05,compte2);


        //lier un compte a un client
        client.ajouterCompteBancaire(compte1);
        client.ajouterCompteBancaire(compte2);



        //Lister tout les clients
        bank.readClient();
        System.out.println(client.getId());
        System.out.println(client2.getId());




    }
}
