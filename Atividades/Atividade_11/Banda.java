package Atividades.Atividade_11;

public class Banda {

    Musica musicas[] = new Musica[5];
    Membro membros[] = new Membro[5];
    Empresario empresario;
    String genero;
    String nome;

    Banda(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    void addMusica(Musica novaMusica) {
        for (int i = 0; i < musicas.length; i++) {
            if (musicas[i] == null) {
                musicas[i] = novaMusica;
                break;
            }
        }
    }

    void addMembro(Membro novoMembro) {
        for (int i = 0; i < membros.length; i++) {
            if (membros[i] == null) {
                membros[i] = novoMembro;
                break;
            }
        }
    }

    void mostraInfo() {
        System.out.println("A Banda: " + this.nome + " tem alguns participantes:");
        for (Membro membro : membros) {
            if (membro != null)
                System.out.println(membro.getNome());
        }
        
        System.out.println("A Banda: " + this.nome + " possui as seguintes musicas:");
        for (Musica musica : musicas) {
            if (musica != null)
                System.out.println(musica.getNome());
        }
    }

    void setEmpresario(Empresario empresario) {
        this.empresario = empresario;
    }
}