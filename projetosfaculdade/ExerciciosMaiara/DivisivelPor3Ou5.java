
package projetosmaiara;

import java.util.Scanner;

public class DivisivelPor3Ou5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int numero;
        
        System.out.println("Digite um n�mero: ");
        numero = ler.nextInt();
        
        /*if(numero % 3 == 0 || numero % 5 == 0){
            System.out.println("� divis�vel por 5 ou por 3");
        } else {
            System.out.println("N�o � divis�vel por 3 e nem por 5.");
        }
        */
        if(numero % 3 == 0){
            System.out.println("O n�mero " + numero + " � divis�vel por 3.");
        } else if(numero % 5 == 0){
            System.out.println("O n�mero " + numero + " � divis�vel por 5.");
        } else {
            System.out.println("O n�mero " + numero + " n�o � divis�vel nem por 3 e nem por 5.");
        }
    }
}
