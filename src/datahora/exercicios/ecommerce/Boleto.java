package datahora.exercicios.ecommerce;

import java.time.LocalDate;

public class Boleto {
    private String nomeCliente;
    private double valor;
    LocalDate dataEmissao;
    LocalDate dataVencimento;

    public Boleto(String nomeCliente, double valor, LocalDate dataEmissao, LocalDate dataVencimento) {
        this.nomeCliente = nomeCliente;
        this.valor = valor;
        this.dataEmissao = dataEmissao;
        this.dataVencimento = dataVencimento;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(LocalDate dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }
}
