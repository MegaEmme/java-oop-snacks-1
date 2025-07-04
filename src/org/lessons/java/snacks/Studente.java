package org.lessons.java.snacks;

public class Studente {

    // attributi

    private String nome;
    private String cognome;
    private int eta;

    // costruttori

    public Studente(String nome, String cognome, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    // metodi

    public String getStudente() {
        return "Studente " + nome + " " + cognome + ", " + eta + " anni";
    }
}
