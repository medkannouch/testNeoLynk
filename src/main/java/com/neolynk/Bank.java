package com.neolynk;


import java.util.HashMap;

public class Bank {

    private HashMap<Integer, Client> listClient = new HashMap<>();
    private static int nbreClients = 0;


    public Client createClient(String nom, String prenom, String adresse, String telephone, String age) {
        return new Client(nom, prenom, adresse, telephone, age);
    }

    public void readClient() {
        this.listClient.forEach((Integer i, Client client) -> {
            System.out.println("Nom Client : " + client.getNom() + " \tPrenom Client  : " + client.getPrenom() + " \tSolde Client  : " + client.getSoldeClient() + " \tSolde Client  : " + client.getSoldeClient());
        });
    }

    public void deleteClient(Client client) {
        this.listClient.remove(client);
    }

    public void addClient(Client client) {
        client.setId(nbreClients);
        this.listClient.put(nbreClients, client);
        nbreClients++;
    }

    public void updateClient(Client clientold, Client clientNew){
        this.listClient.replace(clientold.getId(),clientold,clientNew);
    }
}
