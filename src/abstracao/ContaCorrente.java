package abstracao;

 class ContaCorrente implements Conta {
     @Override
     public void FazerPix() {
         System.out.println("digite valor:");

     }

     @Override
     public void ConsultarSaldo() {
         System.out.println("seu saldo é 1234");

     }
     //implementação de interface.

}
