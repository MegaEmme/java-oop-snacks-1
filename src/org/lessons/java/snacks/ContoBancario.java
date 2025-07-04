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
        if (importo.compareTo(BigDecimal.ZERO) == 1) {
            this.saldo = this.saldo.add(importo);
        }
    }

    // importo.compareTo(BigDecimal.ZERO) confronta il valore di importo con zero.
    // Il metodo compareTo restituisce:
    // -1 se importo è minore di zero,
    // 0 se importo è uguale a zero,
    // 1 se importo è maggiore di zero.
    // Quindi, la condizione == 1 significa che il codice dentro l'if viene eseguito
    // solo se l'importo è maggiore di zero (cioè, solo se stai depositando una
    // somma positiva). In questo modo, si evita di depositare importi nulli o
    // negativi.

    public void prelievo(BigDecimal importo) {
        if (importo.compareTo(BigDecimal.ZERO) == 1 && this.saldo.compareTo(importo) == 1) {
            this.saldo = this.saldo.subtract((importo));
        }
    }

    // idem con ulteriore condizione che il saldo sia maggiore o al massimo uguale
    // alla somma da ritirare
    // cosi da non poter andare in negativo
}
