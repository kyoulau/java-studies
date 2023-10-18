package PolimorfismoSobrescritaDeMetodo;

public class Main {
    public static void main(String[] args) {
        Patinete p = new Patinete();
        Skate sk8t = new Skate();
        Surf surf = new Surf();
        EsporteRadical er = new EsporteRadical();

        p.manobra("Pular");
        sk8t.manobra("Ollie");
        surf.manobra("Tubo");
        er.manobras("nada...");
    }
}
