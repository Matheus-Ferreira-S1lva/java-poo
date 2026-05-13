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

        System.out.println();
        System.out.println("Dados do produto " + produto);

        System.out.println();
        System.out.println("Adicione quantidade no estoque do porduto: ");
        int quantidade = teclado.nextInt();
        produto.addProduto(quantidade);

        System.out.println();
        System.out.println("Estoque atualizado para " + produto);

        System.out.println();
        System.out.println("Remova quantidade do estoque do produto: ");
        quantidade = teclado.nextInt();
        produto.removerProdutos(quantidade);

        System.out.println();
        System.out.println("Dados do produto " + produto);

        teclado.close();
    }
}
