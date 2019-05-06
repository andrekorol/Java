import java.util.Scanner;
import javax.swing.JOptionPane;

public class Conta0 {
    String titular;
    double saldo;

    public void deposito(double valor) {
        saldo += valor;
        return;
    }

    public void retirada(double valor) {
        saldo -= valor;
        return;
    }

    public void mostraConta() {
        System.out.println("Titular " + titular + "\n" + "saldo " + saldo);
    }

    public void mostraContaX() {
        String out = String.format("Titular = %s \n saldo = %.2f", titular, saldo);
        JOptionPane.showMessageDialog(null, out, "Dados Conta", JOptionPane.PLAIN_MESSAGE);
        return;
    }
}
