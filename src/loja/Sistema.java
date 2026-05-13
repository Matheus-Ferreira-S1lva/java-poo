package loja;

import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Produto produto = new Produto();

        System.out.println("insira os dados do produto");
        System.out.print("Nome: ");
        produto.nome = teclado.nextLine();

        System.out.print("Preço: ");
        produto.preco = teclado.nextDouble();

        System.out.print("Quantidade em Estoque: ");
        produto.quantidade = teclado.nextInt();

        System.out.println(produto.nome + ", " + produto.preco + ", " + produto.quantidade);

        teclado.close();
    }
}
