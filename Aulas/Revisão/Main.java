package Revisão;

import Revisão.Composição.Empresa;
import Revisão.Agregação.Cliente;
import Revisão.Agregação.Conta;

public class Main {
    public static void main(String[] args) {
        // Agregação: losango não esta preenchido, um cliente pode existir sem ter uma conta
        Conta conta = new Conta();
        Cliente cliente = new Cliente();

        cliente.setNome("Jorge");
        cliente.setCPF(1330460111);

        conta.titular = cliente;

        // Composição: losango preenchido, objeto parte não existe, não existe objeto todo
        Empresa empresa = new Empresa();
        
        empresa.setNome("MG SUL");
        empresa.departamento.setNome("Financeiro");
    }   
}