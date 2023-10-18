package Abstracao2;

public class Main {
    public static void main(String[] args) {
        Piano p = new Piano();
        Guitarra g = new Guitarra();
        p.soar();
        g.soar();
        InstrumentoMusical x = p;
        x.soar();
        x = g;
        x.soar();

        System.out.println("---------------------------");


    }
}
