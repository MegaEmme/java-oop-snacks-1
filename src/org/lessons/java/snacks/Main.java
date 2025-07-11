package org.lessons.java.snacks;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {

        // snack 1

        Studente studenteUno = new Studente("Michelangelo", "Musco", 32);
        Studente studenteDue = new Studente("Giulia", "Rossi", 25);
        Studente studenteTre = new Studente("Luca", "Bianchi", 28);
        Studente studenteQuattro = new Studente("Sara", "Verdi", 22);

        // System.out.println(studenteUno.getStudente());
        // System.out.println(studenteQuattro.getStudente());

        // snack 2

        // ContoBancario contoUno = new ContoBancario(12345);
        // System.out.println("numero conto: " + contoUno.getNumeroConto());
        // System.out.println("Saldo del conto: " + contoUno.getSaldo().setScale(2) + "
        // Euro");
        // contoUno.deposito(BigDecimal.valueOf(1000));
        // System.out.println(
        // "Saldo del conto dopo versamento: " + contoUno.getSaldo().setScale(2,
        // RoundingMode.HALF_UP) + " Euro");
        // contoUno.prelievo(BigDecimal.valueOf(350));
        // System.out.println(
        // "Saldo del conto dopo prelievo: " + contoUno.getSaldo().setScale(2,
        // RoundingMode.HALF_UP) + " Euro");

        // snack 3

        RegistroStudenti registroStudenti = new RegistroStudenti();

        System.out.println(registroStudenti);

        registroStudenti.newStudent(studenteUno);
        registroStudenti.newStudent(studenteDue);

        System.out.println(registroStudenti.toString());

        registroStudenti.newStudent(studenteTre);
        registroStudenti.newStudent(studenteQuattro);

        System.out.println(registroStudenti.toString());
    }

}
