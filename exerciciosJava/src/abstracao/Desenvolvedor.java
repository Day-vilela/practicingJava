package abstracao;

public class Desenvolvedor extends Funcionario {
    private String linguagem;

    public Desenvolvedor(String nome, double salario, String linguagem) {
        super(nome, salario);
        this.linguagem = linguagem;
    }

    @Override
    public void trabalhar() {
        System.out.println(getNome() + " está programando em " + linguagem);
    }

    @Override
    public double calcularSalario() {
        return getSalario();
    }
}
