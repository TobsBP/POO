package Atividades.Atividade_11;

public class Membro{

	String nome, funcao;
   
	Membro(String nome, String funcao) {
		this.nome = nome;
		this.funcao = funcao;
	}

	String getNome() {
		return nome;
	}
	
	void setNome(String nome) {
		this.nome = nome;
	}
	
	String getFuncao() {
		return funcao;
	}
	
	void setFuncao(String funcao) {
		this.funcao = funcao;
	}

}