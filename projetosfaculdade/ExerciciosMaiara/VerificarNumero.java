
package projetosmaiara;

import java.util.Scanner;

public class VerificarNumero {
    public static void main(String[] args) {
        Scanner ler =  new Scanner(System.in);

        float numero;
        System.out.println("Digite um número: ");
        numero = ler.nextFloat();
        
        if(numero >= 10 && numero <= 20){
            System.out.println("O número " + numero + " está entre 10 e 20.");
        } else {
            System.out.println("O número " + numero + " não está entre 10 e 20.");
        } 
    }
}
