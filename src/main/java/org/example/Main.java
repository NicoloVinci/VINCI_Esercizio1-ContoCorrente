import org.example.SaldoInsufficienteException;

import static java.lang.IO.println;
import static java.lang.IO.readln;
import static java.lang.Integer.parseInt;

void main() {
    int saldo = parseInt(readln("Inserisci il saldo del tuo conto corrente: "));
    println("Passa il tempo...");
    int prelievo = parseInt(readln("Inserisci la cifra che vuoi prelevare: "));
    try {
        saldo -= prelievo;
        if(saldo < 0) {
            throw new SaldoInsufficienteException("Saldo attuale: " + saldo + "\nCifra richiesta: " + prelievo);
        }
    } catch (SaldoInsufficienteException e) {
        e.getMessage();
    } finally {

    }

}