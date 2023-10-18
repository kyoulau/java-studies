package Interface3;

public abstract class Figura {
    protected String sep = "/";
    protected double x;
    protected double y;
    protected int color;

    public Figura(double x, double y, int color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }
    public void deslocar(double x, double y){
        apagar();
        this.x = x;
        this.y = y;
        desenhar();
    }
    public void colorir(int color){
        apagar();
        this.color = color;
        desenhar();
    }
    abstract public void apagar();
    abstract public void desenhar();
}
