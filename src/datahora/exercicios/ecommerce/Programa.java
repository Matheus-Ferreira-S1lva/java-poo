package datahora.exercicios.ecommerce;

import java.time.LocalDate;

public class Programa {
    public static void main(String[] args) {
        LocalDate emissao = LocalDate.parse("2026-07-30");

        LocalDate venciIni = emissao.plusDays(10);

        Boleto boleto = new Boleto("José", 627.32, emissao, venciIni);

        Financeiro fina = new Financeiro();

        fina.vencimento(boleto);
    }
}
