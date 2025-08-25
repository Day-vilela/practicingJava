package abstracao;

// VOCÊ FORÇA AS SUBCLASES A IMPLEMENTAR UM COMPORTAMENTO OU CRIA CONTRATOS COM INTERFACEIS

public abstract class Funcionario {
	//CLASE ABSTRATA
	private String nome;
	private double salario;
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	//METODO ABSTRATO -> MAIS OBRIGATORIO NAS SUBCLASSES
	public abstract void trabalhar();
	
	//MÉTODO ABSTRATO -> CADA FUNÇAÕ DEFINE COMO CALCULA
	public abstract double calcularSalario();
}
