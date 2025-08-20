package encapsulamento;

import java.math.BigDecimal;

public class Product {
	
	private String name;
	private BigDecimal preco;
	private boolean ativo;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
	    if (preco.compareTo(BigDecimal.ZERO) < 0) {
	        throw new IllegalArgumentException("Preço não pode ser negativo");
	    }
	    this.preco = preco;
	}


	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	
	//CRIANDO MÉTODOS
	public void desativar() {
		if (this.ativo) {
			this.ativo = false;
		}
		 
	}

}
