package composicao.computador.application;

import composicao.computador.entities.Computador;
import composicao.computador.entities.Processador;

public class Programa {
    public static void main(String[] args) {
        Processador spec1 = new Processador("Intel i7 14700k", 5.6);
        Computador spec2 = new Computador("Lenovo", spec1);

        spec2.exibirConfig();
    }
}
