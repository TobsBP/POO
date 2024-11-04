package Atividades.Atividade_19;

public class Main {
    public static void main(String[] args) {
        Conta conta_0 = new Conta();
        Conta conta_1 = new Conta();
        Pessoa cliente_0 = new Pessoa("Tobias", 2000);
        Pessoa cliente_1 = new Pessoa("Caio", 50);

        conta_0.addCliente(cliente_0);
        conta_1.addCliente(cliente_1);
        
        try {
            conta_0.sacar(100);
        } catch (SaldoInsuficienteException e) {
            System.out.println("Saldo insuficiente");
        }
    }
}
