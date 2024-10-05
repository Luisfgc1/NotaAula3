public class Animal {
    String nome;
    String raca;

    public Animal(String nome) {
        this.nome = nome;
        this.raca = "Desconhecida";
    }

    public Animal() {
        this.nome = "Leão";
        this.raca = "Desconhecida";
    }

    public void caminha() {
        System.out.println(this.nome + " está caminhando");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}

