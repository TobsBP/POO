package Atividades.Atividade_06;

public class Zumbi {
  double vida;
  String nome;

  void mostraVida(){
    System.out.print("O zumbi " + nome + " tem ");
    System.out.println(vida + " de vida");
  }

  boolean tranfereVida(Zumbi ZumbiAlvo, double quantia){
    if (vida <= quantia)
      return false;
    else{
      vida -= quantia;
      ZumbiAlvo.vida += quantia;
      return true;
    }
  }
}
