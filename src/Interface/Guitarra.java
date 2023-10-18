package Interface;

public class Guitarra extends InstrumentoMusical{
    String GuitarraTipo;

    public Guitarra(String guitarraTipo) {
        GuitarraTipo = guitarraTipo;
    }

    @Override
    public void soar() {
        System.out.println("Guitarra do tipo" + this.GuitarraTipo+ " está tocando");
    }
}
