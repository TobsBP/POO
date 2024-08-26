package Atividades.Atividade_10;

public class Main {

  public static void main(String args[]) {

    Empresario empresario = new Empresario("Felipe Neto", 33214511);

    Musica musica_01 = new Musica("Lier", 4.41);
    Musica musica_02 = new Musica("Belive", 3.21);
    Musica musica_03 = new Musica("Enemi", 31.1);

    Membro membro_01 = new Membro("Luca", "Guitarrista");
    Membro membro_02 = new Membro("Felipe", "Baterista");
    Membro membro_03 = new Membro("Matheus", "Cantor");

    Banda banda = new Banda("Jorges", "Musicazzz");
    banda.setEmpresario(empresario);

    banda.addMusica(musica_01);
    banda.addMusica(musica_02);
    banda.addMusica(musica_03);

    banda.addMembro(membro_01);
    banda.addMembro(membro_02);
    banda.addMembro(membro_03);

    banda.mostraInfo();
  }
}