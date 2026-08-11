package enumeracao_composicao.empresa;

public class Programa {
    public static void main(String[] args) {

        Funcionario funci = new Funcionario("José", 4500, NivelCargo.PLENO);

        System.out.println(funci);
    }
}
