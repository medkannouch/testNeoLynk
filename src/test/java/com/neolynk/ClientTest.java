package com.neolynk;

import junit.framework.TestCase;

public class ClientTest extends TestCase {


    public void setUp() throws Exception {
        super.setUp();

    }

    public void testVerserArgent() throws Exception {
        Client client = new Client();
        CompteBancaire compte = new CompteBancaire();
        client.ajouterCompteBancaire(compte);
        client.verserArgent(100,compte);
        assertEquals(100,(int)client.getSoldeClient());
    }

    public void testRetirerArgent() throws Exception {
        Client client = new Client();
        CompteBancaire compte = new CompteBancaire();
        client.ajouterCompteBancaire(compte);
        client.verserArgent(100,compte);
        client.retirerArgent(100,compte);
        assertEquals(0,(int)client.getSoldeClient());
    }

    public void testGetSoldeClient() throws Exception {
        Client client = new Client();
        CompteBancaire compte1 = new CompteBancaire();
        CompteBancaire compte2 = new CompteBancaire();
        client.ajouterCompteBancaire(compte1);
        client.ajouterCompteBancaire(compte2);
        client.verserArgent(100,compte1);
        client.verserArgent(100,compte2);

        assertEquals(200.0,client.getSoldeClient());
    }

}