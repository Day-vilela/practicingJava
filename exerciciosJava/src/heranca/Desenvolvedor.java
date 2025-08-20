package heranca;

//CLASS FILHA
public class Desenvolvedor extends Funcionario {
	private String linguagemDeProgramacao;

	public String getLinguagemDeProgramacao() {
		return linguagemDeProgramacao;
	}

	public void setLinguagemDeProgramacao(String linguagemDeProgramacao) {
		this.linguagemDeProgramacao = linguagemDeProgramacao;
	}
	
	//METODO 
	public void programar() {
		System.out.println("Programando em Java...");
	}
}
