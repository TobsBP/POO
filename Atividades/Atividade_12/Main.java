package Atividades.Atividade_12;

import Atividades.Atividade_12.br_inatel_cdg.Cliente;
import Atividades.Atividade_12.br_inatel_cdg.Conta;

public class Main{

    public static void main(String args[]){
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Jorge");
        cliente1.setCpf(1231256);

        Cliente cliente2 = new Cliente();
        cliente2.setNome("Pedro");
        cliente2.setCpf(92323);

        Cliente[] clientes = new Cliente[2];
        clientes[0] = cliente1;
        clientes[1] = cliente2;

        Conta conta = new Conta();
        conta.setClientes(clientes);
        conta.setLimite(500);
        conta.setNumero(1234);

        System.out.println(conta.getNumero());

        conta.setNumero(23);
        
        System.out.println(conta.getNumero());

    }

}