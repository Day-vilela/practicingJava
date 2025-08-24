package polimorfismo;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Funcionario> funcionarios = new ArrayList<>();
		
		funcionarios.add(new Gerente("Carlos", 5000, 1200));
		funcionarios.add(new Gerente("Mariana", 7000, 2000));
		funcionarios.add(new Desenvolvedor("Ana", 4000, "Java"));
		funcionarios.add(new Desenvolvedor("Pedro", 4500, "Python"));
		
		for (Funcionario f : funcionarios) {
			System.out.println("------------------------------");
			System.out.println("Nome: " + f.getNome());
			
			if (f instanceof Gerente) {
				System.out.println("Cargo: Gerente");
			} else if (f instanceof Desenvolvedor){
				System.out.println("Cargo: Desenvolvedor");
			}
			
			System.out.println("Salário final: " + f.calcularSalario());
			f.trabalhar(); 
		}
		
	}
}
