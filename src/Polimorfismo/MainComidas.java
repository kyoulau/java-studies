package Polimorfismo;

public class MainComidas {
    public static void main(String[] args) {
        Carne carne = new Carne("maminha");
        Pizza pizza = new Pizza("4 Queijos");
        Pao pao = new Pao("Integral");

        Comida c = new Comida();
        carne.assar(carne);
        pizza.assar(pizza);
        pao.assar(pao);

    }
}
