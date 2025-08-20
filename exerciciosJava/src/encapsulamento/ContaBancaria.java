package encapsulamento;

import java.math.BigDecimal;

public class ContaBancaria {
	
	private BigDecimal saldo = BigDecimal.ZERO;
	private String titular;
	
	// GETTERS AND SETTERS 
	public BigDecimal getSaldo() {
		return saldo;
	}
	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	// MÉTODOS 
	
	public void depositar(BigDecimal valor) {
		if (valor.compareTo(BigDecimal.ZERO)<=0) {
			throw new IllegalArgumentException("Só é possível depositar valores positivos.");
		}
		
		this.saldo = this.saldo.add(valor);
	}
	
	public void sacar(BigDecimal valor) {
		if (this.saldo.compareTo(valor) < 0) {
			throw new IllegalArgumentException("Saldo insuficiente!");
		}
		
		this.saldo = this.saldo.subtract(valor);
	}
	
	

}
