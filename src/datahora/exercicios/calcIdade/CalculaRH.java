package datahora.exercicios.calcIdade;

import java.time.LocalDate;
import java.time.Period;

public class CalculaRH {
    public void imprimirIdade(Paciente paciente) {
        LocalDate dataNasc = paciente.getDataNascimento();
        LocalDate dataAtual = LocalDate.now();

        Period periodo = Period.between(dataNasc,dataAtual);

        int ano = periodo.getYears();
        int mes = periodo.getMonths();
        int dia = periodo.getDays();

        System.out.println("Data de nascimento: " + dataNasc);
        System.out.println("Data Atual: " + dataAtual);
        System.out.println("Idade do paciente: " + paciente.getNome() + ": " + ano + " anos, " + mes + " meses e " + dia + " dias de vida!");

    }
}
