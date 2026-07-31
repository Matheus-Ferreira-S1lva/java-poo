package datahora.exercicios.ecommerce;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Financeiro {
    public void vencimento(Boleto boleto) {
        LocalDate venci = boleto.getDataVencimento();

        if (venci.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {
            LocalDate venciCorrigido = venci.plusDays(2);
            boleto.setDataVencimento(venciCorrigido);
        }
        else if (venci.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
            LocalDate venciCorrigido = venci.plusDays(1);
            boleto.setDataVencimento(venciCorrigido);
        }

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Cliente: " + boleto.getNomeCliente());
        System.out.println("Data Emissão: " + boleto.getDataEmissao());
        System.out.println("Vencimento Final: " + boleto.getDataVencimento().format(fmt));
    }
}
