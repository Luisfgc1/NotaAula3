public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Theo");
        Gato gato = new Gato("mingau");

        gato.mia();
        gato.caminha();

        cachorro.late();
        cachorro.caminha();
    }
}