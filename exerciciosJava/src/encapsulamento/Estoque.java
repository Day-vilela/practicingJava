package encapsulamento;

public class Estoque {
	
	private int quantidade;
	
	//GETTER AND SETTERS
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	//MÉTODOS 
	public void adicionar(int qtd) {
		if (qtd <=0) {
			throw new IllegalArgumentException("Quantidade Inválida!");
		}
		
		this.quantidade += qtd;
	
	}
	
	public void remover(int qtd) {
		if (qtd > quantidade) {
			throw new IllegalArgumentException("Estoque Insuficiente!");
		}
		
		this.quantidade -= qtd;
	}
	
	public static void main(String[] args) {
		Estoque estoque = new Estoque();
		
		estoque.adicionar(10);
		System.out.println("Estoque após adicionar: " + estoque.getQuantidade());
		
		estoque.remover(3);
		System.out.println("Estoque após remover: " + estoque.getQuantidade());
		
		estoque.remover(20);
	}

}
