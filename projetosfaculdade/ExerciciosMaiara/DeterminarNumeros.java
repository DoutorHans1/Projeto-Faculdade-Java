
package projetosmaiara;

import java.util.Scanner;

public class DeterminarNumeros {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        float numero;
        System.out.println("Digite um número: ");
        numero = ler.nextFloat();

        if(numero < 0){
            System.out.println("O número " + numero + " é negativo.");
        } else if(numero > 0){
            System.out.println("O número " + numero + " é positivo.");
        } else {
            System.out.println("O número " + numero + " é nulo.");
        }



    }
}
