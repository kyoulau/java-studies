package abstracao;

public class Main2 {
    public static void main(String[] args){
        System.out.println("olá, seja bem vido ao banco KL");
        ContaCorrente ccLaura = new ContaCorrente();
        ccLaura.ConsultarSaldo();
        ccLaura.FazerPix();

        ContaPoupanca cpLaura = new ContaPoupanca();
        cpLaura.FazerPix();
        cpLaura.ConsultarSaldo();

    }
}
