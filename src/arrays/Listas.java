package arrays;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Listas {
    public static void main(String[] args){
        ArrayList<String> filmes = new ArrayList<>();
        filmes.add("Carros");
        filmes.add("De volta para o futuro");
        filmes.add("Irmãs vampiras");
        filmes.add("Barbie 1");
        filmes.add("Barbie2");
        //metedo que classifica em ordem alfabetica/numerica
        Collections.sort(filmes);
        for (String i : filmes ){
            System.out.print("Lista filmes para ver-");
            System.out.println(i);
        }

    }
}
