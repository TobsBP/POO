package Atividades.Atividade_19;

public class Conta {
    Pessoa titular = new Pessoa("Tobias", 2000);

    public void addCliente(Pessoa pessoa) {
        this.titular = pessoa;
    }

    public void sacar(float quantia) throws SaldoInsuficienteException {
        if (quantia > titular.getSaldo())
             System.out.println("Saldo suficiente");
        else
            throw new SaldoInsuficienteException("Saldo insuficiente");   
    }
}