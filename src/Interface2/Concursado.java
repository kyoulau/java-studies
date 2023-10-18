package Interface2;

class Concursado extends Funcionario implements gratificacao{
    private int anos_trabalho;
    public Concursado(double salario_base,
                      int anos_trabalho) {
        super(salario_base);
        this.anos_trabalho = anos_trabalho;
    }
     public double gratificacao() {
        return (anos_trabalho * 100);
    }
}
    /*Classe concreta sobrecarrega e implementa o método abstrato herdado*/
