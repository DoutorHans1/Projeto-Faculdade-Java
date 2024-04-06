
package projetosmaiara;

import java.util.Scanner;

public class VerificarNumeroMaiorQue50 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        int numero = ler.nextInt();
        
        if(numero > 0 && numero < 50){
            System.out.println("O número inserido é positivo e menor que 50.");
        } else if(numero % 2 == 1 && numero > 50){
            System.out.println("O número inserido é ímpar e maior que 50");
        }   
    }
}
