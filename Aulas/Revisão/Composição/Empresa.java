package Revisão.Composição;

public class Empresa {
    public Departamento departamento;
    private String nome;
    private String cnpj;

    // Construtor
    public Empresa(){
        departamento = new Departamento();
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCnpj(String cnpj){
        this.cnpj = cnpj;
    }

    public String getNome(){
        return this.nome;
    }

    public String getCnpj(){
        return this.cnpj;
    }
}
