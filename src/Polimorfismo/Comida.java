package Polimorfismo;

public class Comida {
    //referencia classe abstrata para uma classe concreta.
    //classes abstratas = classes que não possuem objetos pois são abstratas

    //vai apontar no mesmo endereço na memória? -Não
    //ebdereço na memória para cada método que varia de acordo com o objeto.
    //sobrecarga métodos - mesmo nome, parametros diferentes.
    //sobrecasrga de método-
    public void assar(Pizza pi){
        System.out.println("assando");
        pi.MostrarMensagem();
    }
    public void assar(Carne c){
        System.out.println("assando");
        c.MostrarMensagem();

    }
    public void assar(Pao p){
        System.out.println("assando");
        p.MostrarMensagem();

    }

}
