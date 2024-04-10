
package projetosmaiara;

import java.util.Scanner;

public class DivisivelPor3Ou5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int numero;
        
        System.out.println("Digite um número: ");
        numero = ler.nextInt();
        
        /*if(numero % 3 == 0 || numero % 5 == 0){
            System.out.println("É divisível por 5 ou por 3");
        } else {
            System.out.println("Não é divisível por 3 e nem por 5.");
        }
        */
        if(numero % 3 == 0){
            System.out.println("O número " + numero + " é divisível por 3.");
        } else if(numero % 5 == 0){
            System.out.println("O número " + numero + " é divisível por 5.");
        } else {
            System.out.println("O número " + numero + " não é divisível nem por 3 e nem por 5.");
        }
    }
}
