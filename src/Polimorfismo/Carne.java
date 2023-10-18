package Polimorfismo;

public class Carne extends Comida {
    protected String corte;

    public Carne(String corte) {
        this.corte = corte;
    }
    public void MostrarMensagem(){
        System.out.println("Carne com corte "+ this.corte);
    }

}
