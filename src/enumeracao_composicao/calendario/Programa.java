package enumeracao_composicao.calendario;

import java.util.Arrays;

public class Programa {
    public static void main(String[] args){

        Arrays.asList(DiaSemana.values()).forEach(dia ->
                System.out.println("Lista: " + dia)
        );
    }

}
