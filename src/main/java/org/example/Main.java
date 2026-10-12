import org.example.ContoBancario;
import org.example.ImportoNonValidoException;
import org.example.SaldoInsufficienteException;
import static java.lang.IO.println;

void main() {
    ContoBancario contoCorrente = new ContoBancario(413.31);
    try {
        contoCorrente.preleva(500.00);
    } catch (SaldoInsufficienteException e) {
        println(e.getMessage() + "\nTi mancano " + (e.cifra - e.saldo) + "€ per effettuare correttamente il prelievo");
    }
    finally {
        try {
            contoCorrente.preleva(-500.00);
        } catch (ImportoNonValidoException | SaldoInsufficienteException e) {
            println(e.getMessage());
        }
        try {
            contoCorrente.preleva(200.00);
            println("Saldo attuale: " + contoCorrente.saldo);
        } catch (SaldoInsufficienteException e) {
            println(e.getMessage() + "\nTi mancano " + (e.cifra - e.saldo) + "€ per effettuare correttamente il prelievo");
        }
    }
}