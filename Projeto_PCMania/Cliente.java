package Projeto_PCMania;

public class Cliente {
    private String nome;
    private long cpf;
    private int matricula;
    Computador computadorComprado[] = new Computador[3];

    Cliente(String nome, long cpf, int matricula) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
    }

    public void comprarComputador(Computador computador) {

        for (int i = 0; i < computadorComprado.length; i++) {
            if (computadorComprado[i] == null) {
                computadorComprado[i] = computador;
                break;
            }
        }
        System.out.println("----------------------------------------------------");
        System.out.println("Pc da " + computador.getMarca() +" adicionado ao carrinho " + " por R$ " + computador.getPreco());
    }

    float total = 0;
    public float calculaTotalCompra() {

        for (int i = 0; i < computadorComprado.length; i++) {
            if (computadorComprado[i] != null) {
                total += computadorComprado[i].getPreco();
            }   
        }

        return total;    
    }

    public String getNome() {
        return nome;
    }

    public long getCpf() {
        return cpf;
    }

    public int getMatricula() {
        return matricula;
    }
}