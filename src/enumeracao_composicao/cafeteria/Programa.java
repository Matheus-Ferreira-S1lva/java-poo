package enumeracao_composicao.cafeteria;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("O que você quer pedir? ");
        System.out.println("Opção 1: ESPRESSO");
        System.out.println("Opção 2: CAPPUCCINO");
        System.out.println("Opção 3: LATTE");
        int opcao = teclado.nextInt();
        TipoCafe escolha = null;
        if (opcao == 1) {
            escolha = TipoCafe.ESPRESSO;
        } else if (opcao == 2) {
            escolha = TipoCafe.CAPPUCCINO;
        } else if (opcao == 3) {
            escolha = TipoCafe.LATTE;
        } else {
            System.out.println("Opção invalida ou não selecionada, tente novamente!");
        }

        if(escolha != null) {
            switch (escolha) {
                case ESPRESSO:
                    System.out.println("Aqui está o seu café puro e forte!");
                    break;
                case CAPPUCCINO:
                    System.out.println("Seu Cappuccino cremoso saindo!");
                    break;
                case LATTE:
                    System.out.println("Um Latte saindo!");
                    break;
            }
        }
        teclado.close();
    }
}
