package polimorfismo;

public class Main {

	public static void main(String[] args) {
		Funcionario f1 = new Gerente("Carlos", 5000, 1200);
		Funcionario f2 = new Desenvolvedor("Ana", 4000, "Java");
		
		f1.trabalhar(); // Carlos está gerenciando a equipe.
 		f2.trabalhar(); // Ana está programando em Java.
	}
	
	// Aqui está o polimorfismo: mesmo método, mas comportamentos diferentes!

}
