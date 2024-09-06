package Aula_08.Pacote;

public class Conta {
    
    int saldo;
    public Object[] clientes;

    public int getSaldo(){
        return saldo;
    }

    public void deposito(int quantia){
        this.saldo = quantia;
    }


}
