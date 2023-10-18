package Interface3;

public class Circulo extends  Figura{
    private double raio;
    public Circulo(double x, double y, int color, double raio) {
        super(x, y, color);
        this.raio = raio;
        desenhar();
    }

    @Override
    public void apagar() {
        System.out.println("Apagando circulo: " +x+ sep +y+sep+color+raio);
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando circulo: "+ x+sep+y+sep+color+raio);
    }
}
