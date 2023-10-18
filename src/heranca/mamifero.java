package heranca;

public class mamifero extends Animal{
    protected String alimento;

    public mamifero(String nome, float comprimento, int numeroDepatas, String cor, String ambiente, float velocidadeMedia, String alimento) {
        super(nome, comprimento, numeroDepatas, cor, ambiente, velocidadeMedia);
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
    public void ImprimirDadosMamifero(){
        super.Imprimir();
        System.out.println("Alimento do mamifero: "+ this.alimento);
    }
}
