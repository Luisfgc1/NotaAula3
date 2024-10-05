public class Programador extends Funcionario {
    String linguagem;

    public Programador(String nome, int nasc, int salario, String linguagem) {
        super(nome, nasc, salario);
        this.linguagem = linguagem;
    }

    public void informarLinguagem() {
        System.out.println("A linguagem de " + nome + " é " + linguagem);
    }
}
