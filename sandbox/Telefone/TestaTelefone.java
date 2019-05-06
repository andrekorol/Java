import java.util.Scanner;

public class TestaTelefone {
    public static void main(String[] args) {
        int[] vetor_duracao = new int[4];
        double[] vetor_preco = new double[4];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("Digite a duracao: ");
            vetor_duracao[i] = input.nextInt();
            System.out.println("Digite o preco: ");
            vetor_preco[i] = input.nextDouble();
            Telefone tel =  new Telefone(vetor_duracao[i], vetor_preco[i]);
            tel.setDuracaoLigacao(vetor_duracao[i]);
            tel.setAlterarPreco(vetor_preco[i]);
            tel.mostrarConta();
        }
        input.close();
    }
}
