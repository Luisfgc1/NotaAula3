public class Gerente extends Funcionario {
    String projeto;

    public Gerente(String nome, int nasc, int salario, String projeto) {
        super(nome, nasc, salario);
        this.projeto = projeto;
    }

    public void informarProjeto() {
        System.out.println("O projeto do gerente " + nome + " faz um " + projeto);
    }
}
