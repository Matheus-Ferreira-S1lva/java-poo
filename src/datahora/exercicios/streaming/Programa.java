package datahora.exercicios.streaming;

import java.time.LocalDate;

public class Programa {
    public static void main(String[] args) {
        LocalDate dataExp = LocalDate.of(2026, 5, 10);
        LocalDate dataVal = LocalDate.of(2026, 11, 27);

        Usuario valida = new Usuario(
                "Flávio",
                "Delux",
                dataExp
        );

        ValidaAssinatura assinatura = new ValidaAssinatura();

        assinatura.verificaAcesso(valida);
    }
}
