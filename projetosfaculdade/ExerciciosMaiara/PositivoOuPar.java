
package projetosmaiara;

import java.util.Scanner;

public class PositivoOuPar {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        int numero;
        
        System.out.println("Digite um n�mero: ");
        numero = ler.nextInt();
        
        if(numero >= 1 && numero % 2 == 0){
            System.out.println("O n�mero " + numero + " � positivo e par.");
        } else if(numero % 2 == 1) {
            System.out.println("O n�mero " + numero + " � positivo e �mpar.");
        } else {
            System.out.println("O n�mero " + numero + " � negativo.");
        }
    }
}
