public class Funcionario {
    String nome;
    int salario;
    int nasc;
    int idade;

    public Funcionario(String nome, int nasc, int salario) {
        this.nome = nome;
        this.nasc = nasc;
        this.salario = salario;
    }

    public void informarSalario() {
        System.out.println("O salário do funcionário " + nome + " é de R$: " + salario);
    }

    public void calcularIdade() {
        idade = 2024 - nasc;
        System.out.println("A idade de " + nome + " é " + idade);
    }
}

