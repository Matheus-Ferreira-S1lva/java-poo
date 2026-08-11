package enumeracao_composicao.supermercado;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a forma de pagamento com letras maiúsculas");
        System.out.println("PIX");
        System.out.println("CARTAO");
        System.out.println("DINHEIRO");

        String pagamento = teclado.nextLine();

        FormaPagamento forma = FormaPagamento.valueOf(pagamento);

        System.out.println("Forma de pagamento escolhida: " + forma);
    }
}
