package Vetores;

import java.util.Scanner;

public class ProgramaVetores {
    public static void main(String[] args) {
        Scanner sc  = new Scanner( System.in );

        int n  = sc.nextInt();
        Produto[] vector  = new Produto[n];

        for (int i =0;i<n;i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();

            vector[i]= new Produto(name,price);
        }

        // instanciamento de um novo produto  e vect na posição i vai apontar para o objeto

        double soma= 0.0;
        for (int i=0; i<n; i++){
            soma+= vector[i].getPreco();
        }
        double media=soma/n;
        System.out.println("soma dos preços= "+soma);
        System.out.println("PREÇO MÉDIO: "+ media);
        for (Produto i: vector){
            System.out.println(i.toString());
        }
        sc.close();


    }
}
