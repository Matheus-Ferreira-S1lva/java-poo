package datahora.exercicios.calcIdade;

import java.time.LocalDate;

public class Programa {
    public static void main(String[] args) {
        LocalDate dataNasc = LocalDate.parse("2005-05-22");

        Paciente insercao = new Paciente("Julio", dataNasc);

        CalculaRH rh = new CalculaRH();

        rh.imprimirIdade(insercao);
    }
}
