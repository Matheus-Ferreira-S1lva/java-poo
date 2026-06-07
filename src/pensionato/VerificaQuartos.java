package pensionato;

public class VerificaQuartos {

    private Estudante[] quartos = new Estudante[10];

    public void alugarQuartos(int numeroQuarto, String nome, String email) {
        this.quartos[numeroQuarto] = new Estudante(nome, email);
    }

    public void Exibir() {
        System.out.println("Quartos ocupados: ");
        for(int i=0; i < quartos.length; i++) {
            if (quartos[i] != null) {
                System.out.println(i + ": " + quartos[i].getNome() + ", " + quartos[i].getEmail());
            }
        }
    }
}
