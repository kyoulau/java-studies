package Polimorfismo;

public class Pizza extends Comida{
    protected String sabor;

    public Pizza(String sabor) {
        this.sabor = sabor;
    }

    public void MostrarMensagem(){
        System.out.println("Pizza de "+ this.sabor);
    }
}
