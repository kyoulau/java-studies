package heranca;

public class Peixe extends Animal{
    protected String caracteristica;
    public Peixe(String nome,
                 float comprimento,
                 int numeroDepatas,
                 String cor, String ambiente, float velocidadeMedia,String caracteristica) {
        super(nome, comprimento, numeroDepatas, cor, ambiente, velocidadeMedia);
        this.caracteristica = caracteristica;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }
    public void ImprimirDadosPeixe(){
        super.Imprimir();
        System.out.println("caracteristicas do peixe: "+ this.caracteristica);
    }
}
