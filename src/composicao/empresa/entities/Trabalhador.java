package composicao.empresa.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Trabalhador {
    private String nome;
    private NivelTrabalho nivel;
    private Double salarioBase;

    private Departamento departamento;
    private List<ContratoHora> contratos = new ArrayList<>();

    public Trabalhador() {
    }

    public Trabalhador(String nome, NivelTrabalho nivel, Double salarioBase, Departamento departamento) {
        this.nome = nome;
        this.nivel = nivel;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public NivelTrabalho getNivel() {
        return nivel;
    }

    public void setNivel(NivelTrabalho nivel) {
        this.nivel = nivel;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<ContratoHora> getContratos() {
        return contratos;
    }

    public void addContrato(ContratoHora contrato) {
        contratos.add(contrato);
    }

    public void removerContrato(ContratoHora contrato) {
        contratos.remove(contrato);
    }

     public double renda(int ano, int mes) {
        double soma = salarioBase;
        for (ContratoHora c : contratos) {
            if (c.getData().getYear() == ano && c.getData().getMonthValue() == mes) {
                soma += c.valorTotal();
            }
        }
        return soma;
    }
}