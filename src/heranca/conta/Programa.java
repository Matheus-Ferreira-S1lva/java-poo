package heranca.conta;

public class Programa {

    public static void main(String[] args) {

        Account acc =  new Account(1001, "Alex", 0.0);

        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        // UPCASTING

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

        // DOWNCASTING

        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(100.0);

        if (acc3 instanceof BusinessAccount) {
            BusinessAccount acc5 = (BusinessAccount)acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount)acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

        /* Sobreposição, palavra super, anotação @Override*/

        // Sem a sobreposicao

        System.out.println("Sobreposição, palavra super, anotação @Override");
        Account sem = new Account(1090, "Alex", 1000.0);
        sem.withdraw(200.0);
        System.out.println(sem.getBalance());

        // Com sobreposicao

        Account com = new SavingsAccount(1080, "Maria", 1000.0, 0.01);
        com.withdraw(200.0);
        System.out.println(com.getBalance());

        // Usando o super

        Account sup = new BusinessAccount(1050, "Julia", 1000.0, 500.0);
        sup.withdraw(200.0);
        System.out.println(sup.getBalance());

    }
}
