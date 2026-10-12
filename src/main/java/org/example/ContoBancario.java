package org.example;

public class ContoBancario {
    public double saldo;

    public ContoBancario(double saldo) {
        if(saldo <= 0) {
            throw new ImportoNonValidoException("Stai inserendo un saldo nullo o negativo.");
        } else {
            this.saldo = saldo;
        }
    }

    public void preleva(double cifra) throws SaldoInsufficienteException {
        if(cifra <= 0) {
            throw new ImportoNonValidoException("Stai richiedendo un prelievo nullo o negativo.");
        }
        if((saldo - cifra) < 0.0) {
            throw new SaldoInsufficienteException("Saldo non sufficiente.", saldo, cifra);
        } else {
            saldo -= cifra;
        }
    }
}