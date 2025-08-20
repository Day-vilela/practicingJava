package encapsulamento;

import java.math.BigDecimal;

public class Main{
	
	public static void main(String[] args) {
		
		ContaBancaria conta = new ContaBancaria();
		
		conta.setTitular("Vilela");
		
		conta.depositar(new BigDecimal("500"));
		
		conta.sacar(new BigDecimal("600"));
		
		System.out.println("Saldo final da conta de " + conta.getTitular() + ": " + conta.getSaldo());
		
	}
}
