package abstracao;

class ContaPoupanca implements Conta {
    @Override
    public void FazerPix() {
        System.out.println("dando ruim");
    }

    @Override
    public void ConsultarSaldo() {
        System.out.println("seu saldo é 1234");
    }
}
