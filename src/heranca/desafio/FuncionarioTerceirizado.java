package heranca.desafio;

public class FuncionarioTerceirizado extends Funcionario {
    private Double cobrancaAdicional;

    public FuncionarioTerceirizado(String nome, Integer horas, Double valorPorHora, Double cobrancaAdicional) {
        super(nome, horas, valorPorHora);
        this.cobrancaAdicional = cobrancaAdicional;
    }

    @Override
    public double pagamentoComum() {
        return super.pagamentoComum() + (1.10 * cobrancaAdicional);
    }
}
