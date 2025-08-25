package abstracao;

public class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, double salario, double bonus) {
        super(nome, salario);
        this.bonus = bonus;
    }

    @Override
    public void trabalhar() {
        System.out.println(getNome() + " está gerenciando a equipe...");
    }

    @Override
    public double calcularSalario() {
        return getSalario() + bonus;
    }
}
