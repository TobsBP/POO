package Revisão.Composição;

public class Departamento {
    private String nome;
    private int numFunc;

    public void setNumFunc(int numFunc){
        this.numFunc = numFunc;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public int getNumFunc(){
        return this.numFunc;
    }
}