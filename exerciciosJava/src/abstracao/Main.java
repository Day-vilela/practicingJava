package abstracao;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Gerente("Carlos", 5000, 1200));
        funcionarios.add(new Desenvolvedor("Ana", 4000, "Java"));

        for (Funcionario f : funcionarios) {
            f.trabalhar();
            System.out.println("Salário final: " + f.calcularSalario());
        }
    }
}
