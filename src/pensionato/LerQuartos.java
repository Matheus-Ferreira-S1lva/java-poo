package pensionato;

import java.util.Scanner;

public class LerQuartos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        VerificaQuartos verificaQuartos = new VerificaQuartos();

        String nome;
        String email;
        int posicao;

        System.out.print("Quantos quartos seram alugados? ");
        int tamanho = teclado.nextInt();

        for (int i=0; i < tamanho; i++) {
            System.out.println("Aluguel #"+ (i + 1) + ":");
            teclado.nextLine();

            System.out.print("Nome: ");
            nome = teclado.nextLine();

            System.out.print("Email: ");
            email = teclado.nextLine();

            System.out.print("Quarto: ");
            posicao = teclado.nextInt();

            verificaQuartos.alugarQuartos(posicao, nome, email);
        }

        verificaQuartos.Exibir();

        teclado.close();
    }
}
