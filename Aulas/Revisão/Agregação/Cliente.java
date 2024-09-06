package Revisão.Agregação;

public class Cliente {
    private String nome;
    private long cpf;
    
    public String getNome(){
        return this.nome;
    }

    public long getCPF(){
        return this.cpf;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCPF(long cpf){
        this.cpf = cpf;
    }

}
