package Projeto_PCMania;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Computador[] computadores = new Computador[3];
        MemoriaUSB msub[] = new MemoriaUSB[3];

        float valorTotal = 0;
        int opcao, compra;

        Scanner entrada = new Scanner(System.in);
        String nome;
        long cpf;
        int matricula;

        System.out.println("-------------------- Dados --------------------------");
        System.out.print("Digite seu nome: ");
        nome = entrada.next();

        System.out.print("Digite seu cpf: ");
        cpf = entrada.nextLong();

        System.out.print("Digite sua matricula: ");
        matricula = entrada.nextInt();

        Cliente cliente = new Cliente(nome, cpf, matricula);

        computadores[0] = new Computador(matricula, "Positivo");
        computadores[1] = new Computador(1234 + matricula, "Acer");
        computadores[2] = new Computador(5678 + matricula, "Vaio");

        msub[0] = new MemoriaUSB("Acompanha Pen Drive", 16);
        msub[1] = new MemoriaUSB("Acompanha Pen Drive", 32);
        msub[2] = new MemoriaUSB("Acompanha HD", 1);

        computadores[0].addMemoriaUSB(msub[0]);
        computadores[1].addMemoriaUSB(msub[1]);
        computadores[2].addMemoriaUSB(msub[2]);

        computadores[0].setSistemaOperacional(new SistemaOperacional("Linux Ubuntu", 32));
        computadores[0].addHardwareBasico(new HardwareBasico("Pentium Core i3", 3200));
        computadores[0].addHardwareBasico(new HardwareBasico("Memoria RAM", 8));
        computadores[0].addHardwareBasico(new HardwareBasico("Armazenamento HD", 500));

        computadores[1].setSistemaOperacional(new SistemaOperacional("Windows 8", 64));
        computadores[1].addHardwareBasico(new HardwareBasico("Pentium Core i7", 4500));
        computadores[1].addHardwareBasico(new HardwareBasico("Memoria RAM", 32));
        computadores[1].addHardwareBasico(new HardwareBasico("Armazenamento HD", 1));

        computadores[2].setSistemaOperacional(new SistemaOperacional("Windows 10", 64));
        computadores[2].addHardwareBasico(new HardwareBasico("Pentium Core i5", 3370));
        computadores[2].addHardwareBasico(new HardwareBasico("Memoria RAM", 16));
        computadores[2].addHardwareBasico(new HardwareBasico("Armazenamento HD", 2));

        do {
            System.out.println("--------------------- Menu -------------------------");
            System.out.println("1- Mostrar Promoções");
            System.out.println("2- Comprar");
            System.out.println("0- Sair");
            System.out.println("----------------------------------------------------");
            System.out.print("Opção: ");

            opcao = entrada.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("---------- Configurações dos Computadores ----------");
                    System.out.println("----------------------------------------------------");
                    for (int i = 0; i < computadores.length; i++) {
                        computadores[i].mostraPCConfigs();
                        System.out.println("----------------------------------------------------");

                    }
                    break;

                case 2:
                    System.out.println("---------------- Opção de compra -------------------");
                    System.out.println("Comprar (0- " + computadores[0].getMarca() +
                            " | 1- " + computadores[1].getMarca() + " | 2- " + computadores[2].getMarca() + ")");

                    System.out.print("Opção: ");
                    compra = entrada.nextInt();

                    if (opcao >= 3 || opcao <= -1) {
                        System.out.println("Número errado!");
                    } else {
                        cliente.comprarComputador(computadores[compra]);
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        entrada.close();

        valorTotal = cliente.calculaTotalCompra();

        System.out.println("--------------------- Extrato ----------------------");
        System.out.println("O cliente " + cliente.getNome() + " portador do CPF: " + cliente.getCpf());
        System.out.printf("Deve realizar o pagamento de: R$" + "%.2f ", valorTotal);
        System.out.println("reais.");
        System.out.println("----------------------------------------------------");
        System.out.println("------------------ PCs comprados ------------------");
        for (int j = 0; j < msub.length; j++) {
            if (cliente.computadorComprado[j] != null) {
                System.out.println("----------------------------------------------------");
                cliente.computadorComprado[j].mostraPCConfigs();
            }
        }
        System.out.println("----------------------------------------------------");
        System.out.println("Até a proxima!!");
        System.out.println("----------------------------------------------------");
    }
}