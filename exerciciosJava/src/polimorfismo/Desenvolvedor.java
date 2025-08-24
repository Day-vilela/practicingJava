package polimorfismo;

public class Desenvolvedor extends Funcionario {
	
	private String linguagem;
	
	public Desenvolvedor(String nome, double salario, String linguagem){
		super(nome, salario);
		this.linguagem = linguagem;
	}
	
	
	
	public void setLinguagem(String linguagem) {
		this.linguagem = linguagem;
	}



	public String getLinguagem() {
		return linguagem;
	}


	@Override
	public void trabalhar() {
		System.out.println(getNome() + " programando em " + getLinguagem() + ".");
	}
	
	@Override
	public double calcularSalario() {
		return getSalario();
	}
	
}
