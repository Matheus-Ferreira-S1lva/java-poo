package datahora.exercicios.streaming;

import java.time.LocalDate;

public class Usuario {
    private String nome;
    private String plano;
    private LocalDate dataExpiracao;

    public String getNome() {
        return nome;
    }

    public String getPlano() {
        return plano;
    }

    public LocalDate getDataExpiracao() {
        return dataExpiracao;
    }

    public Usuario(String nome, String plano, LocalDate dataExpiracao) {
        this.nome = nome;
        this.plano = plano;
        this.dataExpiracao = dataExpiracao;
    }
}
