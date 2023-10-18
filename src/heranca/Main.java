package heranca;

public class Main {
    public static void main(String[] args) {
        mamifero camelo = new mamifero("Camelo",150,4,"Amarelo","terra",2,"Penas");
        Peixe tubarao = new Peixe("Tubarão",300,0,"cinza","mar",15,"Barbanata e cauda");
        mamifero ursocanada = new mamifero("Urso canada",180,4,"vermelho","terra",05,"Mel");
        camelo.ImprimirDadosMamifero();
        tubarao.ImprimirDadosPeixe();
        ursocanada.ImprimirDadosMamifero();
    }
}
