
package projetosmaiara;

import java.util.Scanner;

public class VerificarNumeroEntre10e40 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int numero;
        System.out.println("Digite algum n�mero: ");
        numero = ler.nextInt();
        
        
        
        if(numero >= 10 && numero <= 20){
            System.out.println("O n�mero digitado est� entre 10 e 20.");
        } else if(numero >= 30 && numero <= 40){
            System.out.println("O n�mero digitado est� entre 30 e 40.");
        } else {
            System.out.println("O n�mero digitado � maior que 40.");
        }
    }
}
