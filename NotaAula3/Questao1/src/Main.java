public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Paulo", 2005, 2500);
        Gerente gerente = new Gerente("Luis", 2005, 5000, "Help Desk");
        Programador programador = new Programador("Felipe", 2000, 15000, "java");

        funcionario.calcularIdade();
        funcionario.informarSalario();

        gerente.informarProjeto();

        programador.informarLinguagem();
    }
}