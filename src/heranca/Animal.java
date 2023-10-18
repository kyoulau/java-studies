package heranca;

public class Animal {
    protected String nome;
    protected float comprimento;
    protected int numeroDepatas;
    protected String cor;
    protected String ambiente;
    protected float velocidadeMedia;

    public Animal(String nome, float comprimento, int numeroDepatas, String cor, String ambiente, float velocidadeMedia) {
        this.nome = nome;
        this.comprimento = comprimento;
        this.numeroDepatas = numeroDepatas;
        this.cor = cor;
        this.ambiente = ambiente;
        this.velocidadeMedia = velocidadeMedia;
    }

    public void Imprimir() {
        System.out.println("Animal{" +
                "nome='" + this.nome + '\'' +
                ", comprimento=" + this.comprimento +
                ", numeroDepatas=" + this.numeroDepatas +
                ", cor='" + this.cor + '\'' +
                ", ambiente='" + this.ambiente + '\'' +
                ", velocidadeMedia=" + this.velocidadeMedia +
                '}');
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public void setNumeroDepatas(int numeroDepatas) {
        this.numeroDepatas = numeroDepatas;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public void setVelocidadeMedia(float velocidadeMedia) {
        this.velocidadeMedia = velocidadeMedia;
    }

    public String getNome() {
        return nome;
    }

    public float getComprimento() {
        return comprimento;
    }

    public int getNumeroDepatas() {
        return numeroDepatas;
    }

    public String getCor() {
        return cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public float getVelocidadeMedia() {
        return velocidadeMedia;
    }
}

