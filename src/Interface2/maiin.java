package Interface2;

public class maiin {
    public static void main(String[] args) {
        Concursado joao = new Concursado(4000, 5);
        Temporario jose = new Temporario( 2000, 12);
        System.out.println( joao.salario_mensal() );
        System.out.println( jose.salario_mensal() );
        System.out.println(joao.gratificacao() );
        System.out.println(jose.gratificacao() );
    }
}
