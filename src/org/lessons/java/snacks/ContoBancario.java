//Crea una classe ContoBancario con attributi per numero di conto e saldo. Implementa un costruttore che accetta il numero di conto e inizializza il saldo a zero. Aggiungi metodi pubblici per depositare denaro sul conto, prelevare denaro dal conto e ottenere il saldo corrente.

package org.lessons.java.snacks;

import java.math.BigDecimal;

public class ContoBancario {

    // attributi

    private int numeroConto;
    private BigDecimal saldo;

    // costruttori

    public ContoBancario(int numeroConto) {
        this.numeroConto = numeroConto;
        this.saldo = BigDecimal.ZERO;
    }

    // metodi

    public int getNumeroConto() {
        return this.numeroConto;
    }

    public void setNumeroConto(int numeroConto) {
        this.numeroConto = numeroConto;
    }

    public BigDecimal getSaldo() {
        return this.saldo;
    }

    // divido setSaldo in deposito e prelievo

    public void deposito(BigDecimal importo) {
        this.saldo = this.saldo.add(importo);
    }

    public void prelievo(BigDecimal importo) {
        this.saldo = this.saldo.subtract((importo));
    }
}
