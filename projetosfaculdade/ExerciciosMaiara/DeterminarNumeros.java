
package projetosmaiara;

import java.util.Scanner;

public class DeterminarNumeros {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        float numero;
        System.out.println("Digite um n�mero: ");
        numero = ler.nextFloat();

        if(numero < 0){
            System.out.println("O n�mero " + numero + " � negativo.");
        } else if(numero > 0){
            System.out.println("O n�mero " + numero + " � positivo.");
        } else {
            System.out.println("O n�mero " + numero + " � nulo.");
        }
    }
}
