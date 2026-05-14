package empregado;

public class Funcionario {

    public String nome;
    public double salario;
    public double taxa;

    public double CalcSalario() {
        return salario - taxa;
    }

    public void CalcPorcento(double porcentagem) {
        this.salario = this.salario * (1.0 + (porcentagem / 100.0));
    }
}
