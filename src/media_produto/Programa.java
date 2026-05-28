package media_produto;

import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantidades de produto: ");
        int n = teclado.nextInt();
        Sistema[] vetor = new Sistema[n];

        System.out.println();
        System.out.println("Digite o nome e o preço do produto");
        for (int i=0; i < vetor.length; i++) {
            teclado.nextLine();
            String nome = teclado.nextLine();
            double preco = teclado.nextDouble();
            vetor[i] = new Sistema(nome, preco);
        }

        double soma = 0.0;
            for (int  i = 0; i < vetor.length; i++) {
                soma += vetor[i].getPreco();
            }
            double media = soma / vetor.length;

            System.out.printf("Media preço = %.2f%n", media);

            teclado.close();
    }
}
