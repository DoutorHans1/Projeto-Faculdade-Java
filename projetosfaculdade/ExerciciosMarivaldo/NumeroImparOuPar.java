
package projetosmarivaldo;

import java.util.Scanner;

public class NumeroImparOuPar {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double numero;
        
        System.out.println("Digite um número: ");
        numero = ler.nextDouble();
        
        if(numero % 2 == 0){
            System.out.println("Número par.");
        } else {
            System.out.println("Número ímpar.");
        }
        
    }
 
}
