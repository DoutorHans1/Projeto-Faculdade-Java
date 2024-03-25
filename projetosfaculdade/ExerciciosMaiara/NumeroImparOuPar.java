
package projetosmaiara;

import java.util.Scanner;

public class NumeroImparOuPar {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int numero;
        System.out.println("Digite um número");
        numero = ler.nextInt();
        
        if(numero % 2 == 0){
            System.out.println("O número " + numero + " é par.");
        } else {
            System.out.println("O número " + numero + " é ímpar.");
        }   
    }
}
