package org.lessons.java.snacks;

public class RegistroStudenti {
    private Studente[] registro;

    public RegistroStudenti() {
        this.registro = new Studente[0];
    }

    public Studente[] getRegistro() {
        return this.registro;
    }

    public void setRegistro(Studente[] registro) {
        this.registro = registro;
    }

    public void newStudent(Studente studente) {
        // creo un nuovo array lungo quanto l'originale + 1
        Studente[] registronew = new Studente[this.registro.length + 1];
        // copio i dati del primo array nel secondo, a cui rimane uno spazio vuoto in
        // fondo
        for (int i = 0; i < this.registro.length; i++) {
            registronew[i] = this.registro[i];
        }
        // occupo l'ultimo spazio col nuovo studente
        registronew[registronew.length - 1] = studente;
        // sovrascrivo il vecchio registro col nuovo
        this.registro = registronew;
    }

    @Override
    public String toString() {
        String output = "Registro studenti: ";
        for (Studente studente : this.registro) {
            output += String.format(" %s;", studente.getStudente());
        }
        return output;
    }
}
