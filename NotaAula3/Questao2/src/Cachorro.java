public class Cachorro extends Animal {

    public Cachorro() {
        super();
    }

    public Cachorro(String nome) {
        super(nome);
    }

    public void late() {
        System.out.println(getNome() + " está latindo");
    }
}

