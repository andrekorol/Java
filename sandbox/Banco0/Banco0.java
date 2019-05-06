public class Banco0 {
    public static void main(String[] args) {
        Conta0 c1 = new Conta0();
        Conta0 c2 = new Conta0();

        c1.titular = "Maria";
        c1.saldo = 100.0;
        c2.titular = "Jose";
        c2.saldo = 220.0;

        c1.deposito(325.95);
        c2.deposito(274.95);

        c1.mostraConta();
        c2.mostraConta();

        c1.mostraContaX();
        c2.mostraContaX();
    }
}
