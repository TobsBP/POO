package Aula_04;

public class Conta {
  float saldo, limite;
  String nomeDono;
  int numero;

  void deposita(float quantia){
    saldo += quantia;
  }

  void saca(float quantia){
    saldo -= quantia;
  }

  void tranfere(Conta contaDestino, float quantia){
    saldo -= quantia;
    contaDestino.saldo += quantia;
  } 

  void mostrarsaldo(){
    System.out.println(saldo);
  }
}