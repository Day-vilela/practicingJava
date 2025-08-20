package heranca;

//CLASS FILHA 
public class Gerente extends Funcionario {
	private double bonus;

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	//METODO
	public void gerenciar() {
		System.out.println("O gerente está gerenciando...");
	}

}
