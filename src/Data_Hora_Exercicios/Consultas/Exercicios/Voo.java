package Data_Hora_Exercicios.Consultas.Exercicios;

import java.time.LocalDateTime;

public class Voo {
    private String origem;
    private String destino;
    private LocalDateTime dataHoraPartida;
    private int duracaoHoras;
    private String fusoOrigem;
    private String fusoDestino;

    public Voo(String origem, String destino, LocalDateTime dataHoraPartida, int duracaoHoras, String fusoOrigem, String fusoDestino) {
        this.origem = origem;
        this.destino = destino;
        this.dataHoraPartida = dataHoraPartida;
        this.duracaoHoras = duracaoHoras;
        this.fusoOrigem = fusoOrigem;
        this.fusoDestino = fusoDestino;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public LocalDateTime getDataHoraPartida() {
        return dataHoraPartida;
    }

    public int getDuracaoHoras() {
        return duracaoHoras;
    }

    public String getFusoOrigem() {
        return fusoOrigem;
    }

    public String getFusoDestino() {
        return fusoDestino;
    }
}
