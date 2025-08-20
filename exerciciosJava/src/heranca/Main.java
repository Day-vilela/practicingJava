package heranca;

public class Main {

	public static void main(String[] args) {
		
		//CRIAÇÃO DO GERENTE
		Gerente gerente = new Gerente();
		gerente.setName("Vilela");
		gerente.setSalario(1600);
		gerente.setBonus(300);
		
		//CRIAÇÃO DO DESENVOLVEDOR
		Desenvolvedor dev = new Desenvolvedor();
		dev.setName("Ana");
		dev.setSalario(2500);
		dev.setLinguagemDeProgramacao("Java");
		
		//TESTANDO MÉTODOS ESPECÍFICOS E HERDADOS
		System.out.println("\n==== GERENTE ====");
		gerente.estado(); // HERDADO
		gerente.gerenciar(); // EXCLUSIVO
		System.out.println("Nome: " + gerente.getName());
		System.out.println("Salário: " + gerente.getSalario());
		System.out.println("Bônus: " + gerente.getBonus());
		
		System.out.println("\n==== DESENVOLVEDOR ====");
		dev.estado(); // HERDADO
		dev.programar(); // EXCLUSIVO
		System.out.println("Nome: " + dev.getName());
		System.out.println("Salário: " + dev.getSalario());
		System.out.println("Linguagem: " + dev.getLinguagemDeProgramacao());
		
	}

}
