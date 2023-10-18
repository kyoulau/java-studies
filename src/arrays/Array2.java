package arrays;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        double [] alturas = new double[n];

        for (int i =0; i<n; i++){
            alturas [i]= scanner.nextDouble();
        }
        double sum = 0.0;
        for (int i = 0; i<n;i++){
            sum += alturas[i];
        }
        double media = sum/n;
        System.out.println("MEDIA DE ALTURAS: "+ media);

        scanner.close();
    }
}
