package Interface2;

abstract class Funcionario implements gratificacao{
    private double salario_base;

    public Funcionario(double salario_base) {
        this.salario_base = salario_base;
    }

    public double salario_mensal() {
        double total = salario_base + gratificacao();
        return total;
    }
}


