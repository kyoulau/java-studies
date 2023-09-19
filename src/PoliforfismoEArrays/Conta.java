package PoliforfismoEArrays;

public class Conta {
    protected String nometitutar;
    protected String numeroConta;
    protected double saldo;
    protected String dataAbertura;

    public Conta(String nometitutar, String numeroConta, double saldo, String dataabertura) {
        this.nometitutar = nometitutar;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.dataAbertura = dataabertura;
    }

    public double sacar(double valor) {
        if ((saldo - valor) < 0) {
            System.out.println("Saldo insuficiente");
            return -1;

        }
        this.saldo -= valor;
        return this.saldo;

    }
    public boolean depositar(double valor) {
        if (saldo <= 0) return false;

        this.saldo += valor;
        return true;
    }
    public String ImprimirTipoConta(String tipoConta){
        return String.format("Nome:%s, saldo=%.2f, data=%s",tipoConta,this.nometitutar,this.saldo, this.dataAbertura);

    }
}
