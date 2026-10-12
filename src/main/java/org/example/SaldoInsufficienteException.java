package org.example;

public class SaldoInsufficienteException extends Exception {
    public double saldo;
    public double cifra;
    public SaldoInsufficienteException(String message, double saldo, double cifra) {
        super(message);
        this.saldo = saldo;
        this.cifra = cifra;
    }
}