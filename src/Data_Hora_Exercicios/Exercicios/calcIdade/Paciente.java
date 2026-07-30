package Data_Hora_Exercicios.Exercicios.calcIdade;

import java.time.LocalDate;

public class Paciente {
    private String nome;
    private LocalDate dataNascimento;

    public Paciente(String nome, LocalDate dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
}
