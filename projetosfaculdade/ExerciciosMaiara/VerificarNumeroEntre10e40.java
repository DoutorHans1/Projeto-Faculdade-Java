
package projetosmaiara;

import java.util.Scanner;

public class VerificarNumeroEntre10e40 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int numero;
        System.out.println("Digite algum número: ");
        numero = ler.nextInt();
        
        
        
        if(numero >= 10 && numero <= 20){
            System.out.println("O número digitado está entre 10 e 20.");
        } else if(numero >= 30 && numero <= 40){
            System.out.println("O número digitado está entre 30 e 40.");
        } else {
            System.out.println("O número digitado é maior que 40.");
        }
    }
}
