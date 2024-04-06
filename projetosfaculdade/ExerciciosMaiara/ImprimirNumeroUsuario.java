
package projetosmaiara;

import java.util.Scanner;

public class ImprimirNumeroUsuario {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero;
        int numeroImprimir = 0;
        System.out.println("Digite um número inteiro: ");
        numero = ler.nextInt();
        
        while(numeroImprimir < numero){
            numeroImprimir++;
            System.out.println(numeroImprimir);
        }
    }
}
