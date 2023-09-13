package arrays;
import java.util.Arrays;
import java.util.List;

public class Array {
    public static void main(String[] args) {
        //declaração array:
        String[] palavras;

        //alocado o espaço na memória para 10 strings:
        palavras = new String[10];
        //para preencher um array (o de strings) utilizamos fill:
        Arrays.fill(palavras, "Isto é um array do tipo string: "+"c++, " +
                "indo ali, "+ "cabeça, " + "perna, "+"seis, "+
                "bolo, "+"casaco, "+"bonita, "+"unha, ");
        List<String> javaList = List.of(palavras);
        javaList.forEach(System.out::println);

        //aray declarado com  itens:
        int[] numeros = {1, 2, 3, 4, 5,6,7,8,9,10};

        //varios arrays declarados:
        int[] r = new int[44], k = new int[23];

        int [] numerosloucos = {10,20,30,40,50,60,70,80};
        int  tamanhoNumerosLoucos = numerosloucos.length;
        System.out.println(Arrays.toString(numerosloucos));
        System.out.println("tamanho array dos numeros loucos: "+ tamanhoNumerosLoucos);
        //posição sempre será tamanho-1 pois computador começa do 0

        String[] cars = {"Volvo", "BMW", "Ford"};
        for (String i : cars) {
            System.out.println(i);
        }

    }
}
