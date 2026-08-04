package datahora.exercicios.reunioesInternacionais;

import java.time.LocalDateTime;

public class Reuniao {
    private String assunto;
    private LocalDateTime dataHoraBase;
    private String fusoOrigem;

    public Reuniao(String assunto, LocalDateTime dataHoraBase, String fusoOrigem) {
        this.assunto = assunto;
        this.dataHoraBase = dataHoraBase;
        this.fusoOrigem = fusoOrigem;
   }

    public String getAssunto() {
        return assunto;
    }

    public LocalDateTime getDataHoraBase() {
        return dataHoraBase;
    }

    public String getFusoOrigem() {
        return fusoOrigem;
    }
}
