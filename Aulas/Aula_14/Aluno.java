package Aula_14;

public class Aluno implements Comparable <Aluno> {    
    private String nome;
    private int nota;

    Aluno(String nome, int nota) {
        this.nome = nome;
        this.nota = nota;
    }

    @Override
    public int compareTo(Aluno outro) {
        if (this.nota > outro.nota) 
            return -1;
        else if (this.nota < outro.nota) 
            return 1;
        else
            return 0;
    }

    public String getNome() {
        return nome;
    }

    public int getNota() {
        return nota;
    }

    
}
