package polimorfismo;
//SOBRESCRITA DE MÉTODOS (Override)
//QUANDO UMA CLASSE FILHA PRECISA MUDAR O COMPORTAMENTO DE UM MÉTODO HERDADO

//POLIMORFISMO
//SE CRIAR LISTA (FUNCIONARIOSW), TANTO GERENTE QUANTO DESENVOLVEDOR PODEM ESTAR NELA
// SENDO CHAMADOS PELO METODO EM COMUM TRABALAR()

// SIMULANDO PACKEGE RH

public class Funcionario {
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
	
	//MÉTODO QUE SERÁ SOBRESCRITO
	public void trabalhar(){
		System.out.println(nome + " está trabalhando...");
	}
	
	public double calcularSalario() {
		return salario;
	}	
}
