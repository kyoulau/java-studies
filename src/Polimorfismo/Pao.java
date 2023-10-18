package Polimorfismo;

public class Pao extends Comida {
    protected String tipo;

    public Pao(String tipo) {
        this.tipo = tipo;
    }

    public void MostrarMensagem(){
        System.out.println("Pão do tipo "+ this.tipo);

    }
}
