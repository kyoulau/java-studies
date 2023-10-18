package Interface;

public class Main {
    public static void main(String[] args) {
        Guitarra guitarra = new Guitarra("De Heavy metal");
        guitarra.soar();
        Piano piano = new Piano();
        piano.soar();

        Piano p = new Piano();
        Guitarra g = new Guitarra("Furação");
        System.out.println("--------------------------------------------------");
        p.soar();
        g.soar();
        InstrumentoMusical x = p;
        x.soar();
        x = g;
        x.soar();

    }
}
